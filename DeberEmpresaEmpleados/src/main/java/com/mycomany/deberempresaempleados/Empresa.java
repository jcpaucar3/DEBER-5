package com.mycomany.deberempresaempleados;
import java.util.*;

public class Empresa {

    private String nombre;
    private String ruc;
    private String direccion;
    private String email;
    private final List<Empleado> empleados;

    // Constructor
    public Empresa(String nombre, String ruc, String direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.empleados = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos para gestionar empleados

    public void añadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public String eliminarEmpleadoPorCedula(String cedula) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            if (empleado.getCedula().equals(cedula)) {
                empleados.remove(i);
                return empleado.getNombre();
            }
        }
        return null;
    }

    public Empleado buscarEmpleadoPorCedula(String cedula) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado;
            }
        }
        return null;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // Métodos para acceder a la información de los empleados desde la clase principal
    public String getEmpleadoNombre(String cedula) {
        Empleado empleado = buscarEmpleadoPorCedula(cedula);
        return empleado != null ? empleado.getNombre() : null;
    }

    public void setEmpleadoNombre(String cedula, String nombre) {
        Empleado empleado = buscarEmpleadoPorCedula(cedula);
        if (empleado != null) {
            empleado.setNombre(nombre);
        }
    }

    public double getEmpleadoSalario(String cedula) {
        Empleado empleado = buscarEmpleadoPorCedula(cedula);
        return empleado != null ? empleado.getSalario() : 0;
    }

    public void setEmpleadoSalario(String cedula, double salario) {
        Empleado empleado = buscarEmpleadoPorCedula(cedula);
        if (empleado != null) {
            empleado.setSalario(salario);
        }
    }
}