package mx.com.alura;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {
  public static void main(String[] args) {
    String alumno1 = "Hugo";
    String alumno2 = "Paco";
    String alumno3 = "Luis";
    String alumno4 = "Juan";
    String alumno5 = "Gustavo";
    String alumno6 = "Maria";

    Set<String> listaAlumnos = new HashSet<>();

    listaAlumnos.add(alumno1);
    listaAlumnos.add(alumno2);
    listaAlumnos.add(alumno3);
    listaAlumnos.add(alumno4);
    listaAlumnos.add(alumno5);
    listaAlumnos.add(alumno6);

    for (String alumnoString : listaAlumnos) {
      System.out.println(alumnoString);
    }

  }
}
