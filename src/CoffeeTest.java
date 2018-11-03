// JUnit4 imports
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Imports required to compile before changing to fit JUnit4
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Assignment 5: Interfaces <br />
 * Part 1: The {@code CoffeeTest} class
 */

public class CoffeeTest {
	
    private List<Coffee> coffees;

    @Before public void setUp() throws Exception {
        coffees = new ArrayList<Coffee>();
        coffees.add(new Coffee(10));
        coffees.add(new Coffee(2));
        coffees.add(new Coffee(10));
        coffees.add(new Coffee(20));
        coffees.add(new Coffee(5));
    }

    @After public void tearDown() throws Exception {
    }

    @Test public void testComparable() {
    	// Will sort the coffee strength 
        Collections.sort(coffees);
        
        // Create the expected sorted list
        List<Coffee> coffeesSorted = new ArrayList<Coffee>();
        coffeesSorted.add(new Coffee(2));
        coffeesSorted.add(new Coffee(5));
        coffeesSorted.add(new Coffee(10));
        coffeesSorted.add(new Coffee(10));
        coffeesSorted.add(new Coffee(20));
        
        // Check to see if the two are equal
        int i = 0;
        for (Coffee type : coffees) {
        	assertEquals(coffees.get(i).getStrength(),coffeesSorted.get(i).getStrength());
        	i++;
        }
    }
}