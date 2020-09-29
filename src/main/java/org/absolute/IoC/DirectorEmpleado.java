package org.absolute.IoC;

public class DirectorEmpleado implements Empleados {
    //creacion de campo tipo creacioninformes (interfaz)
    private CreacionInformes creacionInformes;
    //creacion de constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes creacionInformes){
        this.creacionInformes = creacionInformes;
    }
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    public String getInforme() {
        return "Informe creado por el Director: "+creacionInformes.getInforme();
    }
}
