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
     private String pin;
    private ArrayList<String> pines;

    public PlanSamsung(String pin, String numeroDeTelefono, String nombreDeCliente) {
        super(numeroDeTelefono, nombreDeCliente);
        this.pin = pin;
        this.pines = new ArrayList<>();
    }

    

    public String getPin() {
        return pin;
    }

    public void agregarPinAmigo(String pinAmigo) {
        if (!pines.contains(pinAmigo)) {
            pines.add(pinAmigo);
        }
    }

    @Override
    public double pagoMensual(int mins, int msgs) {
        double costoPlan = 40;
        int minutosGratis = 200;
        int mensajesGratis = 300;

        int minutosAdicionales = Math.max(0, mins - minutosGratis);
        int mensajesAdicionales = Math.max(0, msgs - mensajesGratis);

        double costoMinutos = 0.8 * minutosAdicionales;
        double costoMensajes = 0.2 * mensajesAdicionales;

        return costoPlan + costoMinutos + costoMensajes;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("PIN: " + pin);
    }
}
    
    
    
    
    
    
    


    

    

    
    
    
    
    
    
    
    
    
    

