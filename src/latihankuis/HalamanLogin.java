/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class HalamanLogin extends JFrame implements ActionListener {
    JLabel pageLabel = new JLabel ("Halaman Login");
    JLabel usernameLabel = new JLabel ("username : ");
    JLabel passwordLabel = new JLabel ("password : ");
    
    JTextField usernameTextField = new JTextField();
    JTextField passwordTextField = new JTextField();
    
    JButton buttonLogin = new JButton("Login");

    HalamanLogin() {
        setVisible(true);
        
        setSize(470,720);
        
        setTitle("Halaman Login");
        
        setLocationRelativeTo(null);
        
        setAlwaysOnTop(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(pageLabel);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(buttonLogin);

        pageLabel.setBounds(0,50,440,20);
        pageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        pageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        usernameLabel.setBounds(20,85,440,12);
        usernameTextField.setBounds(18,100,400,32);
        
        passwordLabel.setBounds(20,140,440,12);
        passwordTextField.setBounds(18,160,400,32);
        
        buttonLogin.setBounds(120,225,200,32);
        buttonLogin.setBackground(Color.lightGray);
        buttonLogin.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();

            if(username.equals("123230075") && password.equals("pass12345")) {
                System.out.println("sukses");

                new HalamanUtama(username);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "username atau password salah");
            }
        } catch(Exception error) {
            JOptionPane.showConfirmDialog(this, error.getMessage());
        }
    }
}
