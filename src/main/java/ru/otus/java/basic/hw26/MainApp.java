package ru.otus.java.basic.hw26;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MainApp {
//    public static void main(String[] args) {
//        int[] mas = {2,2,1,2,2};
//        System.out.println(elemsAfter(mas).length);
//    }


    public static int[] elemsAfter(int[] mas) {
        int startIndex = mas.length;
        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i] == 1) {
                startIndex = i + 1;
                return Arrays.copyOfRange(mas, startIndex, mas.length);
            }
        }
        RuntimeException ex = new RuntimeException();
        throw ex;
    }
    public static boolean elemsFitt(int[] mas) {
        boolean fl1 = false, fl2 = false, fl3 = false;
        for (int i = 0; i < mas.length; i++) {
            if ((mas[i] == 1) || (mas[i] == 2)) {
                if (mas[i] == 1) {
                    fl1 = true;
                } else {
                    fl2 = true;
                }
            } else {
                return false;
            }
        }
        return fl1 && fl2;
    }
}

