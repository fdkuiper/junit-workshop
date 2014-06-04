package nl.ing.cursus.junit;

/**
 * This class defines the interface for a person. Implementations of this class
 * should define at least a constructor for the fields name and age.
 * 
 * @author ne42ju
 */
public interface Person {
	/**
	 * This method returns the name of the person as String
	 * @return The name
	 */
	public String getName();
	
	/**
	 * This method returns the age of the person as a whole number expressed in years
	 * @return The age in years
	 */
	public int getAge();
	
	/**
	 * This method returns the social status of the person
	 * @return The social status
	 */
	public SocialStatus getSocialStatus();
	
	/**
	 * This method moves the social status of this person to otherPerson. After this method, 
	 * this person has no social status anymore. The otherPerson's social status is
	 * overwritten by the social status of this person.
	 * @param otherPerson The person from who the social status will be set with this persons status
	 */
	public void moveSocialStatusTo(Person otherPerson);
	
	/**
	 * Determine and set the social status of this person with the following algoritme:
	 * <ul>
	 * 	<li>If the name of this person contains one or more characters 'p' (case insensitive) then
	 * this person is not nice</li>
	 * <li>If the age of this person is higher than 40 then the person is nice</li>
	 * </ul>
	 * If both rules conflict with each other, then the name rule overrules the age rule.
	 * After determining the status, the status is set for this person.
	 */
	public void determineSocialStatus();
}
