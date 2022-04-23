package racingcar.common.type;

import camp.nextstep.edu.missionutils.Randoms;

public class CarPosition {
    public static final int RANDOM_RANGE_MIN = 0;
    public static final int RANDOM_RANGE_MAX = 9;
    public static final int MOVING_FORWARD = 4;

    private int carPosition;

    public int getCarPosition() {
        return carPosition;
    }

    public void moveForwardRandom() {
        final int random = Randoms.pickNumberInRange(RANDOM_RANGE_MIN, RANDOM_RANGE_MAX);
        if (random >= MOVING_FORWARD) {
            moveForward();
        }
    }

    private void moveForward() {
        this.carPosition++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < carPosition; i++) {
            sb.append('-');
        }
        return sb.toString();
    }
}
