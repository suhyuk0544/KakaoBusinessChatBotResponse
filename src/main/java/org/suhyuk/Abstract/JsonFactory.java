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

        body.put("outputs", Objects.requireNonNull(outputs,"outputs must not be null"));

        if (!carousel.isEmpty())
            body.put("quickReplies",carousel);


        jsonObject.put("version",version);
        jsonObject.put("template",body);
        return jsonObject;
    }

}
