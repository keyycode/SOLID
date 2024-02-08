
package clases.implementacion.restaurante;

import java.util.Scanner;


public class Restaurante {

    public static void main(String[] args) {
        
    System.out.println("Bienvenidos,que desea ordenar?");
        Pedidos pedido1= new Pedidos();
        Platos plato1= new Platos();
        plato1.setNombrePlato("Rollos California");
        plato1.setPrecio(15.50);
        plato1.setTiempoPreparacion(20);
        pedido1.setNuevoPlato(plato1);
        pedido1.setValorFactura(plato1.getPrecio());
        pedido1.setNumeroMesa(1);
        
    
    System.out.println("Su pedido es:");
    System.out.println("Plato: " + pedido1.getNuevoPlato().getNombrePlato());
    System.out.println("Mesa: " + pedido1.getNumeroMesa());
    System.out.println("Valor factura: " + pedido1.getValorFactura()); 
        
        
    
    
    }
}    