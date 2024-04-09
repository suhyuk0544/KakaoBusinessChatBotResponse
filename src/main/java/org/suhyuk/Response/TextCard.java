package org.suhyuk.Response;

import org.json.JSONArray;
import org.json.JSONObject;

public class TextCard extends JsonOutPutsFactory {

    public TextCard(){super(new JSONObject());}

    public TextCard setText(String text){
        jsonObject.put("text",text);
        return this;
    }

    public TextCard setButton(JSONArray buttons) {

        jsonObject.put("buttons",buttons);

        return this;
    }

    public TextCard setButton(String label, String action, String value) {

        JSONArray buttons = jsonObject.optJSONArray("buttons");

        if (buttons == null) {
            buttons = new JSONArray();
            jsonObject.put("buttons", buttons);
        }

        JSONObject button = new JSONObject()
                .put("label", label)
                .put("action", action)
                .put(action.equals("message") ? "messageText" : "webLinkUrl", value);
        buttons.put(button);

        return this;
    }

    public JSONObject build() {
        return jsonObject;
    }

    @Override
    public String toString() {
        return "TextCard{" +
                "jsonObject=" + jsonObject +
                '}';
    }
}
