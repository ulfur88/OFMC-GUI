/*
 * BSD License
 *
 * Open Source Fixedpoint Model-Checker Graphical User Interface version 2019
 *
 * (C) Copyright Úlfur Jóhann Edvardsson 2019
 * (C) Copyright Veronica Julie Lodskov Hoffmann 2019
 *
 * All Rights Reserved.
 *
*/

package Controller;

import javafx.fxml.FXML;
import org.fxmisc.richtext.*;
import org.fxmisc.richtext.model.PlainTextChange;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.AwaitingEventStream;

import java.time.Duration;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProtocolEditor {

    private static Pattern PATTERN;

    @FXML
    private CodeArea protocolCodeArea;

    // Defining keywords for syntax
    private static final String[] KEYWORDS = new String[] {
            "Protocol", "Types", "Knowledge", "Actions", "Goals"
    };

    private static final String[] TYPES = new String[] {
            "Agent", "Number", "Function", "Symmetric_key"
    };

    private static final String[] BUILDIN_FUNCTIONS = new String[] {
            "sk", "exp", "inv", "pk"
    };

    private static final String[] OTHER = new String[] {
            "weakly", "authenticates", "where", "on", "secret", "between"
    };

    private static String[] AGENTS = new String[0];
    private static String[] NUMBERS = new String[0];
    private static String[] FUNCTIONS = new String[0];
    private static String[] SYMMETRIC_KEY = new String[0];

    // Defining patterns for syntax
    private static final String KEYWORD_PATTERN = createPattern(KEYWORDS);
    private static final String TYPES_PATTERN = createPattern(TYPES);
    private static final String BUILDIN_FUNCTIONS_PATTERN = createPattern(BUILDIN_FUNCTIONS);
    private static final String OTHER_PATTERN = createPattern(OTHER);
    private static String AGENTS_PATTERN;
    private static String NUMBERS_PATTERN;
    private static String FUNCTIONS_PATTERN;
    private static String SYMMETRIC_KEY_PATTERN;
    private static final String COMMENT_PATTERN = "#[^\\n]*";

    // Defining pattern for adding new agents
    private static final Pattern MATCHING_AGENTS_PATTERN = generateMatchingPattern("Agent");
    private static final Pattern MATCHING_NUMBERS_PATTERN = generateMatchingPattern("Number");
    private static final Pattern MATCHING_FUNCTIONS_PATTERN = generateMatchingPattern("Function");
    private static final Pattern MATCHING_SYMMETRIC_KEY_PATTERN = generateMatchingPattern("Symmetric_key");

    void initData(Controller controller) {

        // Get line numbering
        protocolCodeArea.setParagraphGraphicFactory(LineNumberFactory.get(protocolCodeArea));

        // Updates after changes are made
        onChange().subscribe(updateTypes -> updateTypes());
        onChange().subscribe(highlight -> updateSyntaxHighlighting(protocolCodeArea.getText()));
        onChange().subscribe(disableTrace -> controller.disableTrace());
        onChange().subscribe(disableAnalyse -> controller.disableAnalyse());
    }

    // Standard word pattern matching
    private static String createPattern(String[] typeToMatch) {
        return "\\b(" + String.join("|", typeToMatch) + ")\\b";
    }

    // Generate matching pattern for types
    private static Pattern generateMatchingPattern(String matchingType) {
        return Pattern.compile(matchingType + "\\s(\\w+(\\s*,\\s*\\w+)*)");
    }

    // Redefining patterns
    private static void redefinePatterns() {

        if (AGENTS.length != 0) {
            AGENTS_PATTERN = createPattern(AGENTS);
        }
        if (NUMBERS.length != 0) {
            NUMBERS_PATTERN = createPattern(NUMBERS);
        }
        if (FUNCTIONS.length != 0) {
            FUNCTIONS_PATTERN = createPattern(FUNCTIONS);
        }
        if (SYMMETRIC_KEY.length != 0) {
            SYMMETRIC_KEY_PATTERN = createPattern(SYMMETRIC_KEY);
        }

        compilePattern();
    }

    // Setting patterns for syntax
    private static void compilePattern() {
        PATTERN = Pattern.compile(
                "(?<COMMENT>" + COMMENT_PATTERN + ")" +
                "|(?<KEYWORD>" + KEYWORD_PATTERN + ")" +
                "|(?<TYPES>" + TYPES_PATTERN + ")" +
                "|(?<BUILDINFUNCTIONS>" + BUILDIN_FUNCTIONS_PATTERN + ")" +
                "|(?<OTHER>" + OTHER_PATTERN + ")" +
                "|(?<AGENTS>" + AGENTS_PATTERN + ")" +
                "|(?<NUMBERS>" + NUMBERS_PATTERN + ")" +
                "|(?<FUNCTIONS>" + FUNCTIONS_PATTERN + ")" +
                "|(?<SYMMETRICKEY>" + SYMMETRIC_KEY_PATTERN + ")"
        );
    }

    private void updateSyntaxHighlighting(String text) {
        protocolCodeArea.setStyleSpans(0, syntaxHighlighting(text));
    }

    private AwaitingEventStream<List<PlainTextChange>> onChange() {
        return protocolCodeArea.multiPlainChanges().successionEnds(Duration.ofMillis(500));
    }

    // Update arrays for types and redefine the patterns
    private void updateTypes() {
        AGENTS = getNewTypes(MATCHING_AGENTS_PATTERN);
        NUMBERS = getNewTypes(MATCHING_NUMBERS_PATTERN);
        FUNCTIONS = getNewTypes(MATCHING_FUNCTIONS_PATTERN);
        SYMMETRIC_KEY = getNewTypes(MATCHING_SYMMETRIC_KEY_PATTERN);

        redefinePatterns();
    }

    // Get types matching the given pattern
    private String[] getNewTypes(Pattern matchingPattern) {

        Matcher matcher = matchingPattern.matcher(protocolCodeArea.getText());

        StringBuilder newPatterns = new StringBuilder();

        boolean firstMatch = true;

        while (matcher.find()) {

            if (!firstMatch) {
                newPatterns.append(",");
            } else {
                firstMatch=false;
            }
            newPatterns.append(matcher.group(1));
        }

        if (newPatterns.length() != 0) {
            return newPatterns.toString().split(",");
        } else {
            return new String[0];
        }
    }

    // Generate the syntax highlighting
    private static StyleSpans<Collection<String>> syntaxHighlighting(String text) {

        Matcher matcher = PATTERN.matcher(text);

        int lastKeywordEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();

        while(matcher.find()) {

            String styleClass =
                    matcher.group("COMMENT") != null ? "comment" :
                    matcher.group("KEYWORD") != null ? "keyword" :
                    matcher.group("TYPES") != null ? "types" :
                    matcher.group("BUILDINFUNCTIONS") != null ? "functions" :
                    matcher.group("OTHER") != null ? "other" :
                    matcher.group("AGENTS") != null ? "agents" :
                    matcher.group("NUMBERS") != null ? "numbers" :
                    matcher.group("FUNCTIONS") != null ? "functions" :
                    matcher.group("SYMMETRICKEY") != null ? "symmetric-key" :
                    null;

            assert styleClass != null;


            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKeywordEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKeywordEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(),text.length() - lastKeywordEnd);
        return spansBuilder.create();
    }

    public CodeArea getProtocolCodeArea() {
        return protocolCodeArea;
    }
}
