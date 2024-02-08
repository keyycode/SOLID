
package clases.implementacion.restaurante;

import java.util.List;

/*Responsabilidad unica: Crear un pedido nuevo en el local fisico*/
public class Pedidos {
    
    private Integer numeroMesa;
    private Double valorFactura;
    private Platos nuevoPlato;

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(Double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public Platos getNuevoPlato() {
        return nuevoPlato;
    }

    public void setNuevoPlato(Platos nuevoPlato) {
        this.nuevoPlato = nuevoPlato;
    }
    
    

    
    
  
    
}
