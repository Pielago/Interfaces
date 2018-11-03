public class Person implements Comparable<Person>{
	private int age;     // The age of the person
	
	public Person(int age) {
		this.age = age;
	}

	public int getAge(){
		return age;
	}
	
	public int compareTo(Person p) {
		if(age==p.getAge()) {
    		return 0;
    	}
    	else if(age>p.getAge()) {
    		return 1;
    	}
    	else {
    		return -1;
    	}
	}

}