package org.absolute.IoC;

public class JefeEmpleado implements Empleados {
    private CreacionInformes creacionInformes;

    public JefeEmpleado(CreacionInformes creacionInformes) {
        this.creacionInformes = creacionInformes;
    }

    public String getTareas(){
        return "Gestiono las cuestiones relativas a mis empleados de sección";
    }

    public String getInforme() {
        return "Informe presentado por el Jefe con arreglos: "+creacionInformes.getInforme();
    }
}
