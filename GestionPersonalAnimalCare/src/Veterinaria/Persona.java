package Veterinaria;

public abstract class Persona {
    String nombre;
    String identificacion;
    int edad;

    public Persona(String nombre, String identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Abstracción: comportamiento que cada tipo de persona define a su manera
    public abstract String describir();

    //Abstracción y Polimorfismo: cada subclase calcula pago de forma distinta
    public abstract double calcularPago();


    @Override
    public String toString() {
        return  getClass().getSimpleName() + "[nombre=" + nombre + ", edad=" + edad + "]" ;}


}