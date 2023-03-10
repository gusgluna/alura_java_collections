package mx.com.alura;

public class Curso implements Comparable<Curso> {
  String nombre;
  int tiempo;

  public Curso(String nombre, int tiempo) {
    this.nombre = nombre;
    this.tiempo = tiempo;
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

  @Override
  public String toString() {
    return this.nombre;
  }

  @Override
  public int compareTo(Curso o) {
    return this.nombre.compareTo(o.getNombre());
  }

}
