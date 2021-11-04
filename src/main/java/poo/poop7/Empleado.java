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
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

//    public Empleado(String nombre, int numEmpleado, int sueldo, int algoMas) {
//        this.nombre = nombre;
//        this.numEmpleado = numEmpleado;
//        this.sueldo = sueldo;
//    }
    /**
     * 
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Insertar el nombre del empleado
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return  número de empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Insertar el número de empleado
     * @param numEmpleado 
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * 
     * @return sueldodel empleado 
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Insertar el sueldo del empleado
     * @param sueldo 
     */
    public void setSueldo(int sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        }else{
            this.sueldo = 0;
        }
    }
    /**
     * Aumenta el suledo en un cierto porcentaje
     * @param porcentaje
     * @return sueldo
     */
    public int aumentarSueldo(int porcentaje){
        sueldo += (sueldo * porcentaje / 100);
        return sueldo;
    }

  
    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
