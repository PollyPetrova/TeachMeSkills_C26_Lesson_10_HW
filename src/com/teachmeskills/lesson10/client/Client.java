package com.teachmeskills.lesson10.client;

import com.teachmeskills.lesson10.card.BaseCard;

public class Client {

    private String name;
    private String surname;
    private String passportNum;
    private BaseCard[] baseCards;

    public Client(String name, String surname, String passportNum) {
        this.name = name;
        this.surname = surname;
        this.passportNum = passportNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public BaseCard[] getBaseCards() {
        return baseCards;
    }

    public void setBaseCards(BaseCard[] baseCards) {
        this.baseCards = baseCards;
    }

}
