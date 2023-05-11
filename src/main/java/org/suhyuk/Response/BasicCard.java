package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;

import java.util.ArrayList;
import java.util.Objects;


public class BasicCard extends JsonFactory   {

    private final String title;

    private final String description;

    private final String thumbnail;

    private final ArrayList<Button> buttons = new ArrayList<>();

    @Builder
    public BasicCard(String title, String description, String thumbnail, Button buttons) {
        this.title = title;
        this.description = description;
        this.thumbnail = Objects.requireNonNull(thumbnail);
        this.buttons.add(buttons);
    }


    @Override
    public JSONObject createJSON() {
        JSONObject response = new JSONObject();

        response.put("thumbnail",thumbnail);

        if (!title.isEmpty())
            response.put("title",title);
        else if (!description.isEmpty())
            response.put("description",description);
        else if (!buttons.isEmpty())
            response.put("",buttons);

        return response;
    }
}
