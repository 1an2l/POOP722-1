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
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(String nombre, String lugarOrigen, String color,int numeroPatas) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    /**
     * 
     * @return Número de patas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * Insertar el número de patas
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    /**
     * Muestra que el animal esta corriendo
     */
    public void correr(){
        System.out.println("Puedo Correr");
    }
    
    /**
     * Muestra el alimento más común de los animales terrestres
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo insectos, carne, semillas, plantas, ect.");
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
    
    
}
