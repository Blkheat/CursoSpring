package org.absolute.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoCicloVidaBean {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Empleados juan = classPathXmlApplicationContext.getBean("miEmpleado",Empleados.class);

        System.out.println("Juan "+juan.getInforme());
        classPathXmlApplicationContext.close();
    }

}
