package io.github.abelsromero.multis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringToolsTest {

    @Test
    void should_concat_empty() {
        String a = "";
        String b = "";

        String result = new StringTools().concat(a, b);

        assertThat(result).isEqualTo(" (default, 17)");
    }

    @Test
    void should_concat_values() {
        String a = "a";
        String b = "b";

        String result = new StringTools().concat(a, b);

        assertThat(result).isEqualTo("ab (default, 17)");
    }
}
