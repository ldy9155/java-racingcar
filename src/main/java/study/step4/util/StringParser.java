package study.step4.util;

public class StringParser {
    private StringParser() {
    }

    public static String[] impl(String input, String delimiter) {
        return input.split(delimiter);
    }
}