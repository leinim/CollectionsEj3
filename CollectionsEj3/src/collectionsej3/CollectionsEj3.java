/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package collectionsej3;

import Entidad.Alumno;
import Servicio.ServicioAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class CollectionsEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        ServicioAlumno sa = new ServicioAlumno();
        
        sa.crearAlumno(alumnos);
        
        System.out.println("Ingrese el nombre del alumno para calcular la nota final:");
        String nombre = leer.nextLine();
        
        Iterator<Alumno> it = alumnos.iterator();
        int indice = 0;
         while (it.hasNext()){
            
            if (it.next().getNombre().equalsIgnoreCase(nombre)){
                
                double notafinal = sa.notaFinal(alumnos.get(indice).getNotas());
                System.out.println("La nota final del alumno " + nombre + " es " + notafinal);
            } else {
                indice++;
            }
        }       
    }
    
}
