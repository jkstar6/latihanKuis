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
public class HalamanPembelian extends JFrame {
    JLabel labelHalamanPembuttonbelian = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel("Kategori");
    JLabel labuttonbelIsiKategori = new JLabel();
    JLabel labelHarga = new JLabel("Harga");
    JLabel labelIsiHarga = new JLabel();
    JLabel labuttonbelInputJumlah = new JLabel("Jumlah");
    JTextField jumlahTextField = new JTextField();
    JButton buttonKembali = new JButton("Kembali");
    JButton buttonBeli = new JButton("Beli");

    JLabel labelTotalPembelian = new JLabel("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel("Harga Satuan");
    JLabel labelIsiHargaSatuan = new JLabel();
    JLabel labelJumlah = new JLabel("Jumlah");
    JLabel labelIsiJumlah = new JLabel();
    JLabel labelTotalHarga = new JLabel("Total Harga");
    JLabel labelIsiTotalHarga = new JLabel();
    
    int hargaMajalah = 0;
    int anak = 10800;
    int remaja = 15200;
    int dewasa = 25400;

    HalamanPembelian(String majalah) {
        setVisible(true);

        setSize(470,720);
        
        setTitle("Halaman Pembuttonbelian");
        
        setLocationRelativeTo(null);
        
        setAlwaysOnTop(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        if (majalah == "Majalah Anak") {
            labelIsiHarga.setText("Rp10.800/pcs");
            labelIsiHargaSatuan.setText("Rp10.800");
            hargaMajalah = anak;
        } else if(majalah == "Majalah Remaja") {
            labelIsiHarga.setText("Rp15.200/pcs");
            labelIsiHargaSatuan.setText("Rp15.200");
            hargaMajalah = remaja;
        } else if(majalah == "Majalah Dewasa") {
            labelIsiHarga.setText("Rp25.400/pcs");
            labelIsiHargaSatuan.setText("Rp25.400");
            hargaMajalah = dewasa;
        }

        add(labelHalamanPembuttonbelian);
        add(labelKategori);
        add(labuttonbelIsiKategori);
        add(labelHarga);
        add(labelIsiHarga);
        add(labuttonbelInputJumlah);
        add(jumlahTextField);
        add(buttonKembali);
        add(buttonBeli);

        labelHalamanPembuttonbelian.setBounds(40,40,400,100);
        labelHalamanPembuttonbelian.setFont(new Font("Arial", Font.BOLD, 18));

        labelKategori.setBounds(40,80,400,100);
        labelKategori.setFont(new Font("Arial", Font.PLAIN, 18));
        labuttonbelIsiKategori.setText(majalah);
        labuttonbelIsiKategori.setBounds(250,80,400,100);
        labuttonbelIsiKategori.setFont(new Font("Arial", Font.PLAIN, 18));

        labelHarga.setBounds(40,110,400,100);
        labelHarga.setFont(new Font("Arial", Font.PLAIN, 18));
        labelIsiHarga.setBounds(250,110,400,100);
        labelIsiHarga.setFont(new Font("Arial", Font.PLAIN, 18));

        labuttonbelInputJumlah.setBounds(40,140,400,100);
        labuttonbelInputJumlah.setFont(new Font("Arial", Font.PLAIN, 18));
        jumlahTextField.setBounds(250,180,160,28);

        buttonKembali.setBounds(40,220,160,30);
        buttonKembali.setFont(new Font("Arial", Font.PLAIN, 18));
        buttonKembali.setBackground(Color.lightGray);
        buttonKembali.addActionListener(e -> {

        });

        buttonBeli.setBounds(250,220,160,30);
        buttonBeli.setFont(new Font("Arial", Font.PLAIN, 18));
        buttonBeli.setBackground(Color.lightGray);
        buttonBeli.addActionListener(e -> {

            int jumlahMajalah = Integer.parseInt(jumlahTextField.getText());
            int totalHarga = jumlahMajalah * hargaMajalah;
            labelIsiTotalHarga.setText("Rp" + String.valueOf(totalHarga));

            labelIsiJumlah.setText(jumlahTextField.getText() + " pcs");

            add(labelTotalPembelian);
            add(labelHargaSatuan);
            add(labelIsiHargaSatuan);
            add(labelJumlah);
            add(labelIsiJumlah);
            add(labelTotalHarga);
            add(labelIsiTotalHarga);

            labelTotalPembelian.setBounds(40,270,200,28);
            labelTotalPembelian.setFont(new Font("Arial", Font.BOLD, 18));

            labelHargaSatuan.setBounds(40,300,200,28);
            labelHargaSatuan.setFont(new Font("Arial", Font.PLAIN, 18));
            labelIsiHargaSatuan.setBounds(250,300,200,28);
            labelIsiHargaSatuan.setFont(new Font("Arial", Font.PLAIN, 18));

            labelJumlah.setBounds(40,330,200,28);
            labelJumlah.setFont(new Font("Arial", Font.PLAIN, 18));
            labelIsiJumlah.setBounds(250,330,200,28);
            labelIsiJumlah.setFont(new Font("Arial", Font.PLAIN, 18));

            labelTotalHarga.setBounds(40,360,200,28);
            labelTotalHarga.setFont(new Font("Arial", Font.PLAIN, 18));
            labelIsiTotalHarga.setBounds(250,360,200,28);
            labelIsiTotalHarga.setFont(new Font("Arial", Font.PLAIN, 18));
        });

    }
}
