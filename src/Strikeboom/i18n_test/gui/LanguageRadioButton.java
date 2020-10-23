package Strikeboom.i18n_test.gui;

import javax.swing.*;

public class LanguageRadioButton extends JRadioButton {
    private final String fileName;
    public LanguageRadioButton(String name,String fileName) {
        super(name);
        this.fileName = fileName;
        addActionListener(new ChangeLanguageActionListener());
    }

    public String getFileName() {
        return fileName;
    }
}
