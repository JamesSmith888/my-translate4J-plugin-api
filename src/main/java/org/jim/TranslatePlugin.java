package org.jim;

/**
 * @author jim
 */
public interface TranslatePlugin {
    String translate(String sourceText, String sourceLanguage, String targetLanguage);


    String translate(String sourceText);
}
