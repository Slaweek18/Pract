package KI35.Dnistrian.Lab4;

import java.io.*;

public class CatLabApp {
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException{
		
		CatLab tom= new CatLab();
	
		tom.colorCat(tom.getColorEyeCat(),tom.getColorFurCat());
		tom.typeOfCatFur(tom.getLengthFurCat());
		tom.pet(tom.getVision(),tom.getClawCondition());
		
		if(tom.getVision()==Eyes.Regime.dilated && tom.getClawCondition()==Paws.clawCondition.out) 
		tom.timeToEat(tom.getSpeedCat(), tom.getDistanceToPreyCat());
		else if(tom.getVision()==Eyes.Regime.narrow && tom.getClawCondition()==Paws.clawCondition.out)
		tom.numberOfScratches();
		else
		tom.catPettingTime();
		
//new functionality
		
		tom.isSick(tom.getSpeedCat());
		System.out.println("Level of aggression:" + tom.getLevelOfAgressive()+ "%");
		tom.suitable(tom.getLevelOfAgressive(), tom.getSpeedCat());
		if(tom.getSuitable()) {
			tom.experiment();
		}
		tom.dispose();
	}
}
