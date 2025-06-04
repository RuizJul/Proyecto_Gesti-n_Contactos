/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Contacto implements Serializable {
    private String nombre;
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

     // Métodos para teléfonos
    public void agregarTelefono(String numero) {
        telefonos.agregar(numero);
    }

    public boolean eliminarTelefono(String numero) {
        return telefonos.eliminar(numero);
    }

    public boolean editarTelefono(String anterior, String nuevo) {
        return telefonos.editar(anterior, nuevo);
    }

    // Métodos para emails
    public void agregarEmail(String email) {
        emails.agregar(email);
    }

    public boolean eliminarEmail(String email) {
        return emails.eliminar(email);
    }

    public boolean editarEmail(String anterior, String nuevo) {
        return emails.editar(anterior, nuevo);
    }

    // Métodos para redes sociales
    public void agregarRedSocial(String red) {
        redesSociales.agregar(red);
    }

    public boolean eliminarRedSocial(String red) {
        return redesSociales.eliminar(red);
    }

    public boolean editarRedSocial(String anterior, String nuevo) {
        return redesSociales.editar(anterior, nuevo);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfonos:");
        telefonos.mostrar();
        System.out.println("Emails:");
        emails.mostrar();
        System.out.println("Redes sociales:");
        redesSociales.mostrar();
    }
}
