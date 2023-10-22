package baseball.view;

import static baseball.config.OutputViewConfig.*;

public class OutputView {
    public static void printRequestNumber() {
        System.out.print(REQUEST_PLAYER_NUMBER.getMessage());
    }

    public static void printInitialGameStart() {
        System.out.println(GAME_START.getMessage());
    }

    public static void printRequestRestartOrExit() {
        System.out.println(REQUEST_RESTART_OR_EXIT.getMessage());
    }

    public static void printNothing() {
        System.out.println(NOTHING.getMessage());
    }

    public static void printGameOver() {
        System.out.println(GAME_OVER.getMessage());
    }

    public static void printBallCount(int ballCount) {
        String result = String.format("%d볼", ballCount);
        System.out.println(result);
    }

    public static void printStrikeCount(int strikeCount) {
        String result = String.format("%d스트라이크", strikeCount);
        System.out.println(result);
    }

    public static void printBallAndStrikeCount(int ballCount, int strikeCount) {
        String result = String.format("%d볼 %d스트라이크", ballCount, strikeCount);
        System.out.println(result);
    }
}
