package main.java.translator;

public class Situation {
    private final Translator translator;

    public Situation(Translator translator){
        this.translator = translator;
    }

    public void play(String word){
        if (translator.isTranslated(word)) {
            System.out.println("번역 필요 없음 : " + word);
            return ;
        }
        System.out.println("번역 완료 --> \"" + word + "\"  " + translator.translate(word));
    }
}
