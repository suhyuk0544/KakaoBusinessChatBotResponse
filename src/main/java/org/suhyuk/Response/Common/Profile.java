package org.suhyuk.Response.Common;

import org.json.JSONObject;

public class Profile extends CommonElementFactory {

    Profile(){
        super(new JSONObject());
    }

    /**
     * @param nickName Profile name
     * @return Profile
     */
    public Profile setNickName(String nickName){

        jsonObject.put("nickname",nickName);

        return this;
    }

    /**
     * @param imageUrl Profile image
     * @return Profile
     */
    public Profile setImageUrl(String imageUrl) {

        jsonObject.put("imageUrl",imageUrl);

        return this;
    }

    public JSONObject build(){
        return jsonObject;
    }
}
