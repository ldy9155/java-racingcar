package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void split(){
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1","2");
    }

    @Test
    void substring(){
        String result = "(1,2)".substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("예외 발생 테스트")
    void charAt(){
        assertThatThrownBy(() -> {
            char result = "abc".charAt(0);
            throw new IndexOutOfBoundsException("인덱스");

        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("인덱스 범위를 초과했습니다.");
    }
}
