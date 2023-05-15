package org.suhyuk;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.SimpleImage;
import org.suhyuk.Response.SimpleText;

public class Main {

    public static void main(String[] args) {

        SimpleText simpleText = SimpleText
                .builder()
                .text("하이")
                .build();

        JSONObject jsonObject = simpleText.mainJsonObject("2.0",new JSONArray().put(simpleText.createJSON()),new JSONArray());

        System.out.println(jsonObject.toString());


        System.out.println(new JSONObject("근","하하"));

        SimpleImage simpleImage = SimpleImage.builder()
                .imageUrl("s")
                .altText("d")
                .build();

        System.out.println(simpleImage.mainJsonObject("2.0",new JSONArray().put(simpleImage.createJSON()),new JSONArray()));

    }

}
