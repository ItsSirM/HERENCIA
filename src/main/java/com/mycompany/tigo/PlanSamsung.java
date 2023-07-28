/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tigo;

import java.util.ArrayList;

/**
 *
 * @author MARTI
 */
public class PlanSamsung extends Plan{
     
    private String Pin;
    private ArrayList<String> bbm;

    public PlanSamsung(String Pin, String numeroDeTelefono, String nombreDeCliente) {
        super(numeroDeTelefono, nombreDeCliente);
        this.Pin = Pin;
        this.bbm = new ArrayList<>();
    }

    @Override
    public double pagoMensual(int mins, int msgs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    

    
    
    
    
    
    
    
    
    
    
}
