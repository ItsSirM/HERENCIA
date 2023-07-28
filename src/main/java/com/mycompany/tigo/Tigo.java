/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tigo;

/**
 *
 * @author MARTI
 */
import java.util.ArrayList;

enum ReferenciaObjetoEnum {
    IPHONE, SAMSUNG
}

public class Tigo {
    private ArrayList<Plan> planes;

    public Tigo() {
        this.planes = new ArrayList<>();
    }

    public void agregarPlan(int numeroTel, String nombre, String extra, ReferenciaObjetoEnum tipo) {
        // Check if the number already exists
        if (busqueda(numeroTel, extra, tipo)) {
            System.out.println("El número telefónico ya existe o el dato extra ya está registrado.");
            return;
        }

        Plan plan = null;
        if (tipo == ReferenciaObjetoEnum.IPHONE) {
            plan = new PlanlPhone(String.valueOf(numeroTel), nombre, extra);
        } else if (tipo == ReferenciaObjetoEnum.SAMSUNG) {
            plan = new PlanSamsung(extra, String.valueOf(numeroTel), nombre);
        }

        if (plan != null) {
            planes.add(plan);
            System.out.println("Plan agregado correctamente.");
        } else {
            System.out.println("Tipo de plan no válido.");
        }
    }

    public boolean busqueda(int numeroTel, String datoExtra, ReferenciaObjetoEnum tipo) {
        for (Plan plan : planes) {
            if (plan.getNumeroDeTelefono().equals(String.valueOf(numeroTel))) {
                return true;
            }
            if (tipo == ReferenciaObjetoEnum.SAMSUNG && plan instanceof PlanSamsung) {
                PlanSamsung samsungPlan = (PlanSamsung) plan;
                if (samsungPlan.getPin().equals(datoExtra)) {
                    return true;
                }
            }
            if (tipo == ReferenciaObjetoEnum.IPHONE && plan instanceof PlanlPhone) {
                PlanlPhone iphonePlan = (PlanlPhone) plan;
                if (iphonePlan.getEmailTunes().equals(datoExtra)) {
                    return true;
                }
            }
        }
        return false;
    }

    public double pagoPlan(int numeroTel, int mins, int msgs) {
        for (Plan plan : planes) {
            if (plan.getNumeroDeTelefono().equals(String.valueOf(numeroTel))) {
                return plan.pagoMensual(mins, msgs);
            }
        }
        System.out.println("El número telefónico no existe.");
        return 0;
    }

    public void agregarAmigo(int numeroTel, String pin) {
        for (Plan plan : planes) {
            if (plan.getNumeroDeTelefono().equals(String.valueOf(numeroTel))) {
                if (plan instanceof PlanSamsung) {
                    PlanSamsung samsungPlan = (PlanSamsung) plan;
                    samsungPlan.agregarPinAmigo(pin);
                    System.out.println("Amigo agregado correctamente.");
                    return;
                } else {
                    System.out.println("El plan asociado al número no es Samsung.");
                    return;
                }
            }
        }
        System.out.println("El número telefónico no existe.");
    }

    public void lista() {
        int numSamsung = 0;
        int numIPhone = 0;

        for (Plan plan : planes) {
            plan.imprimir();
            if (plan instanceof PlanSamsung) {
                numSamsung++;
            } else if (plan instanceof PlanlPhone) {
                numIPhone++;
            }
        }

        System.out.println("Total de planes Samsung: " + numSamsung);
        System.out.println("Total de planes iPhone: " + numIPhone);
    }
}