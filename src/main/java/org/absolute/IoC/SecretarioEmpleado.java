package org.absolute.IoC;

public class SecretarioEmpleado implements Empleados{
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    public String getInforme() {
        return "Informe generado por el secretario: "+creacionInformes.getInforme();
    }
    private CreacionInformes creacionInformes;
    private String email;
    private String nombreEmpresa;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setCreacionInformes(CreacionInformes creacionInformes) {
        this.creacionInformes = creacionInformes;
    }
}
