/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Scott Schimpf
 */
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a noun: ");
        String noun = scan.nextLine();

        System.out.print("\nPlease enter a verb: ");
        String verb = scan.nextLine();

        System.out.print("\nPlease enter an adjective: ");
        String adjective = scan.nextLine();

        System.out.print("\nPlease enter an adverb: ");
        String adverb = scan.nextLine();

        System.out.println("Did you " + verb + " the " + adjective + " " + noun + " " + adverb + "?");
    }
}
