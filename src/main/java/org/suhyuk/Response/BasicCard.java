package org.suhyuk.Response;


import org.json.JSONArray;
import org.json.JSONObject;


public class BasicCard extends JsonOutPutsFactory {

    BasicCard() {
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

    public BasicCard setButton(JSONArray buttons) {

        jsonObject.put("buttons",buttons);

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
