/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tigo;

/**
 *
 * @author MARTI
 */
public class PlanlPhone extends Plan{
    private String emailTunes;

    public PlanlPhone(String numeroDeTelefono, String nombreDeCliente, String emailTunes) {
        super(numeroDeTelefono, nombreDeCliente);
        this.emailTunes=emailTunes;
        
    }
    public String getEmailTunes(){
        return emailTunes;
    }

    @Override
    public double pagoMensual(int mins, int msgs) {
        
        double cobroPlan=22;
        double cobroMins= 0.4*mins;
        double cobroMsgs=0.1*msgs;
        
        double pagoTotal=cobroPlan+cobroMins+cobroMsgs;
        return pagoTotal;
   
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Email de iTunes: "+emailTunes);
    }
   
  
    
    
}


