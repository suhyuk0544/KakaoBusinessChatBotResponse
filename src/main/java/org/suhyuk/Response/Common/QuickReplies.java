package org.suhyuk.Response.Common;

import org.json.JSONObject;
import org.suhyuk.Abstract.CommonElement;


public class QuickReplies extends CommonElement {

    public QuickReplies(){super(new JSONObject());}

    public QuickReplies setLabel(String label){
        jsonObject.put("label", label);

        return this;
    }

    public QuickReplies setMessageText(String messageText){
        jsonObject.put("messageText",messageText);

        return this;
    }

}
