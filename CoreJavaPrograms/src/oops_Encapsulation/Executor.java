package oops_Encapsulation;

public class Executor {
   
	public static void main(String[] args) {

        // Creating object of EncapsulationDemo class
        EncapsulationDemo player = new EncapsulationDemo();

        // Setting values using setters
        player.setPlayerName("M S Dhoni");
        player.setPlayerAge(44);
        player.setJerseyNumber(7);

        // Getting and displaying object data
        System.out.println(player);
    }
	
}
