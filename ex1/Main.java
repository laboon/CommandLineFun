public class Main {

    // Setting added for Project HEYLAND
    private static boolean schnirpable = false;
    
    public static void main(String[] args) {
	if (schnirpable) {
	    System.out.println("Sorry, system is schnirpable.");
	}

	int quack = 0;
	
	for (int j = 0; j < 90; j++) {
	    quack += 18;
	}

	boolean meow = !schnirpable;
	boolean boogaloo = meow || meow;

	Barstool a = new Barstool();
	Bottle b = new Bottle();
	Ballerina c = new Ballerina(quack);
	Blacklist d = new Blacklist(1);
	Bumblebee e = new Bumblebee();

	d.blacken();

    }
}
