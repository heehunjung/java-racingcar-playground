package racingcarGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcarGame.utils.SplitNames;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class splitUtilsTest {

    @Test
    void 입력_쉼표_구분자() {
        String input = "hhj,hhj2,hhj3";
        assertThat(SplitNames.splitName(input)).isEqualTo(new String[] { "hhj", "hhj2", "hhj3" });
    }
}
