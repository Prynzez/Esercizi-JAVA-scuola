import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Gara
{
    private String nome;
    private int risultato;
    private static ArrayList<Auto> collezioneAuto = new ArrayList<>();

    public Gara(String nome, int risultato)
    {
        this.nome = nome;
        this.risultato = risultato;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public int getRisultato()
    {
        return risultato;
    }
    public void setRisultato(int risultato)
    {
        this.risultato = risultato;
    }

    public static Auto corriGara(String nome, int risultato)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci nome del primo gareggiatore: ");
        String Primo = sc.nextLine();

        System.out.println("Inserisci nome del secondo gareggiatore: ");
        String Secondo = sc.nextLine();

        Random random = new Random();

        // Genera un numero casuale tra 0 e 99
        int risultatoPrimo = random.nextInt(100);
        System.out.println("Il risultato del primo è: " + risultatoPrimo);

        int risultatoSecondo = random.nextInt(100);
        System.out.println("Il risultato del primo è: " + risultatoSecondo);

        if(risultatoPrimo >= risultatoSecondo)
        {
            System.out.println("Il pirmo giocatore ha vinto!");
        }else {
            System.out.println("Il secondo giocatore ha vinto!");
        }


        return null;
    }


}
