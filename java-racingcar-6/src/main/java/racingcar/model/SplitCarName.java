package racingcar.model;

public class SplitCarName {
    private static final String DELIMITER = ",";

    public static String[] splitDelimiter(String inputCarsName) {
        return inputCarsName.split(DELIMITER);
    }

    public static String[] erageBlank(String[] array) {
        int length = array.length;
        String[] erageBlankArr = new String[length];
        for (int i = 0; i < length; i++) {
            erageBlankArr[i] = array[i].strip();
        }
        return erageBlankArr;
    }
}
