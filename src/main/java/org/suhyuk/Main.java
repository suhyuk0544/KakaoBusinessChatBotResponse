package org.suhyuk;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.SimpleImage;
import org.suhyuk.Response.SimpleText;
import org.suhyuk.Response.SkillVersion;

public class Main {

    public static void main(String[] args) {

        BasicCard basicCard = BasicCard.builder()
                .title("gk")
                .description("gl")
                .thumbnail("gk")
                .build();

        JSONObject jsonObject = basicCard.mainJsonObject(SkillVersion.VERSION2.getVersion(),new JSONArray().put(basicCard.createJSON()),new JSONArray());

        System.out.println(jsonObject.toString());

    }

}
