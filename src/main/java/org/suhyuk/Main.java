package org.suhyuk;

import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.SimpleText;

import java.security.Signature;


public class Main {

    public static void main(String[] args) {

        KakaoChatBotResponseJSONFactory kakaoChatBotResponseJSONFactory = new JsonFactory();

        BasicCard basicCard = (BasicCard) kakaoChatBotResponseJSONFactory.createJSON(KakaoChatBotResponseType.BasicCard);

        JSONObject jsonObject = basicCard.setDescription("s")
                .build();
        System.out.println(kakaoChatBotResponseJSONFactory.toString());
        System.out.println(jsonObject.toString());

        SimpleText simpleText = (SimpleText) kakaoChatBotResponseJSONFactory.createJSON(KakaoChatBotResponseType.SimpleText);

        System.out.println(simpleText.setText("s").build().toString());


    }

}
