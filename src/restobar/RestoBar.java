
package restobar;

import Clases.Bebida;
import Clases.Cliente;
import Clases.Orden;
import Clases.Platillo;


public class RestoBar {

    public static void main(String[] args) {
        Cliente c = new Cliente(23);
        Platillo p1 = new Platillo(1, "Fideos con salsa", 70);
        Platillo p2 = new Platillo(1, "Napolitana de pollo", 80);
        Bebida b = new Bebida(1,"Coca Cola", 20);
        
        Orden o1 = new Orden(22, "Pepe");
        o1.agregar(p1);
        o1.agregar(p2);
        o1.add(b);
        o1.mostrar();
        float x = o1.calcularSTPlatillo();
        
        float y = o1.calcularSTBebida();
        o1.calculatTotal(x, y);
        
    }
    
}
