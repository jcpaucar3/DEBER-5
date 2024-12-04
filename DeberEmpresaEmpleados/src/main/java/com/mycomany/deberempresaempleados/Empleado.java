package com.mycomany.deberempresaempleados;

public class Empleado {
    private String nombre;
    private String cedula;
    private double salario;

    // Constructor
    public Empleado(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}