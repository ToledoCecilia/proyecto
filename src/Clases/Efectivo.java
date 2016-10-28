
package Clases;

public class Efectivo extends Pago {
    float cantidad;

    public Efectivo(float subTotal, float impuestos, float propina, float cantidad) {
        super(subTotal, impuestos, propina);
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
}
