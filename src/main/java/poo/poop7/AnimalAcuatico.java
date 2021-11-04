/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.poop7;

/**
 *
 * @author equipo K
 */
public class AnimalAcuatico extends Animal {
    private int numAletas;
    
    public AnimalAcuatico(){
    }

    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numAletas) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }
    
    /**
     * 
     * @return numero de aletas del animal acuatico
     */
    public int getNumAletas() {
        return numAletas;
    }

    /**
     * Insertar el número de aletas
     * @param numAletas 
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    /**
     * Muestra el lugar donde el animal se enceuntra nadando
     * @param lugar 
     */
    public void nadar(String lugar){
        System.out.println("Estoy nadando en: " + lugar);
    }
    
    /**
     * Muestra el alimento de los animales acuaticos
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo crustaceos, algas, peces o plantom");
    }

    @Override
    public String toString() {
        return super.toString() + " AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
}
