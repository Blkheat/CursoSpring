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

    //metodo init
    public void metodoInicial(){
        System.out.println("Dentro del mtodo init, aqui irian las tareas a ejecutar antes de que el bean este listo");
    }

    public void metodoFinal(){
        System.out.println("dentro del metodo destroy aqui irian las tareas ejecutar despues de utilizar el bean");
    }
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
}
