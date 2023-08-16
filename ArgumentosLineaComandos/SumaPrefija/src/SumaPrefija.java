import java.util.Scanner;

public class SumaPrefija {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de numeros a ingresar: ");
        size = sc.nextInt();

        //declarar arrays
        int[] array = new int[size];
        int[] auxArray = new int[size];

        //llenar arrays con inputs
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            auxArray[i] = array[i];
        }

        //suma prefija
        for (int i = 0; i < size; i++) {
            if (i != 0){
                auxArray[i] = auxArray[i-1] + array[i];
            }
        }

        System.out.println("La suma prefija es: ");
        for (int i = 0; i < size; i++) {
            System.out.println(auxArray[i]);
        }

    }
}