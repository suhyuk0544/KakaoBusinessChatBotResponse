package org.suhyuk.Response;

import org.json.JSONObject;
import org.suhyuk.Response.Common.ListItem;

import java.util.ArrayList;

public class ListCard extends JsonOutPutsFactory {

//    private final ListItem header;
//
//    private final ArrayList<ListItem> items;

//    private final ArrayList<Button> buttons;

    public ListCard() {
        super(new JSONObject());
    }

    public ListCard setHeader(ListItem listItem){

        jsonObject.put("header",listItem);

        return this;
    }

    public ListCard setItems(ArrayList<ListCard> arrayList){

        if (arrayList.size() == 0 || arrayList.size() > 5)
            throw new IllegalArgumentException();

        jsonObject.put("items",arrayList);

        return this;
    }


    /**
     * @return
     */

    public JSONObject build() {
        return null;
    }
}
