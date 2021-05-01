package com.kinomora;

import java.util.Random;

public class Main {

    public static Random r = new Random();

    public static void main(String[] args) {
        int nameLength = r.nextInt(9) + 4;
        int quantityToGenerate = 16;
        StringBuilder generatedName = new StringBuilder();

        for (int i = 0; i <= quantityToGenerate; i++) {
            for (int j = 0; j <= nameLength; j++) {
                if ((j & 1) == 0) {
                    generatedName.append(getConsonant());
                } else {
                    generatedName.append(getVowel());
                }
            }
            System.out.println(generatedName.substring(0, 1).toUpperCase() + generatedName.substring(1));
            generatedName.setLength(0);
            nameLength = r.nextInt(9) + 4;
        }
    }

    public static char getVowel() {
        int j = r.nextInt(5);
        switch (j) {
            case 0: return 'a';
            case 1: return 'e';
            case 2: return 'i';
            case 3: return 'o';
            case 4: return 'u';
            default: return '0';
        }
    }

    public static char getConsonant() {
        int k = r.nextInt(19);
        switch (k) {
            case 0: return 'b';
            case 1: return 'c';
            case 2: return 'd';
            case 3: return 'f';
            case 4: return 'g';
            case 5: return 'h';
            case 6: return 'j';
            case 7: return 'k';
            case 8: return 'l';
            case 9: return 'm';
            case 10: return 'n';
            case 11: return 'p';
            case 12: return 'q';
            case 13: return 'r';
            case 14: return 's';
            case 15: return 't';
            case 16: return 'v';
            case 17: return 'w';
            case 18: return 'x';
            case 19: return 'y';
            case 20: return 'z';
            default: return '0';
        }
    }
}
