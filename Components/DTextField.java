package Components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class DTextField extends JTextField {

    public DTextField() {
        setHorizontalAlignment(JTextField.CENTER);
        setOpaque(false);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        setFocusable(true);
        setFont(new Font("Monospace", Font.PLAIN, 13));
    }
}
