
package clases.implementacion.fabricaperfumes;

import java.util.ArrayList;

/*Se cumple el principio de abierto para ser extendida pero cerrada para modificaciones,
ya que al ser una clase abstracta las modificaciones necesarias pueden ser realizadas en las clases 
que extienden a Perfume*/

public abstract class Perfume {
    public String marca;
    public float precio;
    public ArrayList<String> esencias;
    public float cantidad;
    
    abstract public void crearPerfume();
    
    
    
    
    
}
