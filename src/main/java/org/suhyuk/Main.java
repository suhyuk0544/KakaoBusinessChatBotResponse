package org.suhyuk;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Response.*;
import org.suhyuk.Response.Common.Button;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BasicCard basicCard = BasicCard.builder()
                .title("gk")
                .description("gk")
                .thumbnail("gk")
                .build();

        ArrayList<Button> buttons = new ArrayList<>();

        buttons.add(new Button("","","", MessageText.message));

        BasicCard b = BasicCard.builder()
                .thumbnail("gk")
                .buttons(buttons)
                .build();

        JSONObject jsonObject = basicCard.mainJsonObject(SkillVersion.VERSION2.getVersion(),new JSONArray().put(basicCard.createJSON()),new JSONArray());
        JSONObject object = basicCard.mainJsonObject(SkillVersion.VERSION2.getVersion(), new JSONArray().put(b.createJSON()),new JSONArray());

        System.out.println(jsonObject.toString());

        System.out.println(object.toString());
    }

}
