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
public class ClaseMain {
    /**
     * 
     * @param args En esta actividad podemos ver la prioridad de los hilos, y su ejecucion 
     */
    public static void main(String[] args) {
        ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal ");
        Thread hilo1 = new GrupoHilos(grupoHilos,"Hilos 1 con prioridad maxima ");
        Thread hilo2 = new GrupoHilos(grupoHilos,"Hilos 2 con prioridad normal ");
        Thread hilo3 = new GrupoHilos(grupoHilos,"Hilos 3 con prioridad normal ");
        Thread hilo4 = new GrupoHilos(grupoHilos,"Hilos 4 con prioridad normal ");
        Thread hilo5 = new GrupoHilos(grupoHilos,"Hilos 5 con prioridad normal ");
        
        hilo1.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Prioridad promedio del grupo "+grupoHilos.getMaxPriority());
    
        System.out.println("Prioridad Hilo 1 = "+hilo1.getPriority());
        System.out.println("Prioridad Hilo 2 = "+hilo2.getPriority());
        System.out.println("Prioridad Hilo 3 = "+hilo3.getPriority());
        System.out.println("Prioridad Hilo 4 = "+hilo4.getPriority());
        System.out.println("Prioridad Hilo 5 = "+hilo5.getPriority());
        
        System.out.println("\n");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listaHilos(grupoHilos);
    }
    /**
     * 
     * @param grupoActual Genera las iteraciones de los hilos 
     */
     public static void listaHilos(ThreadGroup grupoActual){
        int numHilos;
        Thread[] listaDeHilos;
        
        numHilos = grupoActual.activeCount();
        listaDeHilos = new Thread[numHilos];
        grupoActual.enumerate(listaDeHilos);
        System.out.println("Numero de Hilos Activos: "+ numHilos);
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Hilo activo "+i+" = "+ listaDeHilos[i].getName());
        }
    }
}
