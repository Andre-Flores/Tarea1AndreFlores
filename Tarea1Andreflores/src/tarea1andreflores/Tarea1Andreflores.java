package tarea1andreflores;

import java.util.Scanner;

public class Tarea1Andreflores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 si quiere ver los numeros impares y pares, ingrese 2 si quiere ver los triangulos:");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println(" usted escogio la opcion 1, numeros pares e impares.");
                System.out.println("ingrese un numero");
                int num = entrada.nextInt();
                int par;
                int numpares = 0;
                int numimpares = 0;
                System.out.println("usted ingreso el numero: " + num);
                for (int i = 0; i <= num; i++) {
                    if (i % 2 == 0) {
                        //                       System.out.println(i + " es un numero par en el numero " + num);
                        numpares++;
                    } // esto podria ser un extra pero se ve mucho codigo en la respuesta :)
                    else {
                        //                    System.out.println(i + " es un numero impar en el numero " + num);
                        numimpares++;
                    } // esto tambien podria ser un extra pero se ve mucho codigo en la respuesta :)

                }
                System.out.println("Entre 0 y " + num + " existen " + numpares + " numeros pares y estos son: ");
                for (int i = 0; i <= num; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                        numpares++;
                    }// fin if calculo tot pares
                } // fin for calculo de pares
                System.out.println(" ");
                System.out.println("Entre 0 y " + num + " existen " + numimpares + " numeros impares y estos son: ");
                for (int i = 0; i <= num; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                        numimpares++;
                    } // fin if calculo de tot impares
                } // fin for calculo de tot impares

            } // fin case 1
            break;
            case 2: {
                System.out.println("usted escogio la opcion 2, los triangulos con asteriscos.");
                int opt;
                System.out.println("ingrese el tipo de triangulo que quiere. Si quiere equilatero ingrese 1, si quiere triangulo rectangulo ingrese 2.");
                opt = entrada.nextInt();
                switch (opt) {
                    case 1: {
                        int tam;
                        System.out.println("usted escogio triangulo equilatero. ingrese el tamanio que quiere.");
                        tam = entrada.nextInt();
                        System.out.println(" usted escogio el tamanio: " + tam);
                        for (int i = 1; i <= tam; i++) { 
                            for (int j = tam; j > i; j--) {
                                System.out.print(" ");
                            }
                            
                            for (int j = 1; j <= i * 2 - 1; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } // FIN CASE EQUI
                    break;
                    case 2: {
                        int tam2;
                        System.out.println("usted escogio triangulo equilatero. ingrese el tamanio que quiere.");
                        tam2 = entrada.nextInt();
                        System.out.println(" usted escogio el tamanio: " + tam2);
                        for (int i = 1; i <= tam2; i++) { 
                            for (int j = tam2; j < i; j--) {
                                System.out.print(" ");
                            }
                            
                            for (int j = 1; j <= i ; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } // fin case rect
                } // fin switch triangulos
                
            }// fin case 2
            default:
                System.out.println("opcion no valida");
            
        }// fin switch
    } // fin main 

} // fin class
