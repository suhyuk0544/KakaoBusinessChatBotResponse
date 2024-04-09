package org.suhyuk.Response.Common;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.CommerceCard;

public class CommonElementFactory extends KakaoChatBotResponseJSONFactory {

    final JSONObject jsonObject;


    CommonElementFactory(JSONObject jsonObject){
        this.jsonObject = jsonObject;
    }

    @Override
    public CommonElementFactory createJSON(KakaoChatBotResponseType type) {

        switch (type){

            case Button -> {
                return new Button();
            }

            case ListItem -> {
                return  new ListItem();
            }

            case Profile -> {
                return  new Profile();
            }

            default -> {
                return null;
            }

        }

    }

}
