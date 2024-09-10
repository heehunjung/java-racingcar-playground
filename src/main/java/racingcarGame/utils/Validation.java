package racingcarGame.utils;

public class Validation {
    public static boolean carNameValidator(String carName) {
        return carName.length() <= 5;
    }
}
