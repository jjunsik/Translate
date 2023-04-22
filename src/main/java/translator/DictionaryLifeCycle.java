package main.java.translator;

import java.util.HashMap;
import java.util.Map;

public class DictionaryLifeCycle {

    private static final Dictionary dictionary; // 싱글톤

    static {
        // init
        Map<String, String> korToEngDict = getKorToEngDictionary();
        Map<String, String> engToKorDict = new HashMap<>();
        for (String key : korToEngDict.keySet()){
            engToKorDict.put(korToEngDict.get(key), key);
        }


        dictionary = new Dictionary(korToEngDict, engToKorDict); // 주입!
    }

    public static Dictionary getDictionary() {
        return dictionary;
    }

    private static Map<String, String> getKorToEngDictionary () {
        Map<String, String> dict = new HashMap<>();

        dict.put("사과", "Apple");
        dict.put("배", "Pear");
        dict.put("바나나", "Banana");
        dict.put("파인애플", "Pineapple");
        dict.put("딸기", "Strawberry");

        return dict;
    }
}
