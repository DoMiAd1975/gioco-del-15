# Implementazione del gioco della Battaglia Navale in Java

# Obiettivo: Realizzare un programma in Java che simuli il gioco della Battaglia Navale in Java, seguendo le regole complete del gioco.

# Classe: 3D Informatica

# Requisiti:

 # Il gioco deve essere giocabile in due modalità:
    o	Giocatore vs Computer: Il computer posiziona automaticamente le proprie navi e gioca contro il giocatore.
    o	Giocatore vs Giocatore: Due giocatori inseriscono manualmente le coordinate delle proprie navi e si sfidano.

 # La griglia di gioco deve essere di dimensione 10x10 e rappresentare i seguenti elementi:
   
    o	Acqua (~): celle vuote
    o	Nave (N): celle contenenti una nave
    o	Colpo mancato (O): colpo andato a vuoto
    o	Colpo a segno (X): nave colpita

 # Posizionamento delle navi:
    o	Ogni giocatore/computer deve posizionare automaticamente o manualmente 5 navi in punti diversi della griglia.
    o	Le navi possono occupare una o più caselle, seguendo le dimensioni classiche:
    
        1 Nave da 5 caselle
        1 Nave da 4 caselle
        1 Nave da 3 caselle
        1 Nave da 3 caselle
        1 Nave da 2 caselle

 # Le navi non possono sovrapporsi e devono essere posizionate orizzontalmente o verticalmente.

 # Svolgimento della partita:
    o	I giocatori si alternano per scegliere una coordinata (riga e colonna) da colpire.
    o	Se il colpo è a segno, la nave viene contrassegnata con una X.
    o       Se il colpo è mancato, la casella viene contrassegnata con una O.
    o	Il gioco continua finché un giocatore affonda tutte le navi avversarie.
    o	Ogni volta che si gioca deve essere stampata a schermo la griglia evidenziando il risultato, 
            ma evitando di visualizzare la posizione delle navi, ma solo i colpi mancati, i colpi a segno.
  
 # Stampa finale delle griglie:
  Alla fine della partita, viene stampata la griglia di ciascun giocatore, 
    evidenziando con parentesi (X) le posizioni delle navi affondate.

 # DA SAPERE: 
 all'interno della cartella src troverete il file BattagliaNavale.java con delle parti di codice mancanti, completare e migliorare il codice già presente.
 Personalizzarlo a piacimento e commentare le implementazioni effettuate e commentare anche le parti visibili del codice.

Buon lavoro! 🎲
