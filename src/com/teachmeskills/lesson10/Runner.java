package com.teachmeskills.lesson10;

import com.teachmeskills.lesson10.card.BaseCard;
import com.teachmeskills.lesson10.card.create_card.CreateCard;
import com.teachmeskills.lesson10.card.impl.BelCard;
import com.teachmeskills.lesson10.card.impl.MasterCard;
import com.teachmeskills.lesson10.card.impl.VisaCard;
import com.teachmeskills.lesson10.client.Client;
import com.teachmeskills.lesson10.service.ShowResult;

/**
 * Есть клиент.
 * Клиент может иметь любое кличество карт.
 * Карта имеет три поля - cvv-код, номер карты и сумма на карте.
 * Вывести на экран сообщение о том, сколько одинаковых карты имеет клиент.
 * Поле с описанием суммы на карте не должно участвовать в сравнении.
 * Т.е. две краты с одними и теми же cvv-кодами и номерами, но разными суммами считаются одинаковыми.
 * Предусмотреть различные варианты выходного сообщения - например, у клиента нет ни одной карты, у клиента нет одинаковых карт и другие возможные ситуации.
 */

public class Runner {

    public static void main(String[] args) {

        Client client=new Client("Polina", "Petrova", "12345AI451");

        BaseCard[] baseCards = CreateCard.createCard();

        ShowResult.showResult(baseCards,client);

    }

}
