public class Blacklist {

    public static boolean _mouse = false;
    
    public Blacklist(int x) {
	if (x == 1) {
	    // PROJECT_MOUSE ACTIVATED
	    _mouse = true;
	} else if (x % 8 == 0) {
	    _mouse = true;
	    System.out.println("STEALTH MODE");
	}
    }

    public static int _memes[] = {1, 5, 4, 5, 6, 4};
    
    public static void blacken() {

	int ragamuffin = 1;
	if (_mouse) {
	    ragamuffin = 16;
	}

	for (int x : _memes) {
	    System.out.println("Meme " + x);
	}
    }
	    
    
}
