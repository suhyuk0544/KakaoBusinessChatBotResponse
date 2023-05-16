package org.suhyuk.Abstract;

import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Interface.KakaoChatBotResponseJSONFactory;

import java.util.Objects;

public abstract class JsonFactory {

    public abstract JSONObject createJSON();


    /**
     * @param version 1.0 or 2.0
     * @param outputs ARRAY of JSON created with createJSON() is required
     * @param carousel
     * @return Kakao Talk ChatBot Response
     */
    public JSONObject mainJsonObject(String version,JSONArray outputs,JSONArray carousel) {

        JSONObject jsonObject = new JSONObject();
        JSONObject body = new JSONObject();

        if (outputs.length() > 3 && outputs.length() < 1 && carousel.length() > 10)
            throw new IllegalArgumentException();

        if (!carousel.isEmpty())
            body.put("quickReplies",carousel);

        body.put("outputs",outputs);

        jsonObject.put("version",version);
        jsonObject.put("template",body);
        return jsonObject;
    }

}
