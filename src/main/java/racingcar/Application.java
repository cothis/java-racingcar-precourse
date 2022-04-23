package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.view.RacingGameView;
import racingcar.view.RacingGameViewImpl;
import racingcar.view.RacingGameViewProxy;

public class Application {
    public static void main(String[] args) {
        RacingGameView racingGameView = new RacingGameViewProxy(new RacingGameViewImpl());
        new RacingGameController(racingGameView).start();
    }
}
