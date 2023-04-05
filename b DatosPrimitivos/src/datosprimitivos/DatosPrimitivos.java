package datosprimitivos;

public class DatosPrimitivos {

    public static void main(String[] args) {

        //Estas variables son para numeros enteros
        byte entero = 12;
        short entero1 = 12456;
        int entero2 = 1245656;
        long entero3 = 1245656123;

        System.out.println("Numero entero es: " + entero);
        System.out.println("Numero entero es: " + entero1);
        System.out.println("Numero entero es: " + entero2);
        System.out.println("Numero entero es: " + entero3);

        //Esta variables son para numero con decimales
        float decimal = 3.45f;
        double decimal1 = 3.456789;
        
        System.out.println("El numero decimal es: " + decimal);
        System.out.println("El numero decimal es: " + decimal1);
        
        // Estas variables se utilizar para caracteres
        char caracter = 'a';
        boolean decision = true;

        System.out.println("El caracter es: " + caracter);
        System.out.println("La decision es: " + decision);
    }

}
