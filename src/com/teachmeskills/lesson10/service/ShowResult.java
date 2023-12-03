package com.teachmeskills.lesson10.service;

import com.teachmeskills.lesson10.card.BaseCard;
import com.teachmeskills.lesson10.client.Client;

public class ShowResult {

    public static void showResult(BaseCard[] baseCards, Client client){

        if(baseCards.length==0){
            System.out.println("The client has no card!");
            return;
        }else {
            System.out.println(client.getName()+" "+client.getSurname()+" has "+ baseCards.length+" cards!");
            }

        int count=1;
        for (int i = 0; i < baseCards.length; i++) {
            for (int j = i + 1; j < baseCards.length; j++) {
                if (baseCards[i].equals(baseCards[j])) {
                    count++;
                    break;
                }
            }
        }
        if (count==1){
            System.out.println(client.getName()+" "+client.getSurname()+" has no similar cards!");
        }
        else if(count>1){
            System.out.println(client.getName()+" "+client.getSurname()+" has "+count+ " similar cards!");
        }

    }

}
