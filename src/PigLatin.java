import java.util.Scanner;

public class PigLatin {
	
	public String getInput() {	//Greg
		Scanner keybrd = new Scanner(System.in);
		System.out.print("Text to be converted: ");
		String pigSentence = keybrd.nextLine();
		return pigSentence;
	}
	
	public boolean firstVovel(String pigSentence) {	//Grant
		String firstLetter = pigSentence.substring(0, 1);
		if(firstLetter == "a" || firstLetter == "e" ||
				firstLetter ==  "i" || firstLetter == "o" || firstLetter == "u") {
			return true;
		} else {
			return false;
		}
	}
	
	public String addYay(String pigSentence) {	//Joel Tanner 2015.10.15
		pigSentence = pigSentence + "yay";
		return pigSentence;
	}
	
	
	
	public String addAy(String pigSentence) { //Jimin
		pigSentence = pigSentence + "ay";
		return pigSentence;
	}
	
	public void printYo(String pigSentence) { //Haley
		System.out.println(pigSentence);
	}
	
	public static void main(String[] args) {
		
	}
}
