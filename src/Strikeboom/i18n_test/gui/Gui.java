package Strikeboom.i18n_test.gui;

import Strikeboom.i18n_test.I18N.EnumLanguages;
import Strikeboom.i18n_test.I18N.I18N;

import javax.swing.*;

public class Gui {
    private static JLabel label;
    public Gui() {
        JFrame frame = new JFrame("I18N Test");

        JPanel panel = new JPanel();
        panel.setLayout(new GroupLayout(panel));

        ButtonGroup languages = new ButtonGroup();
        JRadioButton english = new LanguageRadioButton(EnumLanguages.ENGLISH.getName(),EnumLanguages.ENGLISH.getFileName());
        english.setBounds(10,10,70,15);
        english.setSelected(true);
        JRadioButton brihish = new LanguageRadioButton(EnumLanguages.BRIHISH.getName(),EnumLanguages.BRIHISH.getFileName());
        brihish.setBounds(10,40,70,15);
        languages.add(english);
        languages.add(brihish);

        label = new JLabel(I18N.format("text.label"));
        label.setBounds(150,50,300,70);
        label.setFont(label.getFont().deriveFont(50f));

        panel.add(english);
        panel.add(brihish);
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setSize(400,200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void changeText(String text) {
        label.setText(text);
    }
}
