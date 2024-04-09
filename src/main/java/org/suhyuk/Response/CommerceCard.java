package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Response.Common.Button;
import org.suhyuk.Response.Common.Thumbnail;

@Builder
public class CommerceCard extends JsonOutPutsFactory {


    CommerceCard() {
        super(new JSONObject());
    }


    public CommerceCard setDescription(String description){
        jsonObject.put("description",description);
        return this;
    }

    public CommerceCard setPrice(Integer price){
        jsonObject.put("price",price);
        return this;
    }

    public CommerceCard setCurrency(String currency){
        jsonObject.put("currency",currency);
        return this;
    }

    public CommerceCard setDiscount(Integer discount){
        jsonObject.put("discount",discount);
        return this;
    }

    public CommerceCard setThumbnail(String imageUrl){
        JSONObject thumbnails = new JSONObject()
                .put("imageUrl", imageUrl);
        jsonObject.put("thumbnail", thumbnails);

        return this;
    }

    public CommerceCard setThumbnail(Thumbnail thumbnail){
        jsonObject.put("thumbnails",thumbnail);
        return this;
    }

    public CommerceCard setButton(Button...buttons){

        if (buttons.length < 1 || buttons.length > 3)
            throw new ArrayIndexOutOfBoundsException("buttons can not");

        JSONArray button = jsonObject.optJSONArray("buttons");

        if (button == null)
            jsonObject.put("buttons", buttons);

        return this;
    }

    public JSONObject build() {
        return jsonObject;
    }
}
