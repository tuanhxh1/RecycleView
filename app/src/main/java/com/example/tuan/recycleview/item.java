package com.example.tuan.recycleview;

public class item {
    int background;
    String cardName;

    public item(int background, String cardName) {
        this.background = background;
        this.cardName = cardName;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
