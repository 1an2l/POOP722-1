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
public class Gerente extends Empleado {
    private int presupuesto;
    private boolean presupuestoAsignado;

    Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    public Gerente(String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
    }

    /**
     * 
     * @return  presupuesto 
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    
    /**
     * Insertar el presupuesto
     * @param presupuesto 
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Determina si hay presupuesto asignado o no
     * @param presupuesto 
     */
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
    
    
}
