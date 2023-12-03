package com.teachmeskills.lesson10.card.create_card;

import com.teachmeskills.lesson10.card.BaseCard;
import com.teachmeskills.lesson10.card.impl.BelCard;
import com.teachmeskills.lesson10.card.impl.MasterCard;
import com.teachmeskills.lesson10.card.impl.VisaCard;

public class CreateCard {

    public static BaseCard[] createCard(){

        BaseCard[] baseCards = new BaseCard[6];

        baseCards[0] = new MasterCard(555666, 654, 10);
        baseCards[1] = new BelCard(111222, 159, 15000);
        baseCards[2] = new BelCard(111222, 159, 45);
        baseCards[3] = new VisaCard(444555, 456, 250000);
        baseCards[4] = new BelCard(111222, 159, 250);
        baseCards[5] = new MasterCard(555666, 654, 2500);

        return baseCards;

    }

}
