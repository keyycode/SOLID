
package clases.implementacion.animales;

public class Pinguino implements Ave{
    
    

    @Override
    public void comer() {
         System.out.println("Los pinguinos comen mariscos y pescado");
    }

    @Override
    public void dormir() {
        System.out.println("Los pinguinos duermen de pie por diversos motivos");
    }
        
    
}
