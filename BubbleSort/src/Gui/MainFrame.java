/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.JFrame;

/**
 *
 * @author megabit
 */
public class MainFrame extends JFrame{
    private PnlCenter centro;
    
    public MainFrame(){
        super("Sort");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 500);
        
        centro = new PnlCenter();
        centro.setListener(new PnlCenterActionListener() {
            @Override
            public void aceptarClick(Integer x) {
                System.out.println(x);
                //MainFrame.this.centro.ordenar();
            }

            @Override
            public void cleanClick() {
                centro.limpiar();
            }
        });
        super.add(centro);
        
        
        super.setVisible(true);
        
    }
}