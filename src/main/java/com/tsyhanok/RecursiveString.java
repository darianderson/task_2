package com.tsyhanok;

public class RecursiveString {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String interviewRecursionTest(String line) {
        return interviewRecursionTest(line, new StringBuilder(), 0);
    }

    private String interviewRecursionTest(String fullLine, StringBuilder sb, int start) {

        char ch = fullLine.charAt(start);
        char next = findNext(fullLine, ch);

        if (isVowel(ch)) {
            sb.append("*");
            sb.append(ch);
            if (!isVowel(next) && !Character.isWhitespace(next)) {
                sb.append("*");
            }
        } else {
            sb.append(ch);
        }

        if (start < fullLine.length() - 1) {
            interviewRecursionTest(fullLine, sb, ++start);
        }

        return (sb.charAt(0) == '*') ? sb.deleteCharAt(0).toString() : sb.toString();
    }

    private boolean isVowel(char ch) {
        for (char character : VOWELS) {
            if (ch == character) {
                return true;
            }
        }
        return false;
    }

    private char findNext(String fullLine, char ch) {
        if (fullLine.indexOf(ch) + 1 < fullLine.length()) {
            return fullLine.charAt(fullLine.indexOf(ch) + 1);
        } else {
            return ' ';
        }
    }
}
