package racingcarGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    @Test
    void 차_1대_move_테스트() {
        Car car1 = new Car("hhj");
        Race race = new Race(car1);
        race.race();
        assertThat(car1.getLocation()).isEqualTo(1);
    }
}
