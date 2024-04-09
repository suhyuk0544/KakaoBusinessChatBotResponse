package org.suhyuk.Response.Common;

import org.json.JSONObject;

public class Thumbnail extends CommonElementFactory {

    Thumbnail(){
        super(new JSONObject());
    }

    public Thumbnail setImageUrl(String imageUrl) {

        jsonObject.put("imageUrl",imageUrl);

        return this;
    }

    public Thumbnail setLink(Link link){

        jsonObject.put("link",link);

        return this;
    }

    /**
     * @param fixedRatio s
     * @return Thumbnail
     */
    public Thumbnail setFixedRatio(Boolean fixedRatio){

        jsonObject.put("fixedRatio",fixedRatio);

        return this;
    }

}
