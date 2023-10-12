package org.suhyuk.Response;


import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;


public class BasicCard extends JsonFactory{


    public BasicCard() {
        super(new JSONObject());
    }

    public BasicCard setTitle(String title) {
        jsonObject.put("title", title);
        return this;
    }

    public BasicCard setDescription(String description) {
        jsonObject.put("description", description);
        return this;
    }

    public BasicCard setThumbnail(String imageUrl) {
        JSONObject thumbnails = new JSONObject()
                .put("imageUrl", imageUrl);
        jsonObject.put("thumbnail", thumbnails);
        return this;
    }

    public BasicCard setButtons(JSONArray buttons) {

        jsonObject.put("buttons",buttons);

        return this;
    }

    public BasicCard setButton(String label, String action,String value) {
        JSONArray buttons = jsonObject.optJSONArray("buttons");
        if (buttons == null) {
            buttons = new JSONArray();
            jsonObject.put("buttons", buttons);
        }

        JSONObject button = new JSONObject()
                .put("label", label)
                .put("action", action);

        if (value != null) {
            button.put(action.equals("message") ? "messageText" : "webLinkUrl", value);
        }
        buttons.put(button);

        return this;
    }

    public JSONObject build() {
        return jsonObject;
    }

    @Override
    public String toString() {
        return "BasicCard{" +
                "jsonObject=" + jsonObject +
                '}';
    }

}
