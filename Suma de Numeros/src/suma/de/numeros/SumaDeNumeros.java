package suma.de.numeros;

public class SumaDeNumeros {

    public static int sumaNumeros(int[] numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int resultado = sumaNumeros(lista);
        System.out.println("La suma es: " + resultado);
    }
}