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

    public CommerceCard(String description, int price, String currency, int discount, int discountRate, int dicountedPrice, Profile profile) {
        super(new JSONObject());
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.discount = discount;
        this.discountRate = discountRate;
        this.dicountedPrice = dicountedPrice;
        this.profile = profile;
    }


    /**
     * @return
     */
    @Override
    public JSONObject createJSON() {
        return null;
    }
}
