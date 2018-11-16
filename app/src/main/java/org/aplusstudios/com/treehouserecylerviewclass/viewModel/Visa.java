package org.aplusstudios.com.treehouserecylerviewclass.viewModel;

public class Visa {
    private String cardHolderName;
    private String cardType;

    public Visa(String cardHolderName, String cardType) {
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
