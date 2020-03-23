package WarAndPeace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public int search(String text, String word) {
        int counter = 0;
        Matcher matcher = buildMatcher(text, word);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    private Matcher buildMatcher(String text, String word) {
        Pattern pattern = Pattern.compile(word);
        return pattern.matcher(text);
        }
    }