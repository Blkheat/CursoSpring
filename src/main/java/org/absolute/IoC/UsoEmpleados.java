package org.absolute.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class UsoEmpleados {
    public static void main(String[] args) {
        //creación de objetos de tipos empleados
//        Empleados jefeEmpleado1= new DirectorEmpleado();
//
//        //uso de los objetos creados
//        System.out.println("jefeEmpleado1.getTareas() = " + jefeEmpleado1.getTareas());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Empleados Juan = context.getBean("miEmpleado",Empleados.class);
//        System.out.println("args = " + Juan.getTareas());
//        System.out.println("args = " + Juan.getInforme());
        Empleados empleados = context.getBean("miSecretarioEmpleado",Empleados.class);
        System.out.println("args = " + empleados.getTareas());
        System.out.println("args = " + empleados.getInforme());
        context.close();
    }
}
