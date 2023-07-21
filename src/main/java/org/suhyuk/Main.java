package org.suhyuk;

import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.SimpleText;

public class Main {

    private static KakaoChatBotResponseJSONFactory factory;

    public static void main(String[] args) {
        factory = new JsonFactory();

        SimpleText simpleText = (SimpleText) factory.createJSON(KakaoChatBotResponseType.SimpleText);

        simpleText.setText("하하");

        BasicCard basicCard = (BasicCard) factory.createJSON(KakaoChatBotResponseType.BasicCard);

        basicCard.setTitle("엄");

        System.out.println(simpleText.toString());
        System.out.println(basicCard.toString());

    }

}
