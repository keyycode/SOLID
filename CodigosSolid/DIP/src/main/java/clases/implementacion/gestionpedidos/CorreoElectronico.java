
package clases.implementacion.gestionpedidos;

public class CorreoElectronico implements ServicioNotificacion {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Correo Electronico enviado:"+mensaje);
    }
    
}
