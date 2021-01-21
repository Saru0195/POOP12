/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoHilos;

/**
 *
 * @author Sarahi
 */
public class GrupoHilos extends Thread {
    /**
     * 
     * @param g Es el grupo de los hilos 
     * @param n Es el nombre de los hilos 
     */
    public GrupoHilos(ThreadGroup g, String n){
        super(g,n);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() +"iteracion "+ i);
        }
    }   
}