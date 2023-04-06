package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringAddCalculatorTest {
  @ParameterizedTest
  @NullAndEmptySource
  @DisplayName("빈 문자열 또는 null 값 입력할 경우 0 반환 테스트")
  public void splitAndSum_null_또는_빈문자(String text) {
    int result = StringAddCalculator.splitAndSum(text);
    assertThat(result).isEqualTo(0);
  }

  @Test
  @DisplayName("숫자 하나만 입력하는 경우 해당 숫자 반환 테스트")
  public void splitAndSum_숫자하나() {
    int result = StringAddCalculator.splitAndSum("1");
    assertThat(result).isEqualTo(1);
  }

  @Test
  @DisplayName("숫자 두 개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합 반환 테스트")
  public void splitAndSum_쉼표구분자() {
    int result = StringAddCalculator.splitAndSum("1,2");
    assertThat(result).isEqualTo(3);
  }

  @ParameterizedTest
  @CsvSource(value = {"1,2=3", "1,2:3=6", "12:15,12=39"}, delimiter = '=')
  @DisplayName("숫자들을 컴마(,)와 콜론(:) 구분자로 입력할 경우 해당 숫자들의 합 반환 테스트")
  public void splitAndSum_쉼표_또는_콜론_구분자(String input, int expected) {
    int result = StringAddCalculator.splitAndSum(input);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  @DisplayName("//와 \n 문자 사이에 커스텀 구분자 지정 후 해당 숫자들의 합 반환 테스트")
  public void splitAndSum_custom_구분자() {
    int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
    assertThat(result).isEqualTo(6);
  }

  @ParameterizedTest
  @ValueSource(strings = {"-1,2,3", "a:2,3", "1:k:3"})
  @DisplayName("숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외 throw 테스트")
  public void splitAndSum_negative(String input) throws Exception {
    assertThatThrownBy(() -> StringAddCalculator.splitAndSum(input))
            .isInstanceOf(RuntimeException.class)
            .hasMessage("문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.");
  }
}