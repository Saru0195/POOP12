/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Sarahi
 */
public class HiloRunnable implements Runnable{
    /**
     * Hilo con metodo run()
     */
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" de "+Thread.currentThread().getName());
        }
        System.out.println("Termina el hilo "+Thread.currentThread().getName());
    }
    
}
