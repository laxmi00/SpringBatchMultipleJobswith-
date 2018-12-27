package com.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
 
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Person {
 
  private String firstName;
  private String lastName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", getFirstName()=" + getFirstName()
			+ ", getLastName()=" + getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
  
  
}