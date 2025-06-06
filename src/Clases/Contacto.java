/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EstructurasDeDatos.*;
import java.io.Serializable;
/**
 *
 * @author Julian
 */
public abstract class Contacto implements Serializable {
    private String nombre;
    private ListaDobleCircular fotos;
    private ListaSimple telefonos;
    private ListaSimple emails;
    private ListaSimple redesSociales;
    private ListaSimple direcciones;
    private ListaSimple fechasImportantes;
    private ListaSimple contactosRelacionados;
    
    public Contacto(String name){
        this.nombre=name;
        this.telefonos= new ListaSimple();
        this.emails=new ListaSimple();
        this.redesSociales=new ListaSimple();
        this.direcciones=new ListaSimple();
        this.fechasImportantes=new ListaSimple();
        this.contactosRelacionados=new ListaSimple();
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public void agregarFoto(String ruta) {
    fotos.agregar(ruta);
}

public boolean eliminarFoto(String ruta) {
    return fotos.eliminar(ruta);
}


    public void mostrarDatos() {//Metodo para probar el codigo, luego se debe borrar
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfonos:");
        telefonos.mostrar();
        System.out.println("Emails:");
        emails.mostrar();
        System.out.println("Redes sociales:");
        redesSociales.mostrar();
    }
}
