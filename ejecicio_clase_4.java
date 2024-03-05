import java.util.Scanner;

public class ejercicio_clase_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1:
        System.out.println("Ingrese un número");
        int num = scanner.nextInt();


            if (num > 0) {
                System.out.println("El número es positivo");
            } else if (num < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El numero es cero");
            }

        //Ejercicio 2:
        System.out.println("Por favor digite una categoría y su respectivo precio");
        System.out.println("Ingrese el número correspondiente de la categoría así: \n 1.Electrónicos" +
                "\n 2.Ropa \n 3.Alimentos");
        int Nocategoria = scanner.nextInt();
        System.out.println("Ingrese el precio del artículo");
        float precio = scanner.nextFloat();

        double descuento = 0;



        switch (Nocategoria){
            case 1: descuento = precio * 0.01;
            break;
            case 2: descuento = precio * 0.05;
            break;
            case 3: descuento = precio * 0.02;
            break;
            default:
                System.out.println("No ha digitado una categoría correcta");
        }
        System.out.println("El descuento es de " + descuento);






    }
}
