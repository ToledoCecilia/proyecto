
package Clases;

public class Credito extends Pago {
    int nroCredito;
    String tipo;
    int fecha;
    String nombre;

    public Credito(float subTotal, float impuestos, float propina, int nroCredito, String tipo, int fecha, String nombre) {
        super(subTotal, impuestos, propina);
        this.nroCredito = nroCredito;
        this.tipo = tipo;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public int getNroCredito() {
        return nroCredito;
    }

    public void setNroCredito(int nroCredito) {
        this.nroCredito = nroCredito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        
    
}
