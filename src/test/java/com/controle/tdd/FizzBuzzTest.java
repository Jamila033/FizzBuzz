package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzTest {
    @Test
    void test_de_5_devrait_retourner_Buzz() {
        assertThat(FizzBuzz.de(5)).isEqualTo("Buzz");
    }
}