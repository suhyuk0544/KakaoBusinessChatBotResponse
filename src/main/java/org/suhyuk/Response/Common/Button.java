package org.suhyuk.Response.Common;

import lombok.Builder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.suhyuk.Response.BasicCard;
import org.suhyuk.Response.MessageText;

import java.util.Map;


public class Button extends CommonElementFactory {

    Button() {
        super(new JSONObject());
    }

    public Button setLabel(String label){

        if(label.length() > 14)
            throw new IllegalArgumentException();

        jsonObject.put("label", label);

        return this;
    }


    public Button setAction(String action,String value){

        if (value != null) {
            jsonObject.put(action.equals("message") ? "messageText" : "webLinkUrl", value);
        }

        return this;
    }

    public <T> Button setExtra(Map<String,T> extra){

        jsonObject.put("extra",extra);

        return this;
    }

    public JSONObject build(){
        return jsonObject;
    }

}
