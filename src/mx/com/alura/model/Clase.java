package mx.com.alura.model;

public class Clase {

  private String nombre;

  public Clase(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "{" +
        " nombre='" + getNombre() + "'" +
        "}";
  }

}
