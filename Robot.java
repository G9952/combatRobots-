package combatRobots;

public class Robot {
	
	String name;
	int life;
	
	public Robot (String name){
		this.name = " Robot "+name;
		this.life = 10;
	}
	
	public void setName(String n){
		this.name =n;
	}
	
	public void setLife(int l) {
		this.life = l;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLife() {
		return life;
	}
	
	public void fire( Robot rb ){
		if(rb.getLife() > 0 && this.getLife() >0) {
			rb.setLife(rb.getLife() - 2);
			System.out.println("The"+rb.getName()+" was hit by"+this.name+" and his number of remaining lives is: "+rb.getLife());
		}else {
			System.out.println("The big winner of this fight is"+rb.getName());
			System.out.println();
			System.out.println("CONGRATULATION SIR "+rb.getName());
		}
	}
	
	public void isDead (Robot rb) {
		if(rb.getLife() == 0) {
			
			System.out.println("The"+rb.getName()+" is dead.");
		}else {
		}
	}
	public static void main(String[] args) {
	
	}
	
}
