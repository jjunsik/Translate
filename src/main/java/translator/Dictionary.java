package main.java.translator;

import java.util.Map;

public class Dictionary {
    public final Map<String, String> korToEngDictionary;
    public final Map<String, String> engToKorDictionary;

    public Dictionary(Map<String, String> korToEngDictionary, Map<String, String> engToKorDictionary) {
        this.korToEngDictionary = korToEngDictionary;
        this.engToKorDictionary = engToKorDictionary;
    }

    public Map<String, String> getKorToEngDictionary() { return korToEngDictionary; }

    public Map<String, String> getEngToKorDictionary() { return engToKorDictionary; }
}
