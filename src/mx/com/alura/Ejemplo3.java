package mx.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {
  public static void main(String[] args) {
    String curso1 = "Geometria";
    String curso2 = "Fisica";
    String curso3 = "Quimica";
    String curso4 = "Historia";

    ArrayList<String> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);
    System.out.println("Array original");
    System.out.println(cursos);

    System.out.println("Array ordenado con Collections");
    Collections.sort(cursos);
    System.out.println(cursos);

    System.out.println("Array ordenado inversamente con Collections");
    Collections.sort(cursos, Collections.reverseOrder());
    System.out.println(cursos);

    System.out.println("Array ordenado con .sort(Comparator.naturalOrder())");
    cursos.sort(Comparator.naturalOrder());
    System.out.println(cursos);

    System.out.println("Array ordenado inversamente con .sort(Comparator.reverseOrder())");
    cursos.sort(Comparator.reverseOrder());
    System.out.println(cursos);

    System.out.println("Lista Ordenada con Streams");
    List<String> listaOrdenada = cursos.stream().sorted().collect(Collectors.toList());
    System.out.println(listaOrdenada);
  }
}
