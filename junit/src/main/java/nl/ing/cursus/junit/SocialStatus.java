package nl.ing.cursus.junit;

/**
 * This class defines the interface for the social status of something. The social
 * status is expressed as nice or not nice. An implementation of this interface should 
 * offer at least one constructor for the initial niceness of something.
 * 
 * @author ne42ju
 */
public interface SocialStatus {
	/**
	 * This method sets the social status of something to not nice. If something 
	 * was not nice already, then this method doesn't change anything.
	 */
	public void makeNotNice();
	
	/**
	 * This method sets the social status of something to nice. If something 
	 * was nice already, then this method doesn't change anything.
	 */
	public void makeNice();
	
	/**
	 * This method returns the niceness of something as a boolean value.
	 * @return Returns true if something is nice, otherwise return false. 
	 */
	public boolean isNice();
	
	/**
	 * Switches the niceness of something. If something was nice then this method set the niceness 
	 * of something to not nice. If it was not nice then this method sets it to nice.
	 */
	public void toggleNice();
	
	/**
	 * Returns a description of the niceness of something. The following rules are used for determining
	 * this description:
	 * <ul>
	 * 	<li>If something is nice, then the string "I'm so nice!!!" is returned</li>
	 * 	<li>If something is not nice, then the string "I'm not nice. Be careful with me!" is returned</li>
	 * </ul>
	 * @return A description of the social status of something.
	 */
	public String getDescription();

}
