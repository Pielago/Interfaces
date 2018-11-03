// JUnit4 imports
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

// Imports required to compile before changing to fit JUnit4
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

// Imports required to compile after changing to fit JUnit4
import java.util.List;
import java.util.ArrayList;

/**
 * Assignment 5: Interfaces <br />
 * Part 3: The {@code PersonTest} class
 */
public class PersonTest {
	
	private static Set<Person> persons;
	
	@Before public void setUp() throws Exception {
        persons = new TreeSet<Person>(new PersonComparator());
        persons.add(new Person(32));
        persons.add(new Person(17));
        persons.add(new Person(13));
        persons.add(new Person(35));
        persons.add(new Person(27));
    }

    @After public void tearDown() throws Exception {
    }
    
    @Test public void runTest() {
        // TODO: Assignment 5 Part 3 -- rewrite this using JUnit
    	List<Person> personsNew = new ArrayList<Person>(persons);
    	// Create the expected sorted list
        List<Person> personsSorted = new ArrayList<Person>();
        personsSorted.add(new Person(13));
        personsSorted.add(new Person(17));
        personsSorted.add(new Person(27));
        personsSorted.add(new Person(32));
        personsSorted.add(new Person(35));
        
        // Check to see if the two are equal
        int i = 0;
        for (Person type : personsNew) {
        	assertEquals(personsNew.get(i).getAge(),personsSorted.get(i).getAge());
        	i++;
        }
    }
}
