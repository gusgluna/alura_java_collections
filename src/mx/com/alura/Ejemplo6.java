package mx.com.alura;

import java.util.ArrayList;

import mx.com.alura.model.Clase;
import mx.com.alura.model.Curso;

public class Ejemplo6 {
  public static void main(String[] args) {
    Curso curso1 = new Curso("Java", 30, new ArrayList<>());
    curso1.addClase(new Clase("ArrayList"));
    curso1.addClase(new Clase("List"));
    curso1.addClase(new Clase("LinkedList"));

    ArrayList<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);

    System.out.println(cursos.get(0).getClaseList());
  }
}
