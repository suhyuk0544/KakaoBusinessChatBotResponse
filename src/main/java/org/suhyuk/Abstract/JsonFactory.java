package org.suhyuk.Abstract;

import lombok.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.*;

public class JsonFactory extends KakaoChatBotResponseJSONFactory {

    protected final JSONObject jsonObject;

    public JsonFactory(){this.jsonObject = new JSONObject();}

    protected JsonFactory(JSONObject jsonObject) {
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


    /**
     * @param version 1.0 or 2.0
     * @param outputs ARRAY of JSON created with createJSON() is required
     * @return Kakao Talk ChatBot Response
     */
    public static JSONObject mainJsonObject(String version,JSONArray outputs) {
        JSONObject jsonObject = new JSONObject();
        JSONObject body = new JSONObject();

        if (outputs.length() > 3 && outputs.length() < 1)
            throw new IllegalArgumentException();


        body.put("outputs",outputs);


        jsonObject.put("version",version);
        jsonObject.put("template",body);

        return jsonObject;
    }

    /**
     * @param version 1.0 or 2.0
     * @param outputsCarousel ARRAY of JSON created with createJSON() is required
     * @return Kakao Talk ChatBot Response
     */
    public static JSONObject mainJsonObject(String version,JSONObject outputsCarousel) {
        JSONObject jsonObject = new JSONObject();
        JSONObject body = new JSONObject();

        if (outputsCarousel.length() < 1 || outputsCarousel.length() > 10)
            throw new IllegalArgumentException();


        body.put("outputs",new JSONArray().put(new JSONObject().put("carousel",outputsCarousel)));


        jsonObject.put("version",version);
        jsonObject.put("template",body);

        return jsonObject;
    }



    public static JSONObject createCarousel(KakaoChatBotResponseType type,JSONArray items){
        JSONObject carousel = new JSONObject();

        carousel.put("type", type.getType());
        carousel.put("items",items);

        return carousel;
    }

    public JSONObject createMainJsonObject(){

        JSONObject json = new JSONObject();
        JSONObject body = new JSONObject();

        body.put("outputs",new JSONArray().put(jsonObject));

        json.put("version", SkillVersion.VERSION2.getVersion());
        json.put("template",body);

        return json;
    }

    @Override
    public String toString() {
        return jsonObject.toString();
    }

}
