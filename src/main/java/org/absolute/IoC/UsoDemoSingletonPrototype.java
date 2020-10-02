package org.absolute.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class UsoDemoSingletonPrototype {
    public static void main(String[] args) {
//        cargar xml de configuracion
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
// peticion de beans al contenedor spring
        SecretarioEmpleado maria = context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Pedro = context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        System.out.println("args = " + maria);
        System.out.println("Pedro = " + Pedro);
        if (maria==Pedro){
            System.out.println("apuntal al mismo objeto");
        }else{
            System.out.println("no es el mismo objeto");
        }

    }
}
