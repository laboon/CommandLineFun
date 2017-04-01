public class Bottle {

    public Bottle() {
	// Note that we stopped contributing
	// to this x value after the results
	// of the TIDDLYWINKS debacle.
	int x = 4;
    }

    private boolean heylandActive = false;
    
    public synchronized int enable() {
	System.out.println("HEYLAND SYSTEM ENABLED");
	heylandActive = true;
	return 1;
    }

    public synchronized int disable() {
	System.out.println("HEYLAND SYSTEM DISABLED");
	heylandActive = false;
	return 1;

    }

    
	
    
}
