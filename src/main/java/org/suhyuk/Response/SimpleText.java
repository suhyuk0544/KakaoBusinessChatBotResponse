package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;

import javax.print.attribute.standard.JobStateReasons;
import java.util.Objects;

public class SimpleText extends JsonFactory {

    public SimpleText() {
        super(new JSONObject());
    }

    public SimpleText setText(String text){
        jsonObject.put("simpleText",new JSONObject().put("text",text));
        return this;
    }

    public JSONObject build() {
        return jsonObject;
    }


}
