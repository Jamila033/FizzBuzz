package com.controle.tdd;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzTest {
    /*FizzBuzz.de(1) à "1"
    FizzBuzz.de(3) à "Fizz"
    FizzBuzz.de(5) à "Buzz"
    FizzBuzz.de(6) à "Fizz"
    FizzBuzz.de(15) à "FizzBuzz"*/
    // Justification :
/* L'ordre est incrémental (baby steps).
 Le cas le plus restrictif (15) est en dernier pour
 forcer l'écriture de la condition la plus spécifique en premier
 lors de la phase GREEN correspondante*/
    @Test
    void FizzBuzz_de_1_retourne_1() {
        assertThat(FizzBuzz.de(1)).isEqualTo("1");}
}