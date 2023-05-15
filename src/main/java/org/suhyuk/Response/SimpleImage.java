package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;

import java.util.Objects;

public class SimpleImage extends JsonFactory {

    private final String imageUrl;

    private final String altText;

    @Builder
    public SimpleImage(String imageUrl, String altText) {
        this.imageUrl = Objects.requireNonNull(imageUrl);
        this.altText = Objects.requireNonNull(altText);
    }


    /**
     * @return
     */
    @Override
    public JSONObject createJSON() {
        return new JSONObject().put("simpleText",new JSONObject().put("imageUrl",imageUrl).put("altText",altText));
    }
}
