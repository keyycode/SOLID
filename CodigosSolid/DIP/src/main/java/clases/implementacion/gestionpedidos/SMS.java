package clases.implementacion.gestionpedidos;

public class SMS implements ServicioNotificacion{

    @Override
    public void enviarNotificacion(String mensaje) {
         System.out.println("SMS enviado:"+ mensaje);
    }
    
}
