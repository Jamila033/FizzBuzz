package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzTest {
    @Test
    void test_de_6_devrait_retourner_Fizz() {
        assertThat(FizzBuzz.de(6)).isEqualTo("Fizz");
    }
}