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
public class Pajaro extends AnimalAereo {
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas,String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }

    /**
     * 
     * @return tipo de pico 
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Insertar el tipo de pico del ave
     * @param tipoPico 
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Muestra que el ave esta recolectando ramas para un cierto proposito
     */
    public void recolectarRamas(){
        System.out.println("Estoy haciendo mi nido con ramas");
    }

    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    /**
     * Muestra el alimento de un pajaro
     */
    @Override
    public void comer() {
        System.out.println("Estoy comiendo Alpiste");
    }

    /**
     * Muestra donde suele volar un pajaro
     */
    @Override
    public void volar() {
        System.out.println("Esoty volando en las calles y parques");
    }
}
