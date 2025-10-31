package Veterinaria;

public class Pasante extends Persona {
    int horasDePractica;

    public Pasante(String nombre, String identificacion, int edad, int horasDePractica) {
        super(nombre, identificacion, edad);
        this.horasDePractica = horasDePractica;
    }

    public int getHorasDePractica() {
        return horasDePractica;
    }

    public void setHorasDePractica(int horasDePractica) {
        this.horasDePractica = horasDePractica;
    }
    @Override
    public String describir() {
        return "Soy un pasante en formación en la clínica AnimalCare.";
    }
    @Override
    public double calcularPago() {
        return horasDePractica * 8000;
    }
    @Override
    public String toString() {
        return  getClass().getSimpleName() + "[Horas De Practica=" + horasDePractica + "]";}


}


