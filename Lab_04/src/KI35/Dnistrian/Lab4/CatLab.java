package KI35.Dnistrian.Lab4;
import java.io.*;
import java.util.Random;

public class CatLab extends Cat implements catCondition,schrodinger {
	
	private int levelOfAgressive=0;
	boolean isSuitable;

	public CatLab() throws FileNotFoundException{
	
		agree();
	}
	
	public void isSick(float speed) {
		if(speed>=30) {
			System.out.println("Cat isn't sick");
		}
		else System.out.println("Cat is sick");
	}		
	
	public void agree() {
		
		if(getVision()==Eyes.Regime.dilated && getClawCondition()==Paws.clawCondition.out) 
			levelOfAgressive= veryAgree;
		else if(getVision()==Eyes.Regime.narrow && getClawCondition()==Paws.clawCondition.out)
			levelOfAgressive=averageAgree;
		else levelOfAgressive=littleAgree;
	}
	public int getLevelOfAgressive() {
		return levelOfAgressive;
	}
	public boolean getSuitable() {
		return isSuitable;
	}
	
	public void suitable(int levelagree,float speed) {
		if(levelagree==0 && speed>=30) {
			System.out.println("The cat is suitable for the experiment");
			isSuitable=true;
		}
		else {
			System.out.println("You need to get another cat");
			isSuitable=false;
			}
	}
	public void experiment() {
		Random ran = new Random();
		int dead = ran.nextInt(2);
		if(dead==0) 
			System.out.println("The cat is dead(((");
		else System.out.println("The cat is alive)))");
	}
}
