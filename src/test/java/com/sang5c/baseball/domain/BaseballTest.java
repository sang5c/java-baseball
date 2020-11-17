package com.sang5c.baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class BaseballTest {

    @DisplayName("3개의 숫자 문자열로 야구 객체를 생성한다")
    @Test
    public void create() {
        assertThat(Baseball.of("123")).isNotNull();
    }

    @DisplayName("길이가 3이 아닌 경우 에러가 발생한다")
    @Test
    public void invalidLength() {
        assertThatIllegalArgumentException().isThrownBy(() -> Baseball.of("12"));
    }

    @DisplayName("숫자가 중복될 경우 에러가 발생한다")
    @Test
    public void duplicated() {
        assertThatIllegalArgumentException().isThrownBy(() -> Baseball.of("133"));
    }

    @DisplayName("3스트라이크 카운트 비교")
    @Test
    public void compareThreeStrike() {
        Baseball baseball = Baseball.of("123");
        BaseballCount baseballCount = baseball.compare(Baseball.of("123"));
        assertThat(baseballCount.isThreeStrike()).isTrue();
        assertThat(baseballCount.getBallCount()).isEqualTo(0);
    }

}
