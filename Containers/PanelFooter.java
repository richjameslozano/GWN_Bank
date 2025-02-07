package Containers;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import Utils.ColorPalette;
import Utils.Defaults;
import Utils.MyTextField;

public class PanelFooter extends JPanel implements MouseListener {

    private ColorPalette colorPalette = new ColorPalette();
    private JSeparator emailSeparator = new JSeparator();
    private MyTextField custoMyTextField = new MyTextField();
    private Defaults def = new Defaults();

    private JLabel labelNoCred = new JLabel(),
    labelStart = new JLabel(),
    labelCopyright = new JLabel(),
    labelEmailSend = new JLabel(),
    labelFooter = new JLabel(),
    labelFooterp = new JLabel(),
    labelPrivacy = new JLabel(),
    labelTerms = new JLabel(),
    labelProject = new JLabel();

    ImageIcon logo = new ImageIcon("Images/JustLogo.png");
    Image image = logo.getImage();
    Image resizedImg = image.getScaledInstance(16, 20, Image.SCALE_SMOOTH);
    ImageIcon newLogo = new ImageIcon(resizedImg);

    ImageIcon footerLogo = new ImageIcon("Images/footerpic.png");
    Image footerImage = footerLogo.getImage();
    Image resizedFooterImg = footerImage.getScaledInstance((592 / 2) / 2 + 50, (422 / 2) / 2 + 50, Image.SCALE_SMOOTH);
    ImageIcon newFooterLogo = new ImageIcon(resizedFooterImg);

    public PanelFooter() {

        setOpaque(true);
        setBackground(colorPalette.getColorBackground1());
        setLayout(null);
        setBounds(0, 728, 1440, 294);

        labelNoCred.setText("E n r o l l   t o   G W N   O n l i n e !");
        labelNoCred.setForeground(colorPalette.getColorButtons());
        labelNoCred.setFont(new Font(def.getFontFam(), Font.PLAIN, 15));
        labelNoCred.setBounds(40, 40, 350, 20);

        labelStart.setText("Start using GWN Bank today.");
        labelStart.setForeground(Color.white);
        labelStart.setFont(new Font(def.getFontFam(), Font.BOLD, 26));
        labelStart.setBounds(40, 70, 400, 33);

        custoMyTextField.setHint("Enter your email to register");
        custoMyTextField.setFont(new Font(def.getFontFam(), Font.BOLD, 15));
        custoMyTextField.setForeground(Color.white);
        custoMyTextField.setBackground(colorPalette.getColorBackground1());
        custoMyTextField.setCaretColor(Color.white);
        custoMyTextField.setBounds(40, 110, 350, 40);

        labelEmailSend.setText("Get started");
        labelEmailSend.setBorder(BorderFactory.createLineBorder(colorPalette.getColorButtons(), 1));
        labelEmailSend.setFont(new Font(def.getFontFam(), Font.PLAIN, 12));
        labelEmailSend.setOpaque(true);
        labelEmailSend.setBackground(colorPalette.getColorButtons());
        labelEmailSend.setForeground(Color.white);
        labelEmailSend.setIconTextGap(5);
        labelEmailSend.setIcon(new ImageIcon(getClass().getResource("/Images/paper.png")));
        labelEmailSend.setBounds(390, 118, 100, 24);
        labelEmailSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelEmailSend.addMouseListener(this);

        emailSeparator.setForeground(Color.gray);
        emailSeparator.setBounds(40, 150, 450, 30);
        
        labelCopyright.setText("Copyright © 2023 GWN. | All rights reserved.");
        labelCopyright.setIcon(newLogo);
        labelCopyright.setFont(new Font(def.getFontFam(), Font.BOLD, 14));
        labelCopyright.setIconTextGap(5);
        labelCopyright.setForeground(Color.white);
        labelCopyright.setBounds(40, 180, 400, 20);

        labelFooter.setIcon(newFooterLogo);
        labelFooter.setBounds(922, 20, (592 / 2) / 2 + 50, (422 / 2) / 2 + 50);

        labelFooterp.setText("Make the right choice, choose GWN Bank.");
        labelFooterp.setFont(new Font(def.getFontFam(), Font.BOLD, 12));
        labelFooterp.setForeground(Color.white);
        labelFooterp.setBounds(1150, 50, 250, 30);

        labelPrivacy.setText("Privacy Policy".toUpperCase(getLocale()));
        labelPrivacy.setFont(new Font(def.getFontFam(), Font.BOLD, 12));
        labelPrivacy.setForeground(colorPalette.getColorButtons());
        labelPrivacy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelPrivacy.setBounds(1150, 90, 250, 30);

        labelTerms.setText("Terms and condition".toUpperCase(getLocale()));
        labelTerms.setFont(new Font(def.getFontFam(), Font.BOLD, 12));
        labelTerms.setForeground(colorPalette.getColorButtons());
        labelTerms.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelTerms.setBounds(1150, 125, 250, 30);

        labelProject.setText("All users of our services are subject to our Privacy Statement");
        labelProject.setBounds(970, 180, 460, 30);
        labelProject.setFont(new Font(def.getFontFam(), Font.BOLD, 14));
        labelProject.setForeground(Color.white);

        add(labelNoCred);
        add(labelStart);
        add(custoMyTextField);
        add(emailSeparator);
        add(labelEmailSend);
        add(labelCopyright);

        add(labelPrivacy);
        add(labelTerms);
        add(labelFooter);
        add(labelFooterp);
        add(labelProject);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        String email = custoMyTextField.getText().trim();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
