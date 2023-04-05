package datosporconsola;

import java.util.Scanner;

public class DatosPorConsola {

    public static void main(String[] args) {
        //Guarda variables
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite el numero");
        numero = entrada.nextInt();

        System.out.println("El numero es: " + numero);

        float numero1;

        System.out.println("Digite el numero");
        numero1 = entrada.nextFloat();

        System.out.println("El numero es: " + numero1);

        double numero2;

        System.out.println("Digite el numero");
        numero2 = entrada.nextDouble();

        System.out.println("El numero es: " + numero2);

        // Guardar una cadena de texto
        String cadena;

        System.out.println("Digite la cadena de texto");
        cadena = entrada.nextLine();

        System.out.println("La cadena es: " + cadena);
        
        char letra;

        System.out.println("Digite una letra");
        letra = entrada.next().charAt(0);

        System.out.println("La letra es: " + letra);

    }

}
