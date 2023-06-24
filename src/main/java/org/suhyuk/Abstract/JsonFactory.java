package org.suhyuk.Abstract;

import lombok.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;
import org.suhyuk.Response.SkillVersion;

public abstract class JsonFactory implements KakaoChatBotResponseJSONFactory {

    protected final JSONObject jsonObject;

    protected JsonFactory(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    // 이거 switch 문 써서 관리 고고헛
    public abstract JSONObject createJSON();


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
