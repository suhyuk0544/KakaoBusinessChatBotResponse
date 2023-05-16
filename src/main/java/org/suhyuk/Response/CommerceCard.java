package org.suhyuk.Response;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.JsonFactory;
import org.suhyuk.Response.Common.Button;
import org.suhyuk.Response.Common.Profile;
import org.suhyuk.Response.Common.Thumbnail;

import java.util.ArrayList;

@Builder
public class CommerceCard extends JsonFactory {


    private final String description;

    private final int price;

    private final String currency;

    private final int discount;

    private final int discountRate;

    private final int dicountedPrice;

    private final ArrayList<Thumbnail> thumbnails = new ArrayList<>();

    private final Profile profile;

    private final ArrayList<Button> buttons = new ArrayList<>();


    /**
     * @return
     */
    @Override
    public JSONObject createJSON() {
        return null;
    }
}
