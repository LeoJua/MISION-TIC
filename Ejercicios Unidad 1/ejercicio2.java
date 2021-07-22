import java.util.Scanner;



/* Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.
*/


public class ejercicio2 
{
     public static void main(String[] args) {
        

     
    {
       
        Scanner sc = new Scanner (System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("What is your first quiz");
        String quiz1 = sc.nextLine();
        int nota1 = Integer.valueOf(quiz1);
        


        System.out.println("What is your second quiz");
        String quiz2 = sc.nextLine();
        int nota2 = Integer.valueOf(quiz2);

        System.out.println("What is your third quiz");
        String quiz3 = sc.nextLine();
        int nota3 = Integer.valueOf(quiz3);

        {
         
         var a = nota1; 
         var b = nota2;
         var c = nota3;
            
         var sum = a + b + c;
         var promedio = sum / 3;

         

         if(promedio >= 3.0){
            System.out.println( name + " " + "Estas Aprobado" + "tu resultado es"+ " " + promedio);
         }
         else {
            System.out.println( name + " " + "Estas Reprobado" + "tu resultado es"+ " " + promedio);
         }
        }
        
        

    
    }


}
    
    
    
}
