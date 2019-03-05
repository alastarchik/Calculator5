package com.company;


import java.util.*;

public class Main {
    public static void main(String args[])  {

        String a = args[0];
        String sign = args[1];
        String b = args[2];

        String plus = "+";
        String minus = "-";
        String division  = "/";
        String mult = "*";

        String Arab[] = {"0","1","2","3","4","5","6","7","8","9","10"}; //массив арабских чисел для сравнения с вводимыми значениями

        String Rome[] = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"}; //массив римских чисел для сравнения с вводимыми значениями


        if (plus.equals(sign)) {

            for(int i = 0; i < 11; i++) {

                if (a.equals(Arab[i])) {


                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Arab[j])) {
                            System.out.print(Integer.parseInt(Arab[i])+Integer.parseInt(Arab[j]));

                        }
                    }
                }

            }

            for(int i = 0; i < 11; i++) {

                if (a.equals(Rome[i])) {

                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Rome[j])) {

                            System.out.print(RomanNumerals(Integer.parseInt(Arab[i]) + Integer.parseInt(Arab[j])));


                        }

                    }
                }

            }
        } //делаем операцию на основании знака аргумента

        if (minus.equals(sign)) {

            for(int i = 0; i < 11; i++) {

                if (a.equals(Arab[i])) {


                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Arab[j])) {
                            System.out.print(Integer.parseInt(Arab[i])-Integer.parseInt(Arab[j]));

                        }
                    }
                }
            }

            for(int i = 0; i < 11; i++) {

                if (a.equals(Rome[i])) {

                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Rome[j])) {
                            System.out.print(RomanNumerals(Integer.parseInt(Arab[i])-Integer.parseInt(Arab[j])));

                        }
                    }
                }

            }

        }  //делаем операцию на основании знака аргумента

        if (division.equals(sign)) {

            for(int i = 0; i < 11; i++) {

                if (a.equals(Arab[i])) {


                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Arab[j])) {
                            System.out.print(Integer.parseInt(Arab[i])/Integer.parseInt(Arab[j]));

                        }
                    }
                }
            }

            for(int i = 0; i < 11; i++) {

                if (a.equals(Rome[i])) {


                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Rome[j])) {
                            System.out.print(RomanNumerals(Integer.parseInt(Arab[i])/Integer.parseInt(Arab[j])));

                        }
                    }
                }
            }
        }  //делаем операцию на основании знака аргумента

        if (mult.equals(sign)) {

            for(int i = 0; i < 11; i++) {

                if (a.equals(Arab[i])) {


                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Arab[j])) {
                            System.out.print(Integer.parseInt(Arab[i])*Integer.parseInt(Arab[j]));

                        }
                    }
                }
            }

            for(int i = 0; i < 11; i++) {

                if (a.equals(Rome[i])) {


                    for(int j = 0; j < 11; j++) {

                        if (b.equals(Rome[j])) {
                            System.out.print(RomanNumerals(Integer.parseInt(Arab[i])*Integer.parseInt(Arab[j])));

                        }
                    }
                }
            }

        }  //делаем операцию на основании знака аргумента





    }

    //эта часть кода взята из интернета
    public static String RomanNumerals(int Int) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }

    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
    //эта часть кода взята из интернета

}