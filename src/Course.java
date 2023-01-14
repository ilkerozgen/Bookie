/**
 * An Object class to hold a String and an integer to represent a Course
 * @author Selimhan Tokat
 * @version v1.0, 23.04.2021
 */
public class Course 
{
	private String courseName;
	private int courseCode;
	
	/**
	 * Sets a Course object that holds the course name and course code.
	 * @param courseName the name of the course
	 * @param courseCode the code of the course
	 */
	public Course(String courseName, int courseCode)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	
	/**
	 * A method that sets a new courseName.
	 * @param newCourseName the new course name
	 */
	public void setCourseName(String newCourseName) 
	{
		courseName = newCourseName;
	}
	
	/**
	 * A method that sets a new courseCode.
	 * @param newCourseCode
	 */
	public void setCourseCode(int newCourseCode)
	{
		courseCode = newCourseCode;
	}
	
	/**
	 * A method that returns the courseCode.
	 * @return courseCode
	 */
	public int getCourseCode() 
	{
		return courseCode;
	}
	
	/**
	 * A method that returns the courseName.
	 * @return courseName
	 */
	public String getCourseName()
	 {
		return courseName;
	}
	
	
	/**
	 * An Overridden method that returns the String representation of the object
	 * @return courseName + courseCode
	 */
	@Override
	public String toString()
	{
		return this.getCourseName() + " " + this.getCourseCode();
	}

}