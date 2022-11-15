package bsu.rfe.java.group9.lw1.LabCow.varA2;

public class MainApplication {

	public static void main(String[] args) {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;
		for (String arg: args) {
			String[] parts = arg.split("/");
			if(parts[0].equals("Cheese")) {
				breakfast[itemsSoFar] = new Cheese();
				itemsSoFar++;
			} 
			else if(parts[0].equals("Apple")) {
				breakfast[itemsSoFar] = new Apple(parts[1]);
				itemsSoFar++;
			} 
			else if(parts[0].equals("Pie")) {
				breakfast[itemsSoFar] = new Pie(parts[1]);
				itemsSoFar++;
			}
		}
		
		for (Food item: breakfast)
			if (item != null)
				item.consume();
			else 
				break;
		System.out.println(itemsSoFar + " products are eaten.");
		System.out.println("Have a nice day!");
	}
}