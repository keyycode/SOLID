
package clases.implementacion.gestionpedidos;

/* Principio de inversion de dependencia*/
public class GestionPedidos {

    public static void main(String[] args) {
        GestorPedidos pedido1= new GestorPedidos();
        CorreoElectronico correo = new CorreoElectronico();
        pedido1.setServicioNotificacion(correo);
        pedido1.procesarPedido();
        
        GestorPedidos pedido2= new GestorPedidos();
        SMS mensaje= new SMS();
        pedido1.setServicioNotificacion(mensaje);
        pedido1.procesarPedido();
    }

}


