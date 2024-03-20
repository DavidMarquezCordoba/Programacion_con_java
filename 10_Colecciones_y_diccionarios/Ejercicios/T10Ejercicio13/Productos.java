package T10Ejercicio13;

public class Productos {

  ////ATRIBUTOS
  private String codigo;
  private String descripcion;
  private double precio;
  private int stock;

  ///CONSTRUCTORES
  public Productos(){
    this.codigo = "vacio";
    this.stock=1;
  }

  public Productos(String codigo, String descripcion, double precio) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = 1;
  }

  ///GETTERS Y SETTERS

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  /////TO STRING
  @Override
  public String toString() {
    String cadena = "\nCodigo = " + codigo + "\nDescripcion = " + descripcion + "\nPrecio = " + precio +" €"+ "\nStock = " + stock+"\n";
    return cadena;
  }  

  //METODOS
  public void sumarStock(){
    stock++;
  }

  public void restarStock(){
    stock--;
  }

  // public void eliminarProducto(){
  //   this.codigo = "vacio";
  //   this.descripcion = null;
  //   this.precio = 0;
  //   this.stock = 0;
  // }
}
