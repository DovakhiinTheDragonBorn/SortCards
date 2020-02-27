package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CardDeck myDeck = new CardDeck();
        int i = -1;
        Scanner scanner = new Scanner(System.in);


        while (i!=0)
        {
            System.out.println();
            System.out.println("Please Select an Operation");
            System.out.println("1. Shuffle Deck");
            System.out.println("2. Show Cards");
            System.out.println("3. Sort Rows");
            System.out.println("4. Sort Columns");
            System.out.println("0. Exit");
            i = Integer.parseInt(scanner.next());
            switch (i)
            {
                case 1: myDeck.Shuffle();
                        break;
                case 2:System.out.println();
                        myDeck.ShowCards();
                        break;
                case 3:myDeck.SortRows();
                        break;
                case 4:myDeck.SortColumns();
                        break;
                case 0: break;
                default: System.out.println("Please Enter a valid option");
            }

        }

        myDeck.Shuffle();
        myDeck.ShowCards();
    }
}
