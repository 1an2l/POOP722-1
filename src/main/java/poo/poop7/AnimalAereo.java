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
public class AnimalAereo extends Animal {
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    /**
     * 
     * @return Número de alas 
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * Insertar el número de alas del ave
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Muestra que el ave esta volando
     */
    public void volar(){
        System.out.println("Estoy volando");
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    /**
     * Muestra el alimento de las aves
     */
    @Override
    public void comer() {
        System.out.println("Esotoy comiendo alpiste, insectos o fruta");
    }
}
