/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burbuja;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author megabit
 */
public class Sort extends Thread {

    private int arr[];
    private int matriz[];

    private JProgressBar bar = new JProgressBar();

    public Sort(Integer x) {

        this.matriz = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = rand.nextInt(100);
        }
    }

    public Sort(JProgressBar aux, int total) {
        this.bar = aux;

        this.matriz = new int[total];
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = rand.nextInt(100);
        }

        start();
        aux = bar;

    }

    @Override
    public void run() {
        int n = matriz.length;
        int temp = 0;
        int contador = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {
                if (matriz[j - 1] > matriz[j]) {

                    temp = matriz[j - 1];
                    matriz[j - 1] = matriz[j];
                    matriz[j] = temp;
                }
                contador++;
                bar.setValue(contador);
            }

        }
        System.out.println("finish");
    }

    public void bubbleSort() {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
