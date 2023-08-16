import java.util.Scanner;

public class CombSumas {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de numeros a ingresar: ");
        size = sc.nextInt();

        //declarar arrays
        int[] array = new int[size];
        int[] auxArray = new int[size-1];

        //llenar array con inputs
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.arraycopy(array, 1, auxArray, 0, size-1);
        int result = array[0];
        int sum = 0;

        for (int i = 0; i < auxArray.length; i++) {
            for (int j = 0; j < auxArray.length; j++) {
                if(i!=0){
                    sum = auxArray[i] + auxArray[j];
                    if (sum == result){
                        System.out.println("Si: " + auxArray[i] + " + " + auxArray[j] + " = " + result);
                    }
                }
            }

        }

    }
}
