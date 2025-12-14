package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzTest {
    @Test
    void test_de_3_devrait_retourner_Fizz() {
        assertThat(FizzBuzz.de(3)).isEqualTo("Fizz");
    }
}