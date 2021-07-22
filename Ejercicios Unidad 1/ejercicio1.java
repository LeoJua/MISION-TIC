

/* Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.
*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        
    
       
        System.out.println("Enter your first number");
        String number1 = sc.nextLine();
             //usamos el metodo Integer.valueOf() para converir el string a entero y poder hacer la suma 
        String numero1String = number1;
        int iTest = Integer.valueOf(numero1String);

        System.out.println("Enter your second number");
        String  number2 = sc.nextLine();
            //aplicamos el metodo anterior
        String numero2String = number2;
        int iTest2 = Integer.valueOf(numero2String);
         
        
      
            //falta la resta y / o agregar una var para hacer las operaciones en otro lugar y no en la impresion de pantalla
        System.out.println(  iTest + iTest2);
        System.out.println(   iTest / iTest2);
        System.out.println(  iTest * iTest2);
        
}
} 



 

