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
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;
    
    public Animal(){
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Insertar el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return lugar de Origen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Insertar lugar de Origen
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Insertar color del animal
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Muestra el nombre del sonido que emiten los animales
     * @param sonido 
     */
    public void sonido(String sonido){
        System.out.println("Yo hago el sonido: " + sonido);
    }
    
    /**
     * Indica que los animales estan comiendo
     * 
     */
    public void comer(){
        System.out.println("Esotoy comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
