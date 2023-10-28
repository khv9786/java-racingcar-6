package racingcar.model;

import racingcar.Message.ErrorMessage;

public class Count {
    private final int count;

    public Count(String countString) {
        this.count = StringtoIntCnt(countString);
        validateIsNatural(count);
    }

    private int StringtoIntCnt(String countString) {
        try {
            return Integer.parseInt(countString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.Cnt_Not_Number);
        }
    }

    private void validateIsNatural(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(ErrorMessage.Cnt_Not_Natural_Number);
        }
    }

}
