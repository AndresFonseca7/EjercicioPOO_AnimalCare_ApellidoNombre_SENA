package Veterinaria;

public class Asistente extends Persona {
    public Asistente(String nombre, String identificacion, int edad, int turnosTrabajados, double pagoPorTurno) {
        super(nombre, identificacion, edad);
        this.turnosTrabajados = turnosTrabajados;
        this.pagoPorTurno = pagoPorTurno;
    }

    int turnosTrabajados;
    double pagoPorTurno;

    public int getTurnosTrabajados() {
        return turnosTrabajados;
    }

    public void setTurnosTrabajados(int turnosTrabajados) {
        this.turnosTrabajados = turnosTrabajados;
    }

    public double getPagoPorTurno() {
        return pagoPorTurno;
    }

    public void setPagoPorTurno(double pagoPorTurno) {
        this.pagoPorTurno = pagoPorTurno;
    }
    @Override
    public String describir() {
        return "Soy un asistente veterinario.";
    }
    //Polimorfismo: implementación concreta
    @Override
    public double calcularPago() {
        return turnosTrabajados * pagoPorTurno;
    }
    public String prepararEquipo() {
        return "El asistente preparó el equipo médico.";
    }

    }
