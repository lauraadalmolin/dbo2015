package expecto_patronum;

public interface IBetterList extends IList {
	    
		// add an object in the begin of the list (the oposite of append)
	    public void prepend(Object o);
	    
	    // add an object in the specified index
	    public void insert(int index, Object o);
	    
	    // reorganize in ascending order (use the Object#compareTo(Object) method to contrast greater and less)
	    public void sort();
	    
	    // reverse the list, the first ones will be last
	    public void reverse();
	    
	    // randomize the positions
	    public void shuffle();
	    
	    // extract a sublist
	    public BetterList sublist(int start, int end);
	    
	    // this one must accept a negative index
	    public Object get(int index);
	    
	    // get an object from a random position
	    public Object sample();
	
}
