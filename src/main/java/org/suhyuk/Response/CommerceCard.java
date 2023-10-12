package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Response.Common.Button;
import org.suhyuk.Response.Common.Profile;
import org.suhyuk.Response.Common.Thumbnail;

import java.util.ArrayList;

@Builder
public class CommerceCard extends JsonFactory {

    public CommerceCard(){super(new JSONObject());}


    public CommerceCard setTitle(String title) {
        jsonObject.put("title", title);
        return this;
    }

    public CommerceCard setDescription(String description){
        jsonObject.put("description",description);
        return this;
    }

    public CommerceCard setPrice(Integer price){
        jsonObject.put("price",price);
        return this;
    }

    /**
     * @param currency only "won"
     */
    public CommerceCard setCurrency(String currency){
        jsonObject.put("currency",currency);
        return this;
    }

    public CommerceCard setDiscount(Integer discount){
        jsonObject.put("discount",discount);
        return this;
    }

    public CommerceCard setDiscountRateAndDiscountRate(Integer discountRate){
        jsonObject.put("discountRate",discountRate);
        return this;
    }

    public CommerceCard setThumbnails(ArrayList<Thumbnail> thumbnails){
        jsonObject.put("thumbnails",thumbnails);
        return this;
    }

    public CommerceCard setProfile(){
//        jsonObject.put("",);
        return this;
    }

    public CommerceCard setButton(JSONArray buttons) {

        jsonObject.put("buttons",buttons);

        return this;
    }

    public CommerceCard setButton(String label, String action,String value) {
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
        return null;
    }
}
