package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @DisplayName("콤마로 분리")
    @Test
    public void split() {
        String str = "1,2";
        assertThat(str.split(",")).contains("1", "2");
    }
}
