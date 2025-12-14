package com.controle.tdd;

public class FizzBuzz {

    public static String de(int nbre) {
        if (nbre % 3 == 0 && nbre % 5 == 0) { // Condition 1 : La plus spécifique
            return "FizzBuzz";
        }
        if (nbre % 3 == 0) { // Condition 2 : Reste des multiples de 3
            return "Fizz";
        }
        if (nbre % 5 == 0) { // Condition 3 : Reste des multiples de 5
            return "Buzz";
        }
        return String.valueOf(nbre); // Condition 4 : Cas par défaut
    }
}