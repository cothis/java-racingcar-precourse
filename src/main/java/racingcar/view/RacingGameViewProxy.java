package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;
import java.util.function.Supplier;

public class RacingGameViewProxy implements RacingGameView {
    private final RacingGameView racingGameView;

    public RacingGameViewProxy(RacingGameView racingGameView) {
        this.racingGameView = racingGameView;
    }

    @Override
    public Cars createCars() {
        return this.retryInsert(racingGameView::createCars);
    }

    @Override
    public int insertTryCount() {
        return this.retryInsert(racingGameView::insertTryCount);
    }

    @Override
    public void printExecute() {
        racingGameView.printExecute();
    }

    @Override
    public void printExecuteResult(List<Car> carList) {
        racingGameView.printExecuteResult(carList);
    }

    @Override
    public void printWinner(List<Car> carList) {
        racingGameView.printWinner(carList);
    }

    @Override
    public void printException(Exception e) {
        racingGameView.printException(e);
    }

    private <T> T retryInsert(Supplier<T> exec) {
        T result = null;
        while (result == null) {
            result = this.executeWithFailMessage(exec);
        }
        return result;
    }

    private <T> T executeWithFailMessage(Supplier<T> exec) {
        try {
            return exec.get();
        } catch (IllegalArgumentException e) {
            this.printException(e);
        }
        return null;
    }
}
