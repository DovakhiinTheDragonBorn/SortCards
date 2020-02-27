package com.company;

import java.util.ArrayList;

public class CardDeck {
    private Card[][] Deck = new Card[4][13];

    private String[] suit ={"Diamond","Heart","Spade","Flower"};
    private String[] value ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    public CardDeck()
    {
        for(int a =0; a<=3; a++)
        {
            for(int b =0; b<=12;b++)
               Deck[a][b] = new Card(b,suit[a]);
        }
    }

    public void ShowCards()
    {
        for(int a =0; a<=12; a++)
        {
            for(int b =0; b<=3;b++)
                System.out.print(value[Deck[b][a].getValue()]+" "+Deck[b][a].getSuit()+"\t");
            System.out.println();
        }
    }

    public void Shuffle()
    {

    }
}
