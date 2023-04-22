package main.java.translator;

public interface Translator {
    String translate ( String string ); /* 어떤 언어를 받아왓을 때 번역해주는 기능 */
    boolean isTranslated ( String string ); /* 해당 string 이 번역 필요한 녀석인지 확인 */
}
