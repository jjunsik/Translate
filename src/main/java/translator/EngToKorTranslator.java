package main.java.translator;

import java.util.Map;

public class EngToKorTranslator implements Translator {

    public final Map<String, String> engToKorDictionary;

    public EngToKorTranslator(Dictionary dictionary){
        this.engToKorDictionary = dictionary.getEngToKorDictionary();
    }

    @Override
    public String translate(String string) {
        for (String eng : engToKorDictionary.keySet()){
            if (string.equals(eng)){
                return engToKorDictionary.get(eng);
            }
        }
        return null;
    }

    @Override
    public boolean isTranslated(String string) {
        for (String value : engToKorDictionary.values()) {
            if (string.equals(value))
                return true;
        }
        return false;
    }
}
