import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        //Lee el contenido de la consola
        Scanner consola = new Scanner(System.in);
        while (true) {
        mostrarMenu();
            try {
                int operacion = Integer.parseInt(consola.nextLine());

                //Revisar que este dentro de las opciones solicitadas

                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { //SALIR
                    System.out.println("Hasta pronto .....");
                    break;
                } else {
                    System.out.println("Opcion erronea" + operacion);

                }
                //imprimir salto
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error " + e.getMessage());
            }
        }// fin de while
    }

    private static void mostrarMenu() {
        System.out.println("**** Aplicacion calculadora ****");

        //Mostramos el menu
        System.out.println("1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n5. Salir");

        System.out.print("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");//Lee el contenido de la consola
            /*convierte la entrada de texto del usuario (leída desde la consola)
            en un número entero y lo asigna a la variable operando*/
        float operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        //parseInt convierte una cadena de caracteres en su equivalente numérico, en este caso, un entero.
        float operando2 = Integer.parseInt(consola.nextLine());
        // float resultado = operando1 + operando2;
        // System.out.println("Resultado es: " + resultado);
        float resultado;
        switch (operacion) {
            case 1: {//SUMA
                resultado = operando1 + operando2;
                System.out.println("El resultado de la Suma es: " + resultado);
                break;
            }
            case 2: {//RESTA
                resultado = operando1 - operando2;
                System.out.println("El resultado de la Resta es: " + resultado);
                break;
            }
            case 3: {//MULTIPLICACION
                resultado = operando1 * operando2;
                System.out.println("El resultado de la Multiplicacion es: " + resultado);
                break;
            }
            case 4: { //DIVISION
                resultado = operando1 / operando2;
                System.out.println("El resultado de la Division es: " + resultado);
                break;
            }
            default:
                System.out.println("Operación no válida" + operacion);
        }


    }
}

