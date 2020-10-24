package Strikeboom.i18n_test.I18N;

import Strikeboom.i18n_test.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I18N {
    public static String format(String key) {
        return new BufferedReader(new InputStreamReader(I18N.class.getResourceAsStream("/Strikeboom/i18n_test/resources/" + Main.getLanguage() + ".txt")))
                .lines().filter(s -> s.contains(key) && s.contains("=") && !s.startsWith("//")).findFirst().map(s -> s.substring(s.lastIndexOf("=") + 1)).orElse(key);
    }
}
