package hu.petrik.Exercise;

import hu.petrik.Stack.Stack;

public class Tukorszo {

    private static String szo;
    private static Stack<Character> verem;

    public static boolean Run(String bSzo) {

        Tukorszo.szo = bSzo;
        verem = new Stack<>();

        return isTukorszoE(bSzo);

    }

    private static boolean isTukorszoE(String s) {

        verem.empty();

        for (int i = 0; i < s.length() / 2; i++) {

            verem.push(s.charAt(i));

        }

        int masodikKezdes = s.length() / 2 + s.length() % 2;

        while (masodikKezdes < s.length() && s.charAt(masodikKezdes) == verem.pop()) {

            masodikKezdes++;

        }

        return masodikKezdes == s.length();

    }

    public static boolean isPalindromE(String mondat) {

        verem.empty();

        return isTukorszoE(mondat.trim());

    }

}
