import java.util.Random;
import java.util.Scanner;

public class main {
    public static <T> void print(T content) {
        System.out.print(content);
    }

    public static <T> void println(T content) {
        System.out.println(content);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modularizamos el código en diferentes métodos
        ejercicio1();  // Método para el Ejercicio 1
        ejercicio2(sc);  // Método para el Ejercicio 2
        ejercicio3(sc);  // Método para el Ejercicio 3
        ejercicio4(sc);  // Método para el Ejercicio 4
        ejercicio5(sc);  // Método para el Ejercicio 5
        ejercicio6(sc);  // Método para el Ejercicio 6
        ejercicio7(sc);  // Método para el Ejercicio 7
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
        int [ ] enterosPares = new int [20];
        Random random = new Random();
        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < enterosPares.length; i++) {
            enterosPares[i] = random.nextInt(100) + 1;
            while (enterosPares[i] % 2 != 0) {
                enterosPares[i] = random.nextInt(100) + 1;
            }
            print(enterosPares[i] + " ");
        }
        for (int j = 0; j < enterosPares.length; j++ ) {
            suma += enterosPares[j];
        }
        promedio = suma / enterosPares.length;
        println(" ");
        println(promedio);
        int iguales = 0;
        int mayores = 0;
        int menores = 0;
        for (int k = 0; k < enterosPares.length; k++) {
            if (enterosPares[k] == promedio) {
                iguales += 1;
            } else if (enterosPares[k] > promedio) {
                mayores += 1;
            } else {
                menores += 1;
            }
        }
        println("La cantidad de numeros iguales al promedio es: " + iguales);
        println("La cantidad de numeros mayores al promedio es: " + mayores);
        println("La cantidad de numeros menores al promedio es: " + menores);
    }

    // Ejercicio 6: Búsqueda secuencial en un array de tamaño 50 generado aleatoriamente
    public static void ejercicio6(Scanner sc) {

        //Crear un arreglo de tamaño 50
          int arreglo[] = new int[50];
        //creamos la variable azar,para obtener numeros aleatorios
          Random azar = new Random();

        //bucle for, llenamos el arreglo con numeros aleatorios
        for (int i = 0; i < arreglo.length ; i++) {
            arreglo[i]= azar.nextInt(0,100);

        }

        //mostrar el arreglo por consola
        System.out.println("Arreglo llenado con 50 números al azar: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();//salto en linea
        BusquedaSecuencial.EncontrarValor(arreglo,sc);

    }

    public class BusquedaSecuencial{
        static void EncontrarValor(int arreglo[],Scanner sc){

            //Solicitar al usuario que ingrese el valor que desea buscar
            System.out.println("Ingrese el número que desea buscar: ");
            int ValorBuscado = sc.nextInt();

            //realizamos la busqueda del valor
            boolean encontrado = false;
            for (int i = 0; i < arreglo.length ; i++) {
                if (arreglo[i] == ValorBuscado){
                    System.out.println("Valor encontrado en la posición: "+(i+1)+"° del arreglo");
                    encontrado = true;
                    break; //finaliza la busqueda y cortamos el bucle
                }
            }

            //Si no se encuentra el Valor buscado
            if (!encontrado){
                System.out.println("El número "+ValorBuscado+" no se encontró en el arreglo");
            }
        }
    }

    // Ejercicio 7: Suma de números pares e impares por separado
    public static void ejercicio7(Scanner sc) {

        //bucle for, pedimos al usuario que ingrese 20 numeros enteros y almacenalos en un array

        int arrreglo[];
        arrreglo = new int[20];//20

        //creamos un bucle for para almacenar los valores ingresados por el usuario
        for (int i = 0; i < arrreglo.length ; i++) {

            System.out.println("Hay que ingresar un total de 20 números");
            System.out.println("Ingrese el "+(i+1)+"° número");
            arrreglo[i]= sc.nextInt();
        }
        //mostramos por consola los valores guardados en el arreglo
        System.out.println("Los números ingresados fueron:");
        for (int i = 0; i < arrreglo.length; i++){
            System.out.println(arrreglo[i]);
        }

        //llamamos las funciones
        SumaNumerosPares.CalcularSumaPares(arrreglo);
        SumaNumerosImpar.CalcularSumaImpar(arrreglo);

    }

    public class SumaNumerosPares{
        static void CalcularSumaPares(int arreglo[]){

            //iniciamos la variable SumaPar
            int SumaPar=0;

            //creamos un bucle for guardar los valores pares en la variable SumaPar
            for (int i = 0; i < arreglo.length ; i++) {

                //utilizamos un if y mod para verificar si es par
                if (arreglo[i]%2==0){

                    //mostramos por consola
                    //System.out.println("El numero "+arreglo[i]+" es numero par");

                    //guardamos el valor en la variable SumaPar
                    SumaPar += arreglo[i];
                }

            }
            //mostramos por consola la variable SumaPar
            System.out.println("La suma de los numeros pares da un total de: "+ SumaPar);
        }
    }

    public class SumaNumerosImpar {
        static void CalcularSumaImpar(int arreglo[]){
            //Iniciamos la variable SumaImpar
            int SumaImpar = 0;

            //creamos un bucle for guardar los valores pares en la variable SumaImpar
            for (int i = 0; i < arreglo.length ; i++) {

                //utilizamos un if y mod para verificar si es impar
                if (arreglo[i]%2!=0){
                    //mostramos por consola
                    //System.out.println("El numero "+arreglo[i]+" es numero impar");

                    //guardamos el valor en la variable SumaImpar
                    SumaImpar += arreglo[i];
                }

            }
            //mostramos por consola la variable SumaImpar
            System.out.println("La suma de los numeros impares da un total de: "+ SumaImpar);

        }
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
        int[] enteros1 = new int[5];
        int[] enteros2 = new int[10];
        int[] enteros3 = new int[5];
        for (int i = 0; i < enteros1.length; i++){
            println("Ingresa un valor de orden " + i + " para agregar al primer array");
            int nuevoNum = sc.nextInt();
            enteros1[i] = nuevoNum;
        }
        for (int j = 0; j < enteros2.length; j++){
            println("Ingresa un valor de orden " + j + " para agregar al primer array");
            int nuevoNum = sc.nextInt();
            enteros2[j] = nuevoNum;
        }
        for (int k = 0; k < enteros3.length; k++){
            int suma = 0;
            for (int l = 0; l < enteros2.length; l++) {
                int producto = 0;
                producto = enteros1[k] * enteros2[l];
                suma += producto;
            }
            int nuevoNum = suma;
            enteros3[k] = nuevoNum;
        }
        for (int p = 0; p < enteros3.length; p++) {
            println(enteros3[p]);
        }
    }

    // Ejercicio 12: Eliminar un número ingresado por el usuario de un array de 10 elementos
    public static void ejercicio12(Scanner sc) {
        // Espacio para completar el código
    }
}
