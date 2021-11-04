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
public class Perro extends AnimalTerrestre{
    private String colorCollar;

    public Perro() {
    }

    public Perro(String nombre, String lugarOrigen, String color, int numeroPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numeroPatas);
        this.colorCollar = colorCollar;
    }

    /**
     * 
     * @return color del collar 
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Insertar el color del collar del perro
     * @param colorCollar 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Muestra los posibles trucos que puede hacer un perro
     */
    public void hacerTrucos(){
        System.out.println(" Saltando en dos patitas y saltar muy alto");
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    /**
     * Muestra el alimento de un perro
     */
    @Override
    public void comer(){
        System.out.println("Estos comiendo croquetas con bistec");
    }

}
