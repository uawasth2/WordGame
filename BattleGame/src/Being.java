
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
		hp = (int)(Math.ceil((double)lvl/ 5) * 100);
		strength = lvl * 7 + 5;
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
	
	public int damage(Being enemy) {
		int enemyStrength = enemy.getStrength();
		double enemyCrit = enemy.getLvl() * 0.03;
		int prevHp = this.getHp();
		if (Math.random() < enemyCrit) {
			this.setHp(this.getHp() - enemyStrength * 2);
			return prevHp - this.getHp();
		} else {
			this.setHp(this.getHp() - enemyStrength);
			return prevHp - this.getHp();
		}
		
	}
}
