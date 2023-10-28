package racingcar.model;


public class Car {
    private final CarsName name;

    public Car(String CarsNameStr) {
        this.name = new CarsName(CarsNameStr);
    }

    public String getName() {
        return this.name.toString();
    }

}