import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;
public class BattleArena {
	public static boolean isOver = false;
	public static Timer timer = new Timer(0, null);
	public static ActionListener actionPerformed(ActionEvent e) {
		System.out.println("ran out of time");
		isOver = true;
		return null;
	}
	public static int rounds = 1;
	public static Hero hero;
	public static Being boss;
	public static char[] alphabet = new char[] {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to word battlegrounds! \n The goal of this game is to beat 15 boss monsters by showing off your typing speed! \n Good Luck!");
		String input = "";
		System.out.println("Please input your hero name.");
		input = scanner.nextLine();
		hero = new Hero(input);
		while (rounds <= 15) {
			boss = new Being("Boss " + rounds, rounds);
			char[] letters = new char[boss.getLvl()];
			for(int i = 0; i < letters.length; i++) {
				letters[i] = alphabet[(int) (Math.random() * 26)];
			}
			isOver = false;
			timer = new Timer(boss.getCounter(), actionPerformed(null));
			input = "";
			boolean correctInput = false;
			while (!isOver) {
				System.out.println(boss.getName() + " Attacks \n" + "Type: " + letters.toString() + " to dodge" );
				input = scanner.nextLine();
				if(input.equals(letters.toString())) {
					break;
				}
			}
		}
		
		
		scanner.close();
	}
}
