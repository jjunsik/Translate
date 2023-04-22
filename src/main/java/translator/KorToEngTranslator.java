package main.java.translator;

import java.util.Map;

public class KorToEngTranslator implements Translator {

    private final Map<String, String> korToEngDictionary;

    public KorToEngTranslator (Dictionary dictionary) {
        this.korToEngDictionary = dictionary.getKorToEngDictionary();
    }

    @Override
    public String translate(String string) {
        for (String korean : korToEngDictionary.keySet()) {
            if (string.equals(korean)) {
                return korToEngDictionary.get(string);
            }
        }
        return null;
    }

    @Override
    public boolean isTranslated(String string) {
        // value 값 즁에서 확인
        for (String value : korToEngDictionary.values()) {
            if (string.equals(value))
                return true;
        }
        return false;
    }
}
