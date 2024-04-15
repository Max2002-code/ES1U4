import java.util.Scanner;

public class Main {

    // Metodo per moltiplicare due interi
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // Metodo per concatenare una stringa e un intero
    public static String concatena(String str, int num) {
        return str + num;
    }

    // Metodo per inserire una stringa in un array di stringhe
    public static String[] inserisciInArray(String[] array, String str) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                newArray[i] = str;
                newArray[i + 1] = array[i];
                newArray[i + 2] = array[i + 1];
                i += 2;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    // Metodo per calcolare il perimetro di un rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo per determinare se un numero è pari o dispari
    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    // Metodo per calcolare il perimetro di un triangolo utilizzando la formula di Erone
    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        return lato1 + lato2 + lato3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire due numeri interi
        System.out.println("Inserisci il primo numero intero:");
        int numero1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero intero:");
        int numero2 = scanner.nextInt();

        // Calcola e stampa il prodotto dei due numeri
        int risultatoMoltiplicazione = moltiplica(numero1, numero2);
        System.out.println("Il risultato della moltiplicazione è: " + risultatoMoltiplicazione);

        // Chiedi all'utente di inserire una stringa e un numero intero
        System.out.println("Inserisci una stringa:");
        scanner.nextLine(); // Consuma il newline residuo
        String stringa = scanner.nextLine();
        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();

        // Concatena la stringa e il numero e stampa il risultato
        String risultatoConcatenazione = concatena(stringa, numero);
        System.out.println("Il risultato della concatenazione è: " + risultatoConcatenazione);

        // Chiedi all'utente di inserire le lunghezze dei lati di un rettangolo
        System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double lato1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double lato2 = scanner.nextDouble();

        // Calcola e stampa il perimetro del rettangolo
        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        // Chiudi lo scanner
        scanner.close();
    }
}
