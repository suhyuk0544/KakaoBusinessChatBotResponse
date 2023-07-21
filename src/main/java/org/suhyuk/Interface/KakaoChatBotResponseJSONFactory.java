package org.suhyuk.Interface;

import org.json.JSONObject;
import org.suhyuk.Abstract.CommonElement;
import org.suhyuk.Abstract.JsonFactory;

public abstract class KakaoChatBotResponseJSONFactory {

     public abstract KakaoChatBotResponseJSONFactory createJSON(KakaoChatBotResponseType type);

}
