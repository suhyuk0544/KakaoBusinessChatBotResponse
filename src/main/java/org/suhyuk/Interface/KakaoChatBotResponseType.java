package org.suhyuk.Interface;

public enum KakaoChatBotResponseType {

    SimpleText("simpleText"),
    SimpleImage("simpleImage"),
    BasicCard("basicCard"),
    CommerceCard("CommerceCard"),
    ListCard("listCard"),
    ItemCard("itemCard");
    private final String type;

    KakaoChatBotResponseType(String type) {

        this.type = type;

    }

    public String getType() {
        return type;
    }

}
