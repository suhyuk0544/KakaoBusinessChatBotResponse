package org.suhyuk.Response;


import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Response.Common.Button;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;


public class BasicCard extends JsonFactory   {

    private final String title;

    private final String description;

    private final String thumbnail;

    private final ArrayList<Button> buttons = new ArrayList<>();

    private BasicCard(String title, String description, String thumbnail,ArrayList<Button> buttons) {
        this.title = title;
        this.description = description;
        this.thumbnail = Objects.requireNonNull(thumbnail);
        this.buttons.addAll(buttons);
    }

    @Override
    public JSONObject createJSON() {
        JSONObject response = new JSONObject();
        JSONObject inner = new JSONObject();

        inner.put("thumbnail",thumbnail);

        Optional.ofNullable(title).ifPresent(t -> inner.put("title",t));
        Optional.ofNullable(description).ifPresent(d -> inner.put("description",d));
        Optional.of(buttons).filter(b -> !b.isEmpty()).ifPresent(b -> inner.put("buttons",b));


        return response.put("basicCard",inner);
    }

    @Override
    public String toString() {
        return createJSON().toString();
    }

    public static BasicCardBuilder builder() {
        return new BasicCardBuilder();
    }

    public static class BasicCardBuilder {
        private String title;
        private String description;
        private String thumbnail;
        private final ArrayList<Button> buttons = new ArrayList<>();

        BasicCardBuilder() {
        }

        public BasicCardBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BasicCardBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BasicCardBuilder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public BasicCardBuilder buttons(ArrayList<Button> buttons) {
            this.buttons.addAll(buttons);
            return this;
        }

        public BasicCard build() {
            return new BasicCard(this.title, this.description, this.thumbnail, this.buttons);
        }

        public String toString() {
            return "BasicCard.BasicCardBuilder(title=" + this.title + ", description=" + this.description + ", thumbnail=" + this.thumbnail + ", buttons=" + this.buttons + ")";
        }
    }

}
