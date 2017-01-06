abstract class Gandhiji {
	public abstract void fatherOfNation(); 
	public abstract void independence(); 
}
public class GreatPeople extends Gandhiji { 
	public void fatherOfNation() 
	{ 
		System.out.println("Gandhiji is the father of Indian nation"); 
		} 
	public void independence()
	{ System.out.println("Gandhiji's great principle, Ahimsa, got India, the independence"); } public static void main(String args[]) { GreatPeople gp1 = new GreatPeople(); gp1.fatherOfNation(); gp1.independence(); 
	}
}