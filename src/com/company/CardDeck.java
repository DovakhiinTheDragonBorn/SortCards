package com.company;
import java.util.Random;

public class CardDeck {
    private Card[][] deck = new Card[4][13];
    private Random random = new Random();
    private String[] suit ={"Diamond","Heart","Spade","Flower"};
    private String[] value ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    public CardDeck()
    {
        for(int a =0; a<=3; a++){
            for(int b =0; b<=12;b++)
               deck[a][b] = new Card(b,a);
        }
    }

    public void ShowCards()
    {
        for(int a =0; a<=3; a++){
            for(int b =0; b<=12;b++)
                System.out.print(value[deck[a][b].getValue()]+" "+ suit[deck[a][b].getSuit()]+"|\t\t");
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

    public void SortColumns() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3 - j ; k++) {
                    if (deck[k][i].getValue() > deck[k+1][i].getValue()) {
                        Card temp = deck[k][i];
                        deck[k][i] = deck[k+1][i];
                        deck[k+1][i] = temp;
                    }
                    else  if (deck[k][i].getValue() == deck[k+1][i].getValue()) {
                        if (deck[k][i].getSuit() > deck[k+1][i].getSuit()) {
                            Card temp = deck[k][i];
                            deck[k][i] = deck[k+1][i];
                            deck[k+1][i] = temp;
                        }
                    }
                }
            }
        }
    }


    public void SortRows() {
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[i].length; j++) {
                for (int k = 0; k < deck[i].length - j - 1; k++) {
                    if (deck[i][k].getValue() > deck[i][k + 1].getValue()) {
                        Card temp = deck[i][k];
                        deck[i][k] = deck[i][k + 1];
                        deck[i][k + 1] = temp;
                    }
                    else  if (deck[i][k].getValue() == deck[i][k + 1].getValue()) {
                        if (deck[i][k].getSuit() > deck[i][k + 1].getSuit()) {
                            Card temp = deck[i][k];
                            deck[i][k] = deck[i][k + 1];
                            deck[i][k + 1] = temp;
                        }
                    }
                }
            }
        }
    }
}

