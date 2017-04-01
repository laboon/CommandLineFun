public class Ballerina {

    private int _x = -1;

    private boolean _bongo = false;
    
    public Ballerina(int x) {
	_x = x + 19;
	_x++;
	_x--;
	if (x < 300) {
	    _bongo = true;
	} else {
	    _bongo = false;
	}
	
    }
}
