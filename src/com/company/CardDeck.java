package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class CardDeck {
    private Card[][] deck = new Card[4][13];
    private Random random = new Random();
    private String[] suit ={"Diamond","Heart","Spade","Flower"};
    private String[] value ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    public CardDeck()
    {
        for(int a =0; a<=3; a++)
        {
            for(int b =0; b<=12;b++)
               deck[a][b] = new Card(b,suit[a]);
        }
    }

    public void ShowCards()
    {
        for(int a =0; a<=12; a++)
        {
            for(int b =0; b<=3;b++)
                System.out.print(value[deck[b][a].getValue()]+" "+ deck[b][a].getSuit()+"\t");
            System.out.println();
        }
    }

    public void Shuffle()
    {
        for (int i = deck.length - 1; i > 0; i--) {
            for (int j = deck[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                Card temp = deck[i][j];
                deck[i][j] = deck[m][n];
                deck[m][n] = temp;
            }
        }
    }
}
