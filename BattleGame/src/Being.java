
public class Being {
	private String name;
	private int hp, strength, defense, counter, lvl;
	private double crit;
	
	public Being(String name, int hp, int strength, int defense, double crit, int counter, int lvl) {
		this.name = name; this.hp = hp; this.strength = strength; this.defense = defense; this.crit = crit; this.counter = counter; this.lvl =lvl;
	}
	
	public Being(String name, int lvl) {
		this.name = name;
		this.lvl = lvl;
		hp = lvl * 10;
		strength = lvl;
		defense = lvl;
		crit = lvl * 0.01;
		counter = lvl/5 + 3;
	}
	public Being() {}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	
	public double getCrit() {
		return crit;
	}
	public void setCrit(double crit) {
		this.crit = crit;
	}
	
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
}
