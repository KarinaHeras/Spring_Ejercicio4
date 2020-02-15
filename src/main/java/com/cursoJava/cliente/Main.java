/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoJava.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursoJava.modelo.Colegio;

/**
 *
 * @author Anabel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Colegio c1 = (Colegio) contenedor.getBean("listColegio");
        Colegio c2 = (Colegio) contenedor.getBean("setColegio");
        Colegio c3 = (Colegio) contenedor.getBean("mapColegio");
        Colegio c4 = (Colegio) contenedor.getBean("propertiesColegio");

        System.out.println(c1.getAlumnos());
        System.out.println(c2.getAlumnos());
        System.out.println(c3.getAlumnos2());
        System.out.println(c4.getAlumnos2());

    }
}
