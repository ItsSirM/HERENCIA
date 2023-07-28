/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tigo;

/**
 *
 * @author MARTI
 */
public abstract class Plan {
    private String numeroDeTelefono;
    private String nombreDeCliente;
    
    public Plan(String numeroDeTelefono, String nombreDeCliente){
        this.numeroDeTelefono=numeroDeTelefono;
        this.nombreDeCliente=nombreDeCliente;
        
    }
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    public String getNombreDeCliente(){
        return nombreDeCliente;
    }
    public abstract double pagoMensual(int mins, int msgs);
    
    public void imprimir(){
        System.out.println("Numero del cliente: "+numeroDeTelefono);
        System.out.println("Nombre del cliente: "+nombreDeCliente);
        
    }
}