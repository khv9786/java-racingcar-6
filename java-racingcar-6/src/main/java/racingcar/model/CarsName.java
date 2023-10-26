package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.Message.ErrorMessage;

public class CarsName {
    private final String name;
    private int MAX_LENGTH = 5;
    // 이름 쉼표로 구분하고 리스트에 넣어야 함. 예외처리 확인 코드 작성필요.
    private final List<CarsName> carsnameList = new ArrayList<>();

    public CarsName(String name) {
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.Car_Name_Lenght);
        }
    }

    private void validateNull(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.Empty_Name);
        }
    }
}
