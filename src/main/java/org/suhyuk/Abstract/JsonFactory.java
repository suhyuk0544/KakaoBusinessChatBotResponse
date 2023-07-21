package org.suhyuk.Abstract;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Interface.KakaoChatBotResponseType;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.SimpleImage;
import org.suhyuk.Response.SimpleText;
import org.suhyuk.Response.SkillVersion;

public class JsonFactory extends KakaoChatBotResponseJSONFactory {

    protected final JSONObject jsonObject;

    public JsonFactory(){this.jsonObject = new JSONObject();}

    protected JsonFactory(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }


    // 이거 switch 문 써서 관리 고고헛
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


            default -> {
                return null;
            }
        }
    }


    /**
     * @param version 1.0 or 2.0
     * @param outputs ARRAY of JSON created with createJSON() is required
     * @param carousel
     * @return Kakao Talk ChatBot Response
     */
    public static JSONObject mainJsonObject(String version,JSONArray outputs,JSONArray carousel) {

        JSONObject jsonObject = new JSONObject();
        JSONObject body = new JSONObject();

        if (outputs.length() > 3 && outputs.length() < 1 && carousel.length() > 10)
            throw new IllegalArgumentException();

        if (carousel != null)
            body.put("quickReplies",carousel);

        body.put("outputs",outputs);

        jsonObject.put("version",version);
        jsonObject.put("template",body);
        return jsonObject;
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
