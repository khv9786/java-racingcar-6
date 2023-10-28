package racingcar.model;

import racingcar.Message.ErrorMessage;

public class CarsName {
    private final int MAX_LENGTH = 5;
    private final String carsname;

    public CarsName(String carsname) {
        validate();
        this.carsname = carsname;
    }


    public void validate() {
        validateLength();
        validateNull();
    }

    private void validateLength() {
        if (carsname.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.Car_Name_Lenght);
        }
    }

    private void validateNull() {
        if (carsname == null || carsname.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.Empty_Name);
        }
    }
}
