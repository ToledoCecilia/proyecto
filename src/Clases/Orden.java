
package Clases;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    int hora;
    String mesero;
    List<Platillo> platillos = new ArrayList();
    List<Bebida> bebidas = new ArrayList();

    public Orden(int hora, String mesero) {
        this.hora = hora;
        this.mesero = mesero;
        
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }
    
    public void agregar(Platillo p){
    platillos.add(p);
    
    }
    
    public void add(Bebida b){
        bebidas.add(b);
    
    }
   public float calcularSTPlatillo(){
        float sTPlatillo = 0;
        for (Platillo p :platillos){
            sTPlatillo = sTPlatillo +(p.getCantidad() * p.getPrecio());
        }
        return sTPlatillo;
   }
   
   public float calcularSTBebida(){
        float sTBebida = 0;
        for (Bebida b :bebidas){
            sTBebida = b.getCantidad() * b.getPrecio();
        }
        return sTBebida;
   }
   public float calculatTotal(float sTPlatillo, float sTBebida){
       float total = 0;
       total = sTPlatillo + sTBebida;
       System.out.println("\nPago Efectivo: \n");
       System.out.printf("Total: %2.5f", total);
       System.out.println("\n \n \n");
       return total;
      
   }
   
   public void mostrar(){
      System.out.printf("Orden:     Hora: %d       Mesero: %s \n",
              getHora(), getMesero());
      
          for(Platillo p :platillos){
              System.out.printf("Cantidad: %d    Platillo: %s     Precio: %2.5f \n",
                      p.getCantidad(), p.getTipo(), p.getPrecio());
          }
             for(Bebida b:bebidas){
                 System.out.printf("Cantidad: %d    Bebida: %s    Precio: %2.5f \n",
                         b.getCantidad(), b.getTipo(), b.getPrecio());
             
             } 
      
          }
      
   }



