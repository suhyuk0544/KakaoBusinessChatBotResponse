package org.suhyuk.Abstract;

import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.SimpleImage;
import org.suhyuk.Response.SimpleText;
import org.suhyuk.Response.TextCard;

public class CommonElement extends KakaoChatBotResponseJSONFactory {

    protected final JSONObject jsonObject;

    public CommonElement(){jsonObject = new JSONObject();}

    protected CommonElement(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    // 이거 switch 문 써서 관리 ㄱㄱ
    @Override
    public JsonFactory createJSON(KakaoChatBotResponseType type) {

        switch (type){
            case SimpleText -> {
                return new SimpleText();
            }
            case SimpleImage -> {
                return new SimpleImage();
            }
            case BasicCard -> {
                return new BasicCard();
            }
            case TextCard -> {
                return new TextCard();
            }


            default -> {
                return null;
            }
        }
    }




}
