package org.suhyuk.Response.Common;

import org.json.JSONObject;

public class Link extends CommonElementFactory{

    Link(JSONObject jsonObject) {
        super(jsonObject);
    }

    public Link setPc(){

        return this;
    }

}
