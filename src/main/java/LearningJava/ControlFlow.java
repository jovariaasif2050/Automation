package LearningJava;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = true;
		
		if(hungry) {
		System.out.println("Im starving..");
		} 
		else 
		{
			System.out.println("I am not hungry");
	}
		int hungerRating = 5;
		if(!(hungerRating < 6)) {
			System.out.println("Not hungry");
		}
		else {
			System.out.println("I'm starving");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 60;
		String opinion;
		
		if(currentTemp < favoriteTemp -30) {
			opinion = "It's Pretty Darn Cold..";
			
		} else if(currentTemp < favoriteTemp -20){
			opinion = "It's kinda cold out..";
		} else if (currentTemp > favoriteTemp +10) {
			opinion = "It's too hot out";
		} else {
			opinion = "its beautiful outside";
		}
		System.out.println(opinion);
}
}
