package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;

import java.util.Objects;

public class SimpleText extends JsonFactory {

    private final String text;

    @Builder
    public SimpleText(String text) {
        this.text = Objects.requireNonNull(text);
    }

    @Override
    public JSONObject createJSON() {
        return new JSONObject().put("simpleText",new JSONObject().put("text",text));
    }

}
