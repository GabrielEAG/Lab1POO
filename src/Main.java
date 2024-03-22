import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        Scanner escaner = new Scanner(System.in);
        float a;
        float b;
        int option = 0;
        do {
            System.out.println("--Calculadora--");

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            option = escaner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    a = escaner.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    b = escaner.nextFloat();
                    float suma = Suma(a,b);
                    System.out.println(suma);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    a = escaner.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    b = escaner.nextFloat();
                    float resta = Resta(a, b);
                    System.out.println(resta);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    a = escaner.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    b = escaner.nextFloat();
                    float multi = Multiplicacion(a,b);
                    System.out.println(multi);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    a = escaner.nextFloat();
                    System.out.println("Ingrese el segundo numero: ");
                    b = escaner.nextFloat();
                    float div = Division(a,b);
                    System.out.println(div);
                    break;
                default:
                    System.out.println("Adios");
                    break;
            }
        }while (option != 5);
    }

    public static float Suma(float a, float b) {
        return a + b;
    }

    public static float Resta(float a, float b) {
        return a - b;
    }

    public static float Multiplicacion(float a, float b) {
        return a * b;
    }

    public static float Division(float a, float b) {
        if (b == 0) {
            System.out.println("Operacion invalida");
            return 0;
        } else {
            return a / b;
        }
    }

}