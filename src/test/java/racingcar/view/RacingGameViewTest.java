package racingcar.view;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

class RacingGameViewTest extends NsTest {

    @Test
    @DisplayName("잘못된 이름입력 시 ERROR 메시지가 출력되어야 한다.")
    void proxyTest() {
        assertSimpleTest(() -> {
            runException("abc,abcdefg");
            assertThat(output()).contains(RacingGameView.ERROR_MSG);
        });
    }


    @Override
    protected void runMain() {
        final RacingGameView racingGameView = new RacingGameViewProxy(new RacingGameViewImpl());
        racingGameView.createCars();
    }
}