
package clases.implementacion.restaurante;

/*Responsabilidad unica: Crear un pedido nuevo mediante alguna plataforma en linea*/
public class PedidosLinea {
    private Platos platoElegido;
    private String plataforma;

    public Platos getPlatoElegido() {
        return platoElegido;
    }

    public void setPlatoElegido(Platos platoElegido) {
        this.platoElegido = platoElegido;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    
    
    
}
