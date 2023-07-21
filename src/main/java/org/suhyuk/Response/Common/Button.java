package org.suhyuk.Response.Common;

import lombok.Builder;
import org.json.JSONObject;
import org.suhyuk.Abstract.CommonElement;
import org.suhyuk.Response.MessageText;


public class Button extends CommonElement {

    private final String label;

    private final String action;

    private final String webLinkUrl;

    private final MessageText messageText;

    @Builder
    public Button(String label, String action, String webLinkUrl, MessageText messageText) {
        this.label = label;
        this.action = action;
        this.webLinkUrl = webLinkUrl;
        this.messageText = messageText;
    }

    /**
     * @return
     */

    public CommonElement createElement() {
        JSONObject jsonObject = new JSONObject();



        return null;
    }
}
