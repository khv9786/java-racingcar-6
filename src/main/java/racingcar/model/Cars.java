package racingcar.model;

import static racingcar.model.SplitCarName.erageBlank;
import static racingcar.model.SplitCarName.splitDelimiter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import racingcar.Message.ErrorMessage;

public class Cars {

    private final List<Cars> cars = new ArrayList<>();
    private final String LINE = System.lineSeparator();

    public List<Cars> getCars() {
        return cars;
    }

    public Cars(String carNames) {
        String[] carNameArr = erageBlank(splitDelimiter(carNames));
        validateDuplicatedName(carNameArr);
        for (String carName : carNameArr) {
            cars.add(new Cars(carName));
        }
    }

    private void validateDuplicatedName(String[] carName) {
        int before_duplicated_size = carName.length;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(carName));
        String[] resultArr = linkedHashSet.toArray(new String[0]);
        if (resultArr.length != before_duplicated_size) {
            throw new IllegalArgumentException(ErrorMessage.Duplicated_Name);
        }
    }
}