import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modularizamos el código en diferentes métodos
        // ejercicio1();  // Método para el Ejercicio 1
        //ejercicio2(sc);  // Método para el Ejercicio 2
        //ejercicio3(sc);  // Método para el Ejercicio 3
         ejercicio4(sc);  // Método para el Ejercicio 4
        // ejercicio5(sc);  // Método para el Ejercicio 5
        // ejercicio6(sc);  // Método para el Ejercicio 6
        // ejercicio7(sc);  // Método para el Ejercicio 7
        // ejercicio8(sc);  // Método para el Ejercicio 8
        // ejercicio9(sc);  // Método para el Ejercicio 9
        // ejercicio10(sc);  // Método para el Ejercicio 10
        // ejercicio11(sc);  // Método para el Ejercicio 11
        // ejercicio12(sc);  // Método para el Ejercicio 12
    }

    // Ejercicio 1: Explicación teórica
    public static void ejercicio1() {
        System.out.println("Si intentamos acceder a un elemento fuera del tamaño del array, Java lanzará una excepción llamada ArrayIndexOutOfBoundsException. Esta excepción indica que el índice al que estamos intentando acceder no existe en el array.");
    }

    // Ejercicio 2: Crear un array de tamaño 5 y solicitar valores mediante un bucle
    public static void ejercicio2(Scanner sc) {
        // Espacio para completar el código

         int numeros [] = {5,6,9,10,11};

         for (int i = 0; i < numeros.length; i++) {
                 System.out.println(numeros[i]);
         }

    }

    // Ejercicio 3: Crear un array de tamaño indicado por teclado y llenarlo con múltiplos de un número
    public static void ejercicio3(Scanner sc) {
        System.out.println("Por favor, ingresa la dimensión del array:");
        int arrayLength = sc.nextInt();
        System.out.println("Por favor, ingresa el número para conocer sus múltiplos:");
        int multiploNumero = sc.nextInt();

        int[] array1 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array1[i] = multiploNumero * (i + 1);
        }

        mostrarArray(array1);
    }

    public static void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.println(i);

        }
    }


    // Ejercicio 4: Leer 20 números decimales y determinar el mayor, menor y rango
    public static void ejercicio4(Scanner sc) {
        // Espacio para completar el código
        double decimales [] = new double[20];
      for (int i = 0; i < decimales.length; i++) {
          System.out.println("Por favor ingrese el "+ (i+1)+"°" + " decimal" );
          decimales[i] = sc.nextDouble();
      }
        double higherNumber = 0;

      for(int i = 0; i < decimales.length; i++) {
          if( decimales[i] > higherNumber) {
              higherNumber = decimales[i];
          }
      }
        double lowerNumber = higherNumber;
        for(int i = 0; i < decimales.length; i++) {
            if( decimales[i] < lowerNumber) {
                lowerNumber = decimales[i];
            }
        }
      System.out.println("El decimal más alto es "+ higherNumber );
        System.out.println("El decimal más bajo es "+ lowerNumber );
        System.out.println("El rango es "+ (higherNumber-lowerNumber) );




    }

    // Ejercicio 5: Almacenar 20 números enteros positivos pares y realizar análisis
    public static void ejercicio5(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 6: Búsqueda secuencial en un array de tamaño 50 generado aleatoriamente
    public static void ejercicio6(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 7: Suma de números pares e impares por separado
    public static void ejercicio7(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 8: Crear dos arrays con números ascendentes y descendentes
    public static void ejercicio8(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 9: Solicitar al usuario una cadena de números separados por guiones y calcular suma y promedio
    public static void ejercicio9(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 10: Calcular la letra del DNI
    public static void ejercicio10(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 11: Sumar elementos del primer y segundo array para crear el tercer array
    public static void ejercicio11(Scanner sc) {
        // Espacio para completar el código
    }

    // Ejercicio 12: Eliminar un número ingresado por el usuario de un array de 10 elementos
    public static void ejercicio12(Scanner sc) {
        // Espacio para completar el código
    }
}
