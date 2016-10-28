
package Clases;

public class Pago {
    float subTotal;
    float impuestos;
   float propina;

    public Pago(float subTotal, float impuestos, float propina) {
        this.subTotal = subTotal;
        this.impuestos = impuestos;
        this.propina = propina;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(float propina) {
        this.propina = propina;
    }
    
    
}
