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
public class HiloTheread extends Thread{
    /**
     * 
     * @param nombre utilizara el nombre de las iteraciones 
     */
    public HiloTheread(String nombre){
        super(nombre);
    }
    /**
     * Iteraciones 
     */
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+(i)+" de " +getName());
        }
        System.out.println("Termina el hilo "+getName());
    }
}
