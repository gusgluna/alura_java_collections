package mx.com.alura.model;

import java.util.List;

public class Curso implements Comparable<Curso> {
  private String nombre;
  private int tiempo;

  private List<Clase> claseList;

  public Curso(String nombre, int tiempo) {
    this.nombre = nombre;
    this.tiempo = tiempo;
  }

  public Curso(String nombre, int tiempo, List<Clase> claseList) {
    this.nombre = nombre;
    this.tiempo = tiempo;
    this.claseList = claseList;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTiempo() {
    return this.tiempo;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public List<Clase> getClaseList() {
    return this.claseList;
  }

  public void setClaseList(List<Clase> claseList) {
    this.claseList = claseList;
  }

  public void addClase(Clase clase) {
    this.claseList.add(clase);
  }

  @Override
  public String toString() {
    return this.nombre;
  }

  @Override
  public int compareTo(Curso o) {
    return this.nombre.compareTo(o.getNombre());
  }

}
