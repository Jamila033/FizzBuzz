package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzTest {
    @Test
    void test_de_15_devrait_retourner_FizzBuzz() {
        assertThat(FizzBuzz.de(15)).isEqualTo("FizzBuzz");
    }
}