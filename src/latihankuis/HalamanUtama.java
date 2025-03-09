/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class HalamanUtama extends JFrame {
    JLabel labelWelcome = new JLabel();
    JLabel labelPilihMenu = new JLabel("Silahkan pilih menu dibawah untuk membeli majalah");

    JButton buttonMajalahAnak = new JButton("Majalah Anak");
    JButton buttonMajalahRemaja = new JButton("Majalah Remaja");
    JButton buttonMajalahDewasa = new JButton("Majalah Dewasa");
    
    HalamanUtama(String username) {
        
        setSize(470,720);
        
        setTitle("Home Page");
        
        setLocationRelativeTo(null);
        
        setAlwaysOnTop(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(labelWelcome);
        add(labelPilihMenu);
        add(buttonMajalahAnak);
        add(buttonMajalahRemaja);
        add(buttonMajalahDewasa);
        
        labelWelcome.setText("Selamat Datang, " + username);
        labelWelcome.setBounds(20,40,400,100);
        labelWelcome.setFont(new Font("Arial", Font.PLAIN, 18));
        
        labelPilihMenu.setBounds(20,65,400,100);
        labelPilihMenu.setFont(new Font("Arial", Font.PLAIN, 12));
        
        buttonMajalahAnak.setBounds(20,142,410,32);
        buttonMajalahAnak.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonMajalahAnak.setBackground(Color.lightGray);
        buttonMajalahAnak.addActionListener(e -> {
            dispose();
            new HalamanPembelian("Majalah Anak");
        });

        buttonMajalahRemaja.setBounds(20,182,410,32);
        buttonMajalahRemaja.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonMajalahRemaja.setBackground(Color.lightGray);
        buttonMajalahRemaja.addActionListener(e -> {
            dispose();
            new HalamanPembelian("Majalah Remaja");
        });
        
        buttonMajalahDewasa.setBounds(20,222,410,32);
        buttonMajalahDewasa.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonMajalahDewasa.setBackground(Color.lightGray);
        buttonMajalahDewasa.addActionListener(e -> {
            dispose();
            new HalamanPembelian("Majalah Dewasa");
        });

        setVisible(true);
    }

}
