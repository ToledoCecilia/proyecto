
package Clases;


public class Bebida  {
    int cantidad;
    String tipo;
    float precio;
            

    public Bebida(int cantidad, String tipo, float precio) {
     
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
        
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
