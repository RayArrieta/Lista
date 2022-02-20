
package lista;

import java.util.ArrayList;
import java.util.List;


public class Lista {


    public static void main(String[] args) {
      
        
       List<Integer>Numeros;
       
       Numeros = new ArrayList<>();
       
       Numeros.add(1);
       Numeros.add(2);
       Numeros.add(3);
       Numeros.add(4);
        
       System.out.println(Numeros.get(0));
       System.out.println(Numeros.get(1));
       System.out.println(Numeros.get(2));
       System.out.println(Numeros.get(3));
       
       Numeros.remove(0);
       
       System.out.println(Numeros.get(0));
       
       
    }
    
}
