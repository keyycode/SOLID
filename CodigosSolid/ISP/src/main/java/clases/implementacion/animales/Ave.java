
package clases.implementacion.animales;
/*La interface Ave no posee el metodo volar, ya que no todas las aves pueden volar,
por esta razon el metodo volar de la interface Ave de segrega hacia otra llamada 
AnimalVolador.
De esta forma se cumple con el Principio de Segregacion de la Interfaz*/

public interface Ave {
    public void comer();
    public void dormir();
    
}
