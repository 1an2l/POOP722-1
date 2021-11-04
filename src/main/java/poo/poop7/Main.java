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
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raul Jiminez");
        ger.setNumEmpleado(323890);
        ger.setSueldo(25_000);
        
        System.out.println(ger);
        
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: " + ger.getNombre());
        
        Gerente ger2 = new Gerente("Karen Avalos", 596723, 80_000, 120_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Smantha Rios", 956320, 35_000);
        System.out.println(ger3);
        System.out.println("------- Instancias -------");
        
        if (ger3 instanceof Gerente) {
            System.out.println("Gerente es instancia de Gerente");    
        }
        if (ger3 instanceof Empleado) {
            System.out.println("Gerente es instancia de Empleado");
        }
        if (ger3 instanceof Object) {
            System.out.println("Gerente es instancia de Objeto");
            
        }
        
        System.out.println("----- Animal ----- ");
        Animal an = new Animal("Pez Lagarto", "Filipinas", "blanco");
        System.out.println(an);
        
        System.out.println("----- Animal Acuatico----- ");
        AnimalAcuatico anAc = new AnimalAcuatico("Calamar", "Brucelas", "Rojo", 8);
        System.out.println(anAc);
        Ballena ballena = new Ballena("Orca", "Mar Artico", "Blanco/Negro", 2, 6);
        System.out.println(ballena);
        
        System.out.println("----- Animal Terreste----- ");
        AnimalTerrestre anTer = new AnimalTerrestre("Leon", "Africa", "Amarillo", 4);
        System.out.println(anTer);
        Perro perro = new Perro("Antiguo Pastor Ingles","Irlanda", "Negro/blanco", 4, "Rojo");
        System.out.println(perro);
        
        System.out.println("----- Animal Aereo----- ");
        AnimalAereo anAer = new AnimalAereo("Aguila", "Bosque", "Cafe/blanco", 2);
        System.out.println(anAer);
        Pajaro pajaro = new Pajaro("Guacamaya", "Oaxaca", "Amarillo/Rojo", 2, "Ganchudo");
        System.out.println(pajaro);
    }
    
}
