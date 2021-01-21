/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 * En esta practica hemos usado diferentes hilos
 * @author Sarahi
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HiloTheread hilo = new HiloTheread("Primer hilo Thread");
        hilo.start();
        /*
        new HiloTheread("Segundo Hilo").start();
        System.out.println("Termina el hilo principal");
        */
        new Thread(new HiloRunnable(),"Primer hilo Runnable").start();
        new Thread(new HiloRunnable(),"Segundo hilo Runnable").start();
        System.out.println("Termina el hilo principal");
    }   
    
}
