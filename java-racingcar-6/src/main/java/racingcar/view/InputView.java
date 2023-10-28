package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Message.NoticeMessage;

public class InputView {

    public static String inputCarsName() {
        System.out.println(NoticeMessage.Start_Notice);
        return Console.readLine();
    }

    public static String inputTrycnt() {
        System.out.println(NoticeMessage.Cnt_Notice);
        return Console.readLine();
    }
}
