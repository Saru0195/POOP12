/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 * Esta clase hace que los subprocesos se sincronizen
 * @author Sarahi
 */
public class Cuenta extends Thread {
    private static long saldo = 0;
    /**
     * 
     * @param nombre Crea el nombre de la cuenta
     */
    public Cuenta (String nombre){
        super(nombre);
    }
    
    public void run(){
        if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositarDinero(100);
        } else {
            this.extraerDinero(50);
        }
        System.out.println("Termina el " +getName());
    }
    /**
     * 
     * @param cantidad En este metodo agrega dinero en la cuenta
     */
    public synchronized void depositarDinero(int cantidad){
        saldo += cantidad;
        System.out.println("Se depositaron " +cantidad+ " pesos");
                notifyAll();
    }
    /**
     * 
     * @param cantidad extraerDinero retira dinero de la cuenta
     */
    public synchronized void extraerDinero(int cantidad){
        try{
            if(saldo <= 0){
                System.out.println(getName() + " espera deposito " 
                        + "\nSaldo = " +saldo);
                        sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        saldo -= cantidad;
        System.out.println(getName() + " extrajo " + cantidad + 
                " pesos.\nSaldo restante = "+ saldo);
                notifyAll();
    }
    /**
     * 
     * @param args Genera la cuenta y realiza las acciones 
     */
    public static void main(String[] args) {
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal");
    }
}
