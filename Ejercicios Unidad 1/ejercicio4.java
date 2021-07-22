import java.util.Scanner;



/*Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.
*/

public class ejercicio4 {
     
    public static void main(String[] args) {
       
       
        
        Scanner sc = new Scanner (System.in);
        System.out.println("que tabla quieres que se muestre");
        String numero = sc.nextLine();
        int numeroIngresado = Integer.valueOf(numero);
    
        var tabla = numeroIngresado;
        


                   
    {

        for  (var i = 1; i < 11; i++ ){
            System.out.println(tabla  + " x " + i + " = " + (tabla * i ));
       
        }
    }
        
 }

}


    /*
    tipos de datos, como manejar el tipado.
    Meter como ahcer clausulas, promesas
*/