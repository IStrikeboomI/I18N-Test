package Strikeboom.i18n_test;

import Strikeboom.i18n_test.I18N.EnumLanguages;
import Strikeboom.i18n_test.gui.Gui;

import javax.swing.*;

public class Main {
    private static String language = EnumLanguages.ENGLISH.getFileName();
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Gui::new);
    }
    public static void setLanguage(String text) {
        language = text;
    }
    public static String getLanguage() {
        return language;
    }
}
