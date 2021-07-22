/*Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio.*/


import java.util.Random;
import java.util.Scanner;
public class ejercicio5

{
    public static void main(String[] args) {

      
       var sc = new Scanner (System.in);
        System.out.println("Adivina el numero al azar, ingresa cualquier numero");
        String number1 = sc.nextLine();
        String numeroIngresado = number1;
        int b = Integer.valueOf(numeroIngresado);
                

        Random MiAleaTorio = new Random();
        var a = MiAleaTorio.nextInt(43);

       /* System.out.println( "El numero aleatorio es" + a );*/
           

            if (a < b){ System.out.println("El número que busca es menor");}
       
       
       else if (a == b) { System.out.println(" El numero que busca es igual ");}    
            
                else {
            System.out.println("El numero que busca es mayor");
        }

        

{
        
    
}       

    }}

 


