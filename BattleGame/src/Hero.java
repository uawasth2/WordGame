
public class Hero extends Being{
	private int vitality;

	public Hero(String name) {
		super(name, 100, 10, 10, 10, 0, 1);
		vitality = 10;
	}
	
	public int getVitality() {return this.vitality;}
	
	public void updateStrength() {this.setStrength(this.getStrength() + 1);}
	public void updateDefense() {this.setDefense(this.getDefense() + 1);}
	public void updateVitality() {this.vitality++; this.setHp(vitality * 10 + this.getLvl());}
	public void updateCrit() {this.setCrit(this.getCrit() + 1);}
	public void updateLevel() {this.setLvl(this.getLvl() + 1); this.setHp(vitality * 10 + this.getLvl());}
}
