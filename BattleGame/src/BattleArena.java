import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;
public class BattleArena {
	//public static boolean isOver = false;
	//public static Timer timer = new Timer(0, null);
//	public static ActionListener actionPerformed(ActionEvent e) {
//		System.out.println("ran out of time");
//		isOver = true;
//		return null;
//	}
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
		while (hero.getHp() > 0) {
			for (int round = 1; round <= 15; round++) {
				boss = new Being("Boss " + round, round);
				while (boss.getHp() > 0 && hero.getHp() > 0) {
					char[] letters = new char[boss.getLvl()];
					for(int i = 0; i < letters.length; i++) {
						letters[i] = alphabet[(int) (Math.random() * 26)];
					}
					input = "";
					String toType = new String(letters);
					System.out.println(boss.getName() + " Attacks \n" + "Type: " + toType + " to dodge/block" );
					input = scanner.next();
					if (input.equals(toType)) {
						double dodgeOrBlock = Math.random();
						if (dodgeOrBlock > 0.75) {
							System.out.println(hero.getName() + " has dodged " + boss.getName() + "'s attack."
												+ "\n Damage Taken: 0"
												+ "\n Current Hp: " + hero.getHp());
							int damage2 = boss.damage(hero);
							System.out.println(boss.getName() + " has taken damage from " + hero.getName() + "."
												+ "\n Damage Taken: " + damage2
												+ "\n Current Hp: " + boss.getHp());
						} else {
							int damaged = hero.block(boss);
							System.out.println(hero.getName() + " has blocked " + boss.getName() + "'s attack."
									+ "\n Damage Taken: " + damaged
									+ "\n Current Hp: " + hero.getHp());
							if (hero.getHp() <= 0) {
								break;
							}
							int damage2 = boss.damage(hero);
							System.out.println(boss.getName() + " has taken damage from " + hero.getName() + "."
									+ "\n Damage Taken: " + damage2
									+ "\n Current Hp: " + boss.getHp());
						} 
					} else {
						int damaged = hero.damage(boss);
						System.out.println(hero.getName() + " has been hit by " + boss.getName() + "'s attack and can't retaliate."
								+ "\n Damage Taken: " + damaged 
								+ "\n Current Hp: " + hero.getHp());
						if (hero.getHp() <= 0) {
							break;
						}
					}
				}
				if (hero.getHp() <= 0) {
					System.out.println("You Lose! :(");
					System.out.println("Would you like to play again? \n Y/N");
					input = scanner.next();
					if (input.equals("Y")) {
						main(args);
					} else {
						break;
					}
				}
				hero.updateAll();
				
			}
		}
		System.out.println("Thanks for Playing!");
		scanner.close();
	}
}
