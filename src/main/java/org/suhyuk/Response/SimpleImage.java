package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;

import java.util.Objects;

public class SimpleImage extends JsonFactory {

//    private final String imageUrl;

//    private final String altText;
//
//    @Builder
//    public SimpleImage(String imageUrl, String altText) {
//        super(new JSONObject());
//        this.imageUrl = Objects.requireNonNull(imageUrl);
//        this.altText = Objects.requireNonNull(altText);
//    }



    public SimpleImage() {
        super(new JSONObject());
    }

    public SimpleImage setText(String imageUrl,String altText){
        jsonObject.put("simpleText",new JSONObject().put("imageUrl",imageUrl).put("altText",altText));
        return this;
    }


    public JSONObject build() {
            return jsonObject;
    }


}
