import java.util.Scanner;

public class PigLatin {
	
	public static String[] getInput() {	//Greg
		Scanner keybrd = new Scanner(System.in);
		System.out.print("Text to be converted: ");
		String pigSentence = keybrd.nextLine();
		return pigSentence.toLowerCase().split(" ");
	}
	
	public static boolean firstVovel(String pigSentence) {	//Grant
		String firstLetter = pigSentence.substring(0, 1);
		if(firstLetter.equals("a") || firstLetter.equals("e") ||
				firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String addYay(String pigSentence) {	//Joel Tanner 2015.10.15
		pigSentence = pigSentence + "yay";
		return pigSentence;
	}
	
	public static String moveToEnd(String pigSentence) {	//David
		String firstLetter = "";
		firstLetter = pigSentence.substring(0, 1);
		String otherPart = "";
		otherPart = pigSentence.substring(1, pigSentence.length());
		pigSentence = otherPart + firstLetter;
		return pigSentence;
	}
	
	public static String addAy(String pigSentence) { //Jimin
		pigSentence = pigSentence + "ay";
		return pigSentence;
	}
	
	public static void printYo(String pigSentence) { //Haley
		System.out.println(pigSentence);
	}
	
	public static void main(String[] args) {
		String[] pigSentence = getInput();
		String pigWord = "";
		String pigFinal = "";
		for(int i = 0; i < pigSentence.length; i++) {
			pigWord = pigSentence[i];
			if(firstVovel(pigWord)) {
				pigWord = addYay(pigWord);
			} else {
				pigWord = moveToEnd(pigWord);
				pigWord = addAy(pigWord);
			}
			if(i == (pigSentence.length)-1) {
				pigWord = pigWord + "";
			} else {
				pigWord = pigWord + " ";
			}
			pigFinal = pigFinal + pigWord;
		}
		printYo(pigFinal);
	}
}
