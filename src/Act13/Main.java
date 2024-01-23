package Act13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salir= false;


        do {
            Scanner sc= new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("CIRCULO");
            System.out.println("Introduce el radio para el circulo");
            int radioCirculo= sc.nextInt();
            Circulo circulo1 = new Circulo(radioCirculo);
            System.out.println("Radio del círculo: " + circulo1.getRadio());
            System.out.println("Área del círculo: " + circulo1.getArea());
            System.out.println();
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("CILINDRO");
            System.out.println("Introduce el radio para el cilindro");
            int radioCilin= sc.nextInt();
            System.out.println("Introduce la altura para el cilindro");
            int alturCilin= sc.nextInt();


            Cilindro cilindro1 = new Cilindro(radioCilin, alturCilin);
            System.out.println("Radio del cilindro: " + cilindro1.getRadio());
            System.out.println("Altura del cilindro: " + cilindro1.getAltura());
            System.out.println("Área del cilindro: " + cilindro1.getArea());
            System.out.println("Volumen del cilindro: " + cilindro1.getVolumen());

        }while (true);
        // Ejemplo de uso

    }
}