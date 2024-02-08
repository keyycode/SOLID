
package clases.implementacion.restaurante;



/*Responsabilidad unica: Crear un nuevo plato que se agrega al pedido*/
public class Platos {
    
   private String nombrePlato;
   private Double precio;
   private Integer tiempoPreparacion;

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Integer tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

   
    
   
    
}
