package step2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class InputString {
    private String[] arr;

    static InputString from(String input) {
        checkValidation(input);
        InputString inputString = new InputString();
        inputString.arr = input.split(" ");
        return inputString;
    }


    String get(int idx) {
        return arr[idx];
    }

    int getLength() {
        return arr.length;
    }


    private static void checkValidation(String str) {
        if (str == null || str.equals("") || str.split(" ").length % 2 == 0) {
            throw new IllegalArgumentException(str + "은 입력될 수 없습니다");
        }
    }


}