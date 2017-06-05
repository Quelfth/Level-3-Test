package voteProcessor;
import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
	public static boolean capped = true;
	
	public VoteProcessor(){
		capped = false;
	}
	
	public static String calculateElectionWinner(ArrayList<String> votes){
		HashMap<String, Integer> scores = new HashMap<>();
		for(String S : votes)
			if(scores.containsKey(S))
				scores.put(S, scores.get(S) + 1);
			else
				scores.put(S, 1);
		int highestScore = 0;
		for(int i = 0; i < scores.keySet().size(); i++)
			if(scores.get(scores.keySet().toArray()[i]) > highestScore)
				highestScore = scores.get(scores.keySet().toArray()[i]);
		ArrayList<String> winners = new ArrayList<>();
		for(int i = 0; i < scores.keySet().size(); i++)
			if(scores.get(scores.keySet().toArray()[i]) == highestScore)
				winners.add(scores.keySet().toArray()[i].toString());
		if(!capped)
			for(String w : winners)
				uncapitalize(w);
		if(winners.size() == 1)
			return winners.get(0);
		if(winners.size() == scores.keySet().size())
			return "TIE";
		String ret = winners.get(0);
		for(String S : winners)
			ret += " & " + S;
		return ret;
	}
	
	public static String uncapitalize(String str){
		for(int i = 1; i < str.length(); i++)
			str = str.substring(0, i) + lowercase(str.charAt(i)) + str.substring(i + 1);
		return str;
	}
	
	public static String recapitalize(String str){
		str = capital(str.charAt(0)) + str.substring(1);
		for(int i = 1; i < str.length(); i++)
			if(str.charAt(i - 1) == ' ')
				str = str.substring(0, i) + capital(str.charAt(i)) + str.substring(i + 1);
			else
				str = str.substring(0, i) + lowercase(str.charAt(i)) + str.substring(i + 1);
		return str;
	}
	
	public static char lowercase(char c){
		switch(c){
		case 'A':
			return 'a';
		case 'B':
			return 'b';
		case 'C':
			return 'c';
		case 'D':
			return 'd';
		case 'E':
			return 'e';
		case 'F':
			return 'f';
		case 'G':
			return 'g';
		case 'H':
			return 'h';
		case 'I':
			return 'i';
		case 'J':
			return 'j';
		case 'K':
			return 'k';
		case 'L':
			return 'l';
		case 'M':
			return 'm';
		case 'N':
			return 'n';
		case 'O':
			return 'o';
		case 'P':
			return 'p';
		case 'Q':
			return 'q';
		case 'R':
			return 'r';
		case 'S':
			return 's';
		case 'T':
			return 't';
		case 'U':
			return 'u';
		case 'V':
			return 'v';
		case 'W':
			return 'w';
		case 'X':
			return 'x';
		case 'Y':
			return 'y';
		case 'Z':
			return 'z';
		default:
			return c;
		}
	}
	
	public static char capital(char c){
		switch(c){
		case 'a':
			return 'A';
		case 'b':
			return 'B';
		case 'c':
			return 'C';
		case 'd':
			return 'D';
		case 'e':
			return 'E';
		case 'f':
			return 'F';
		case 'g':
			return 'G';
		case 'h':
			return 'H';
		case 'i':
			return 'I';
		case 'j':
			return 'J';
		case 'k':
			return 'K';
		case 'l':
			return 'L';
		case 'm':
			return 'M';
		case 'n':
			return 'N';
		case 'o':
			return 'O';
		case 'p':
			return 'P';
		case 'q':
			return 'Q';
		case 'r':
			return 'R';
		case 's':
			return 'S';
		case 't':
			return 'T';
		case 'u':
			return 'U';
		case 'v':
			return 'V';
		case 'w':
			return 'W';
		case 'x':
			return 'X';
		case 'y':
			return 'Y';
		case 'z':
			return 'Z';
		default:
			return c;	
		}
	}
}
