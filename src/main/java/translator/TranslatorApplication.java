package main.java.translator;

public class TranslatorApplication {

    public static void main(String[] args) {
        Dictionary myDictionary = DictionaryLifeCycle.getDictionary();

        Situation situation = new Situation(new KorToEngTranslator(myDictionary));
        situation.play("Strawberry");

        Situation situation1 = new Situation(new EngToKorTranslator(myDictionary));
        situation1.play("Strawberry");
    }
}
