package com.mycomany.deberempresaempleados;

public class DeberEmpresaEmpleados {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Alter Core", "1754245197001", "Conocoto, Oe6a y Luis Cordero", "altercore.ec@gmail.com");
        
        System.out.println("Datos de la empresa:");
        System.out.println("Nombre: " + empresa.getNombre());
        System.out.println("RUC: " + empresa.getRuc());
        System.out.println("Direccion: " + empresa.getDireccion());
        System.out.println("Email: " + empresa.getEmail());


        Empleado empleado1 = new Empleado("Juan Paucar", "1754245197", 1500.0);
        Empleado empleado2 = new Empleado("Ariela Madrid", "1753822780", 1800.0);
        Empleado empleado3 = new Empleado("Maria Belen Madrid", "1234567890",1000.0);

        empresa.añadirEmpleado(empleado1);
        empresa.añadirEmpleado(empleado2);
        empresa.añadirEmpleado(empleado3);
                
        Empleado encontrado = empresa.buscarEmpleadoPorCedula("1753822780");
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Empleado no encontrado");
        }

        String eliminado = empresa.eliminarEmpleadoPorCedula("1234567890");
        if (eliminado != null) {
            System.out.println("Empleado eliminado: " + eliminado);
        } else {
            System.out.println("Empleado no encontrado para eliminar");
        }
    }
}
    
