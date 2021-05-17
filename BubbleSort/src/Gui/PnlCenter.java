/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Burbuja.Sort;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author megabit
 */
public class PnlCenter extends JPanel {

    private Integer matriz[];
    PnlCenterActionListener listener;

    private JProgressBar pb1;
    private JProgressBar pb2;
    private JProgressBar pb3;
    private JProgressBar pb4;
    private JProgressBar pb5;
    private JProgressBar pb6;
    private JProgressBar pb7;
    private JProgressBar pb8;
    private JProgressBar pb9;
    private JProgressBar pb10;

    private JLabel lblNoNumeros;
    private JTextField txtNoNumeros;
    private JButton btnAceptar;
    private JButton btnClean;

    public PnlCenter() {

        lblNoNumeros = new JLabel("Cantidad de numeros a ordenar: ");
        txtNoNumeros = new JTextField(15);
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                matriz = new Integer[Integer.parseInt(txtNoNumeros.getText())];
                ordenar();

            }
        });

        btnClean = new JButton("Clean");
        btnClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.cleanClick();
                limpiar();
            }
        });

        pb1 = new JProgressBar();
        pb1.setValue(0);
        pb1.setStringPainted(true);
        pb2 = new JProgressBar();
        pb2.setValue(0);
        pb2.setStringPainted(true);
        pb3 = new JProgressBar();
        pb3.setValue(0);
        pb3.setStringPainted(true);
        pb4 = new JProgressBar();
        pb4.setValue(0);
        pb4.setStringPainted(true);
        pb5 = new JProgressBar();
        pb5.setValue(0);
        pb5.setStringPainted(true);
        pb6 = new JProgressBar();
        pb6.setValue(0);
        pb6.setStringPainted(true);
        pb7 = new JProgressBar();
        pb7.setValue(0);
        pb7.setStringPainted(true);
        pb8 = new JProgressBar();
        pb8.setValue(0);
        pb8.setStringPainted(true);
        pb9 = new JProgressBar();
        pb9.setValue(0);
        pb9.setStringPainted(true);
        pb10 = new JProgressBar();
        pb10.setValue(0);
        pb10.setStringPainted(true);

        super.add(lblNoNumeros);
        super.add(txtNoNumeros);
        super.add(btnAceptar);
        super.add(btnClean);

        pb1.setValue(0);
        pb2.setValue(0);
        pb3.setValue(0);

        super.add(pb1);
        super.add(pb2);
        super.add(pb3);
        super.add(pb4);
        super.add(pb5);
        super.add(pb6);
        super.add(pb7);
        super.add(pb8);
        super.add(pb9);
        super.add(pb10);
        GridLayout gridLayout = new GridLayout(7, 2);
        gridLayout.setHgap(40);
        gridLayout.setVgap(40);
        this.setLayout(gridLayout);
    }

    public void ordenar() {
        pb1.setMaximum(noComparaciones(matriz.length)/10);
        System.out.println(matriz.length / 10);
        Sort sort = new Sort(pb1, matriz.length / 10);

        pb2.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort2 = new Sort(pb2, matriz.length / 10);

        pb3.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort3 = new Sort(pb3, matriz.length / 10);
        
        pb4.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort4 = new Sort(pb4, matriz.length / 10);
        
        pb5.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort5 = new Sort(pb5, matriz.length / 10);
        
        pb6.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort6 = new Sort(pb6, matriz.length / 10);
        
        pb7.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort7 = new Sort(pb7, matriz.length / 10);

        pb8.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort8 = new Sort(pb8, matriz.length / 10);
        
        pb9.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort9 = new Sort(pb9, matriz.length / 10);
        
        pb10.setMaximum(noComparaciones(matriz.length)/10);
        Sort sort10 = new Sort(pb10, matriz.length / 10);

    }

    public void sort(JProgressBar aux) {

    }

    private Integer noComparaciones(Integer total) {
        
        return (int) (((Math.pow(total, 2)) - total) / 2) / 10;
    }

    public void setListener(PnlCenterActionListener listener) {
        this.listener = listener;
    }

    void limpiar() {
        this.txtNoNumeros.setText("");

        pb1.setValue(0);
        pb1.setStringPainted(true);

        pb2.setValue(0);
        pb2.setStringPainted(true);

        pb3.setValue(0);
        pb3.setStringPainted(true);
        
        pb4.setValue(0);
        pb4.setStringPainted(true);
        
        pb5.setValue(0);
        pb5.setStringPainted(true);
        
        pb6.setValue(0);
        pb6.setStringPainted(true);
        
        pb7.setValue(0);
        pb7.setStringPainted(true);
        
        pb8.setValue(0);
        pb8.setStringPainted(true);
        
        pb9.setValue(0);
        pb9.setStringPainted(true);
        
        pb10.setValue(0);
        pb10.setStringPainted(true);
        
    }
}



        
//
//        super.add(lblNoNumeros);
//        super.add(txtNoNumeros);
//        super.add(btnAceptar);
//        super.add(btnClean);
//
//        pb1.setValue(0);
//        pb2.setValue(0);
//        pb3.setValue(0);
//        pb4.setValue(0);
//        pb5.setValue(0);
//        pb6.setValue(0);
//        pb7.setValue(0);
//        pb8.setValue(0);
//        pb9.setValue(0);
//        pb10.setValue(0);
//        super.add(pb1);
//        super.add(pb2);
//        super.add(pb3);
