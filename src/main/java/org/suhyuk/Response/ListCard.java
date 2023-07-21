package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Response.Common.Button;
import org.suhyuk.Response.Common.ListItem;

import java.util.ArrayList;

public class ListCard extends JsonFactory {

    private final ListItem header;

    private final ArrayList<ListItem> items;

    private final ArrayList<Button> buttons;

    @Builder
    public ListCard(ListItem header,ArrayList<ListItem> items,ArrayList<Button> buttons) {
        super(new JSONObject());
        this.header = header;

        this.items = items;

        this.buttons = buttons;
    }


    /**
     * @return
     */

    public JSONObject build() {
        return null;
    }
}
