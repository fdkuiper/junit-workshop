package nl.ing.cursus.junit;

import java.util.List;

/**
 * This class represents a team of persons. A team can contain zero or more persons.
 * Initially a Team contains no persons. A person object can only exist once in a team. So
 * two persons referring to the same Person object can only exist once in the team.
 * 
 * @author ne42ju
 */
public interface Team {
	/**
	 * This method returns all the nice persons of this team.
	 * @return A list containing zero or more Person objects
	 */
	public List<Person> getNicePersons();

	/**
	 * This method returns all the persons in this team.
	 * @return A list containing zero or more Person objects
	 */
	public List<Person> getAllPersons();

	/**
	 * This method returns all the persons in this team with the provided name.
	 * @param name The name that is used for comparison
	 * @return A list containing zero or more Person objects for which the name is equal to the provided name
	 */
	public List<Person> getPersonsForName(String name);

	/**
	 * This method returns all the persons in this team with the provided age.
	 * @param age The age that is used for comparison
	 * @return A list containing zero or more Person objects for which the age is equal to the provided age
	 */
	public List<Person> getPersonsForAge(int age);
	
	/**
	 * Adds a person object to the set of persons already in this team. If the provided person is already in
	 * this team, than the provided person will not be added again.
	 * @param person The person object to be added
	 */
	public void addPerson(Person person);
	
	/**
	 * Removed a person object from the set of persons in this team
	 * @param person
	 */
	public void removePerson(Person person);
	
	/**
	 * This method return a list of strings (zero or more) with the names of the persons in the team. Sorting follows
	 * the same rules as the default implementation of the String.compareTo() method.
	 * @return A sorted list of string with zero or more names from this team persons
	 */
	public List<String> getSortedListOfPersonNames();
	
}
