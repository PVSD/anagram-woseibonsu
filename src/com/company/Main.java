package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Anagram Detector");
        System.out.println("Insert your first word:");
        Scanner kbinput = new Scanner(System.in);
        String firstWord = kbinput.next();
        System.out.println("Insert your second word:");
        kbinput = new Scanner(System.in);
        String  secondWord = kbinput.next();

        char[] firstArray = firstWord.toLowerCase().toCharArray();
        char[] secondArray = secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if(Arrays.equals(firstArray, secondArray))
        {
            System.out.println("This is an anagram!");
        }
        else
        {
            System.out.println("This is not an anagram....");
        }




    }
}
