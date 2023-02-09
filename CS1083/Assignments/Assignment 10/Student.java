/**
Represents a student.
@author Dineth Mithuranga and 3701155
*/
public class Student implements Comparable<Student>{

	/**
	The last name of the student.
	*/
	private String lastName;
	
	/**
	The first name of the student.
	*/
	private String firstName;
	
	/**
	The student's ID number.
	*/
	private int id;
	
	
	/**
	Constructs a student given their first and last name, and student ID.
	@param firstNameIn The first name of the student.
	@param lastNameIn The last name of the student.
	@param idIn The student's ID number.
	*/
	public Student(String firstNameIn, String lastNameIn, int idIn){
		firstName = firstNameIn;
		lastName = lastNameIn;
		id = idIn;
	}
		
	/**
	Prints all the information about the student.
	@return The student's information.
	*/
	public String toString(){
		return lastName + ", " + firstName + " (" + id + ")";
	}
	
	/**
	Compares one student to another by last name, first name or id.
	@param other the other student to compare against.
	@return a positive value if this student should be first in the list the value is greater than zero negative if not.
	*/
	public int compareTo(Student other){
		if(this.lastName.compareTo(other.lastName) != 0){
			return this.lastName.compareTo(other.lastName);
		}
		else{
			if(this.firstName.compareTo(other.firstName) != 0){
				return this.firstName.compareTo(other.firstName);
			}
			else{
				return (this.id-other.id);
			}
		}
	}
	
}