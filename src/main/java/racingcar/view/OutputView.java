package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Message.NoticeMessage;

public class OutputView {
    public static String printResult() {
        System.out.println(NoticeMessage.Result_Notice);
        return Console.readLine();
    }

    public static String printWinner() {
        System.out.println(NoticeMessage.Winner_Notice);
        return Console.readLine();
    }

    public static void printException(Exception exception) {
        System.out.println(exception.getMessage());
    }
}
