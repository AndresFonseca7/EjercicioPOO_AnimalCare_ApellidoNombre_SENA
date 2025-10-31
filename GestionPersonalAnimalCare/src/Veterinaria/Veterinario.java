package Veterinaria;

public class Veterinario extends Persona implements Reportable {
    private int numeroEmpleados;

    public Veterinario(String nombre, String identificacion, int edad, String especialidad, int numeroEmpleados, double salarioBase) {
        super(nombre, identificacion, edad);
        this.especialidad = especialidad;
        this.numeroEmpleados = numeroEmpleados;
        this.salarioBase = salarioBase;
    }

    String especialidad;
    double salarioBase;

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public String describir() {
        return "Soy un veterinario especializado en [especialidad].";
    }

    //Polimorfismo: implementación concreta
    @Override
    public double calcularPago() {
        return salarioBase * 1.10;
    }
    public String nombreMascota(){
        return "“El veterinario atendió a [nombreMascota].";

    }
    @Override
    public String generarReporte(){
        return "Reporte de empleado: nombre=" + getNombre()
                + ", especialidad=" + getEspecialidad()
                + ", calcularPago=" + calcularPago();
    }

}





