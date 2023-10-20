package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // part1
        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 2, 3, 4, 5, 6 };
        int[] z = new int[5];
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {

            if (i == x.length - 1) {
                System.out.println(x[i] + "}");
            } else {
                System.out.print(x[i] + ",");
            }

        }

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {

            if (i == y.length - 1) {
                System.out.println(y[i] + "}");
            } else {
                System.out.print(y[i] + ",");
            }

        }

        for (int i = 0; i < z.length; i++) {
            if (x[i] > y[i]) {
                z[i] = x[i];
            } else {
                z[i] = y[i];
            }
        }

        System.out.print("Array z = {");
        for (int i = 0; i < z.length; i++) {

            if (i == z.length - 1) {
                System.out.println(z[i] + "}");
            } else {
                System.out.print(z[i] + ",");
            }

        }
        System.out.println("---------------------------part2-----------------------------");
        String[] names = { "Aboard", "Baker", "Chicago", "Dannim", "Escout" };

        System.out.print("Names = {");
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.println(names[i] + "}");
            } else {
                System.out.print(names[i] + ",");
            }
        }

        for (int i = 0; i < names.length; i++) {

            int index = names[i].length() - 1;

            char t1 = names[i].charAt(0);
            t1 = Character.toLowerCase(t1);
            char t2 = names[i].charAt(index);
            t2 = Character.toUpperCase(t2);
            String S1 = t2 + names[i].substring(1, index) + t1;
            names[i] = S1;

        }
        System.out.print("Names(switched) = {");
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.println(names[i] + "}");
            } else {
                System.out.print(names[i] + ",");
            }
        }

    }

}
