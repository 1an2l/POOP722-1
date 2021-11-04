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
public class Ballena extends AnimalAcuatico{
    private int largo;
    
    public Ballena(){
    }

    public Ballena(String nombre, String lugarOrigen, String color, int numAletas, int largo) {
        super(nombre, lugarOrigen, color, numAletas);
        this.largo = largo;
    }

    /**
     * 
     * @return largo 
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Insertar largo de la ballena
     * @param largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Muestra que la ballena esta peleando con Pinocho en el mar
     */
    public void pelearConPinocho(){
        System.out.println("Esoty peleando con Pinocho en el Mar");
    }

    @Override
    public String toString() {
        return super.toString() + " Ballena{" + "largo=" + largo + '}';
    }
    
}
