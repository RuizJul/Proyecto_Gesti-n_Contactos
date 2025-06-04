/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Julian
 */
//Clase base para una lista circular. Enlaza un nodo con su nodo anterior y siguiente
public class NodoDobleCircular<T> {
    T dato;
    NodoDobleCircular siguiente;
    NodoDobleCircular anterior;
    
    public NodoDobleCircular(T dato){
        this.dato=dato;
        this.siguiente=this;
        this.anterior=this;
    }
}
