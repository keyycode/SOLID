package clases.implementacion.gestionpedidos;

/*Esta clase de alto nivel no depende de implementaciones concretas sino de una abstraccion, 
por lo que se cumple el DIP,*/
public class GestorPedidos {
    
    private ServicioNotificacion servicioNotificacion;

    public ServicioNotificacion getServicioNotificacion() {
        return servicioNotificacion;
    }

    public void setServicioNotificacion(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }
    
    public void procesarPedido(){
        servicioNotificacion.enviarNotificacion("Pedido recibido");
    }
    
}
