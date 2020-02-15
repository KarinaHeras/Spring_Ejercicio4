package com.cursoJava.modelo;

import java.util.Collection;
import java.util.Map;

public class Colegio {

    private Collection<String> alumnos;
    private Map<String,String> alumnos2;

    public Collection<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Collection<String> alumnos) {
        this.alumnos = alumnos;
    }

    public Map<String, String> getAlumnos2() {
        return alumnos2;
    }

    public void setAlumnos2(Map<String, String> alumnos2) {
        this.alumnos2 = alumnos2;
    }

    
    

}
