import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] parole = new String[100];
        int opzione;
        int conta=0;
        do {
            System.out.println("Scegli tra le opzioni");
            System.out.println("1 - Aggiunta di un nome");
            System.out.println("2 - Cancellazione del singolo nome");
            System.out.println("3 - Ricerca sequenziale di un nome");
            System.out.println("4 - Visualizza nomi ripetuti con numero ripetizioni");
            System.out.println("5 - Modifica di un nome");
            System.out.println("6 - Visualizzazione di tutti i nomi presenti");
            System.out.println("7 - Ricerca del nome più lungo e più corto");
            System.out.println("8 - Cancellazione di tutte le occorrenze di un nome");
            System.out.println("0 - Uscita");
            opzione = in.nextInt();
            switch (opzione) {
                case 1:
                    System.out.println("Inserisci una parola");
                    String stringa = in.nextLine();
                    parole = aggiuntaNome(parole, stringa);
                    conta++;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 0:

            }
        }
    }
    private static String aggiuntaNome (String parole[];String stringa; int conta){
        parole[conta] = stringa;
    }

}

}
