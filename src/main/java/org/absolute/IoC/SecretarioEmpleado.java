package org.absolute.IoC;

public class SecretarioEmpleado implements Empleados{
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    public String getInforme() {
        return "Informe generado por el secretario: "+creacionInformes.getInforme();
    }
    private CreacionInformes creacionInformes;

    public void setCreacionInformes(CreacionInformes creacionInformes) {
        this.creacionInformes = creacionInformes;
    }
}
