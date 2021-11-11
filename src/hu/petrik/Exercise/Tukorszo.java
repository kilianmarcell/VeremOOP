package hu.petrik.Exercise;

import hu.petrik.Stack.Stack;

public class Tukorszo {

    private static String szo;
    private static Stack<String> verem;

    public static boolean Run(String bSzo) {

        Tukorszo.szo = bSzo;
        verem = new Stack<>();

        return false;

    }

    private static boolean isTukorszoE(String s) {

        verem.empty();

        for (int i = 0; i < s.length() / 2; i++) {

            verem.push(s.charAt(i) + "");

        }

        int masodikKezdes = s.length() / 2 + s.length() % 2;

        while (s.charAt(masodikKezdes) + "" == verem.top() && masodikKezdes < s.length()) {

            verem.pop();

        }

        return false;

    }

}
