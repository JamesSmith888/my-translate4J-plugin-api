package org.jim;

/**
 * @author jim
 */
public interface TranslatePlugin {

    String translate(String sourceText);


    /**
     * 插件显示面板的标题，默认为空
     */
    default String translatePaneTitle() {
        return "";
    }


    /**
     * 插件显示面板的图标，默认为空。读取路径为src/main/resources/img/
     */
    default String translatePaneIconPath() {
        return null;
    }
}
