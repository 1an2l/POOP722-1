/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author angel
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(587890);
        ger.setSueldo(25_000);
        System.out.println(ger);
        ger.aumentarSueldo(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: "+ger.getNombre());
        
        
        Gerente ger2 = new Gerente("Karen Avalos",596723,80_000,12_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Smanta Rios",956320,35_000);
        System.out.println(ger3);
        System.out.println("##############Instancias#################");
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es instancia de Gerente");
        }
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es instancia de Empleado");
        }
        if(ger3 instanceof Object){
            System.out.println("Gerente es instancia de Objet");
        }
    }
}
