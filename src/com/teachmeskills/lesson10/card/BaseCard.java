package com.teachmeskills.lesson10.card;

import java.util.Objects;

public abstract class BaseCard {

    private int cardNum;
    private int CVC;
    private double cardAmount;


    public BaseCard(int cardNum, int CVC, double cardAmount) {
        this.cardNum = cardNum;
        this.CVC = CVC;
        this.cardAmount = cardAmount;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public double getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(double cardAmount) {
        this.cardAmount = cardAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cardNum == baseCard.cardNum && CVC == baseCard.CVC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNum, CVC);
    }

}
