public class Tienda {
private String Marca;
private String Referencia;
private String Cantidad;
private Double Precio;

public Tienda() {

}   

public Tienda(String marca, String referencia, String cantidad, Double precio) {
    Marca = marca;
    Referencia = referencia;
    Cantidad = cantidad;
    Precio = precio;

}

public String getMarca() {
    return Marca;
}

public void setMarca(String marca) {
    Marca = marca;
}

public String getReferencia() {
    return Referencia;
}

public void setReferencia(String referencia) {
    Referencia = referencia;
}

public String getCantidad() {
    return Cantidad;
}

public void setCantidad(String cantidad) {
    Cantidad = cantidad;
}

public Double getPrecio() {
    return Precio;
}

public void setPrecio(Double precio) {
    Precio = precio;
}
}
