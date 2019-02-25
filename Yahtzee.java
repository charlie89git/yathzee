import java.util.Scanner;
import java.util.Random; 
import java.util.ArrayList;
import java.util.Arrays;

public class Yahtzee {
	Scanner input = new Scanner(System.in); 
	
	public static void main(String [] args) {

		System.out.println("Welkom bij Yahtzee");
		YahtzeeSpel yahtzee = new YahtzeeSpel();
		yahtzee.starten();
		yahtzee.Spelen();

	}
}
class YahtzeeSpel{
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>(); 
	
	Dobbelsteen d1 = new Dobbelsteen();
	Dobbelsteen d2 = new Dobbelsteen();
	Dobbelsteen d3 = new Dobbelsteen();
	Dobbelsteen d4 = new Dobbelsteen();
	Dobbelsteen d5 = new Dobbelsteen();
	
	{
	dobbelstenen.add(d1); 
	dobbelstenen.add(d2);
	dobbelstenen.add(d3);
	dobbelstenen.add(d4);
	dobbelstenen.add(d5);
	
	}
	Scanner scanner = new Scanner(System.in);
	boolean doorgaan = true;
	void starten() {		

		while(doorgaan) {
			System.out.println("Druk Enter voor het werpen van een nieuwe worp. Druk q voor het stoppen met het spel.");
			String keuze = scanner.nextLine();
			switch(keuze) {
				case "q":
					doorgaan = false;
					System.out.println("q is geklikt, het spel is gestopt.");
					break;
				case "":
					Spelen();
					break;
			}
		}
	}	
	void Spelen() {
	}
	int werpen() {
		Random random = new Random();
		return random.nextInt(6)+1;
	}
	}
class Dobbelsteen{
	int waarde = -1;
	
	public Dobbelsteen(){
	}
	
	// gooi de dobbelsteen
	public int werpen(){
		int worp;
		Random rng = new Random();
		
		worp = rng.nextInt(6) + 1;
		return worp;
	}
}