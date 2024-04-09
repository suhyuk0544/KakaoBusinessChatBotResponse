package org.suhyuk.Response;

import org.json.JSONObject;

public class SimpleText extends JsonOutPutsFactory {

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
