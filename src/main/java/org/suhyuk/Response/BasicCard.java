package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Response.Common.Button;

import java.util.ArrayList;
import java.util.Objects;


public class BasicCard extends JsonFactory   {

    private final String title;

    private final String description;

    private final String thumbnail;

    private final ArrayList<Button> buttons;

    @Builder
    public BasicCard(String title, String description, String thumbnail,ArrayList<Button> buttons) {
        this.title = title;
        this.description = description;
        this.thumbnail = Objects.requireNonNull(thumbnail);
        this.buttons = buttons;
    }

    @Override
    public JSONObject createJSON() {
        JSONObject response = new JSONObject();
        JSONObject inner = new JSONObject();

        inner.put("thumbnail",thumbnail);

        if (!title.isEmpty())
            inner.put("title",title);
        else if (!description.isEmpty())
            inner.put("description",description);
        else if (!buttons.isEmpty())
            inner.put("buttons",buttons);

        return response.put("basicCard",inner);
    }

    @Override
    public String toString() {
        return createJSON().toString();
    }

}
