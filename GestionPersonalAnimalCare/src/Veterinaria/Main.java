package Veterinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {


            System.out.println("=========================================");


            System.out.println("Ingrese el nombre del Veterinario: ");
            String nombreE = sc.nextLine();
            System.out.println("Ingrese edad del Veterinario: ");
            int edadE = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la identifiacacion del Veterinario: ");
            String identificacionE = sc.nextLine();
            System.out.println("Ingrese la especialidad del Veterinario: ");
            String especialidadE = sc.nextLine();
            System.out.println("Ingrese salario base del Veterinario: ");
            double salarioE = Double.parseDouble(sc.nextLine());


            System.out.println("=========================================");


            System.out.println("Ingrese el nombre del Asistente: ");
            String nombreG = sc.nextLine();
            System.out.println("Ingrese edad del Asistente: ");
            int edadG = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la identifiacacion del Asistente: ");
            String identificacionG = sc.nextLine();
            System.out.println("Ingrese salario base del Asistente: ");
            double salarioG = Double.parseDouble(sc.nextLine());

            System.out.println("=========================================");

            System.out.println("Ingrese el nombre del Pasante: ");
            String nombreP = sc.nextLine();
            System.out.println("Ingrese edad del Pasante: ");
            int edadP = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la identifiacacion del Pasante: ");
            String identificacionC = sc.nextLine();
            System.out.println("Ingrese salario base del Pasante: ");
            double salarioP = Double.parseDouble(sc.nextLine());

            //toString
            System.out.println(e1.toString());
            System.out.println(g1.toString());

            //Polimorfismo: referencia base
            Persona[] personas = new Persona[] {e1,g1};
            for(Persona p : personas){
                System.out.println(p.describir());
                System.out.println("Pago= " +p.calcularPago());
            }

            //Sobrecarga en Empleado
            System.out.println("Ingrese bono para el empleado: ");
            double bonoE = Double.parseDouble(sc.nextLine());
            System.out.println("Pago empleado con bono: " + e1.calcularPago(bonoE));

            //Sobrecarga y sobrescritura en Gerente
            System.out.println(g1.trabajar());
            System.out.println("Ingrese horas trabajadas del gerente: ");
            int horasG=  Integer.parseInt(sc.nextLine());
            System.out.println(g1.trabajar(horasG));

            System.out.println("Ingrese bono variable para el gerente:");
            double bonoVar = Double.parseDouble(sc.nextLine());
            System.out.println("Ingrese bono de liderazgo para el gerente:");
            double bonoLider = Double.parseDouble(sc.nextLine());
            System.out.println("Pago gerente con bonos: " + g1.calcularPago(bonoVar, bonoLider));

            //Interfaz y reporte
            System.out.println(((Reportable)e1).generarReporte());
            System.out.println("¿Gerente implementa Reportable? " + (1 instanceof Reportable));

        }
    }
}
