

package clases.implementacion.fabricaperfumes;

public class FabricaPerfumes {

    public static void main(String[] args) {
       CocoMademoiselle perfume1= new CocoMademoiselle();
       Classique perfume2=new Classique();
       
       perfume1.crearPerfume();
       perfume2.crearPerfume();
       
       /*Principio de Sustitución de Liskov (Liskov Substitution Principle - LSP): 
       Este principio establece que los objetos de un programa deben ser reemplazables 
       por instancias de sus subtipos sin afectar la corrección del programa.*/
       Perfume perfume3= new CocoMademoiselle(); 
       perfume3.crearPerfume();
       
    }
}
