package org.suhyuk.Interface;

import org.suhyuk.Response.Common.ListItem;

public enum KakaoChatBotResponseType {

    SimpleText("simpleText"),
    SimpleImage("simpleImage"),
    BasicCard("basicCard"),
    CommerceCard("CommerceCard"),
    ListCard("listCard"),
    TextCard("textCard"),
    ItemCard("itemCard"),
    Button("button"),
    ListItem("listitem"),
    Profile("profile");
    private final String type;

    KakaoChatBotResponseType(String type) {

        this.type = type;

    }

    public String getType() {
        return type;
    }

}
