package ex;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class MioButton extends JButton {

    public MioButton(String title){
        super(title);
        this.setBackground(new Color(124));
        this.setFont(new Font("Arial", 1, 15));
        this.setForeground(new Color(255255255));
    }
}
