import java.util.Random;
import java.util.Scanner;

public class BattagliaNavale {
    private static final int DIMENSIONE = 10;
    private static final char ACQUA = '~';
    private static final char NAVE = 'N';
    private static final char COLPITO = 'X';
    private static final char MANCATO = 'O';
    private static char[][] grigliaGiocatore;
    private static char[][] grigliaComputer;
    private static boolean controComputer;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto alla Battaglia Navale!");
        System.out.print("Vuoi giocare contro il computer? (s/n): ");
        controComputer = scanner.next().equalsIgnoreCase("s");
        
        grigliaGiocatore = new char[DIMENSIONE][DIMENSIONE];
        grigliaComputer = new char[DIMENSIONE][DIMENSIONE];
        inizializzaGriglia(grigliaGiocatore);
        inizializzaGriglia(grigliaComputer);
        posizionaNavi(grigliaGiocatore);
        posizionaNavi(grigliaComputer);
        
        boolean partitaInCorso = true;
        while (partitaInCorso) {
            turnoGiocatore(scanner);
            if (verificaVittoria(grigliaComputer)) {
                System.out.println("Hai vinto!");
                partitaInCorso = false;
                break;
            }
            if (controComputer) {
                turnoComputer();
                if (verificaVittoria(grigliaGiocatore)) {
                    System.out.println("Il computer ha vinto!");
                    partitaInCorso = false;
                }
            }
        }
        stampaGriglieFinali();
        scanner.close();
    }
    
    private static void inizializzaGriglia(char[][] griglia) {
        for (int i = 0; i < DIMENSIONE; i++) {
            for (int j = 0; j < DIMENSIONE; j++) {
                griglia[i][j] = ACQUA;
            }
        }
    }
    
    private static void posizionaNavi(char[][] griglia) {
        Random rand = new Random();
        int naviDaPosizionare = 5;
      
      // completa il codice  
    }
    
    private static void turnoGiocatore(Scanner scanner) {
        System.out.println("Inserisci le coordinate per colpire (riga colonna): ");
        int riga = scanner.nextInt();
        int colonna = scanner.nextInt();
      
      // completa il codice  
    }
    
    private static void turnoComputer() {
        Random rand = new Random();
        int riga, colonna;
        do {
            riga = rand.nextInt(DIMENSIONE);
            colonna = rand.nextInt(DIMENSIONE);
        } while (grigliaGiocatore[riga][colonna] == COLPITO || grigliaGiocatore[riga][colonna] == MANCATO);
        
        if (grigliaGiocatore[riga][colonna] == NAVE) {
            grigliaGiocatore[riga][colonna] = COLPITO;
            System.out.println("Il computer ha colpito una nave!");
        } else {
            grigliaGiocatore[riga][colonna] = MANCATO;
            System.out.println("Il computer ha mancato.");
        }
    }
    
    private static boolean verificaVittoria(char[][] griglia) {
        for (int i = 0; i < DIMENSIONE; i++) {
            for (int j = 0; j < DIMENSIONE; j++) {
                if (griglia[i][j] == NAVE) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static void stampaGriglieFinali() {

            // completa il codice  
    }
    
    private static void stampaGriglia(char[][] griglia) {

            // completa il codice  
    }
}

