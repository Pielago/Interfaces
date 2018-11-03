/**
 * Assignment 5: Interfaces <br />
 * Part 1: The {@code Coffee} class
 */
public class Coffee implements Comparable<Coffee> {
    private int strength;       // The strength of the coffee
    // TODO: Assignment 5 Part 1 -- complete this class
    public Coffee(int strength) {
    	this.strength = strength;
    }
    
    public int getStrength() {
    	return strength;
    }
    
    public int compareTo(Coffee c) {
    	if(strength==c.getStrength()) {
    		return 0;
    	}
    	else if(strength>c.getStrength()) {
    		return 1;
    	}
    	else {
    		return -1;
    	}
    }
}