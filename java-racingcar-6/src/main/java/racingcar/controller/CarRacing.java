package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.Count;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarRacing {
    private Cars cars;

    public void start() {
        getCarsName();
        getTryCount();
    }

    public Cars getCarsName() {
        try {
            return new Cars(InputView.inputCarsName());
        } catch (IllegalArgumentException e) {
            OutputView.printException(e);
            return getCarsName();
        }

    }

    private Count getTryCount() {
        try {
            return new Count(InputView.inputTrycnt());
        } catch (IllegalArgumentException e) {
            OutputView.printException(e);
            return getTryCount();
        }
    }
}
