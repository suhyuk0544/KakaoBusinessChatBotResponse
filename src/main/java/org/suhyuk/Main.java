package org.suhyuk;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Response.JsonOutPutsFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.CommerceCard;
import org.suhyuk.Response.Common.Button;

public class Main {

    public static void main(String[] args) {

        JsonOutPutsFactory json = new JsonOutPutsFactory();

        CommerceCard commerceCard = (CommerceCard) json.createJSON(KakaoChatBotResponseType.CommerceCard);

//        JSONObject jsonObject = commerceCard.setButton(new Button("","","",null), Button.createButton("","","",null))
//                .build();

//        System.out.println(jsonObject.toString());

        BasicCard basicCard = (BasicCard) json.createJSON(KakaoChatBotResponseType.BasicCard);


        JSONObject jsonObject1 = basicCard.setButton(new JSONArray())
                .build();


        System.out.println(jsonObject1.toString());
    }


}
