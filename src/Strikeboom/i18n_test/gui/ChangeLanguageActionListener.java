package Strikeboom.i18n_test.gui;

import Strikeboom.i18n_test.I18N.I18N;
import Strikeboom.i18n_test.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeLanguageActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.setLanguage(((LanguageRadioButton)e.getSource()).getFileName());
        Gui.changeText(I18N.format("text.label"));
    }
}
