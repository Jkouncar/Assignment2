

//Create the class Patient
public class Patient {

	//create all our variables
	private String firstNAME;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String emergencyName;
	private String emergencyNum;
	

	
//Create constructor
public Patient (String firstNAME, String middleName, String lastName,
		String address, String city, String state, int zipCode, String emergencyName,
		String emergencyNum) {
	this.firstNAME=firstNAME;
	this.middleName=middleName;
	this.lastName = lastName;
	this.address=address;
	this.city=city;
	this.state=state;
	this.zipCode=zipCode;
	this.emergencyName=emergencyName;
	this.emergencyNum= emergencyNum;
} 


//below is all of our setters and getters, our accessors and mutators

/**
* Function:  getFirstNAME (); 
* Description: Function used to get someones first name
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getFirstNAME() {
	return firstNAME;
}


/**
* Function:  setFirstNAME (String firstNAME); 
* Description: Function used to set someones first name
* Pre: Nothing
* Post: firstNAME will contain our input
*/

public void setFirstNAME(String firstNAME) {
	this.firstNAME = firstNAME;
}


/**
* Function:  getMiddleName (); 
* Description: Function used to get someones middle name
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getMiddleName() {
	return middleName;
}


/**
* Function:  setMiddleName (String middleName); 
* Description: Function used to set someones middle name
* Pre: Nothing
* Post:middleName will contain our input
*/

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}


/**
* Function:  getLastName (); 
* Description: Function used to get someones last name
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getLastName() {
	return lastName;
}


/**
* Function:  setLastName (String lastName); 
* Description: Function used to set someones last name
* Pre: Nothing
* Post: lastName will contain our input
*/

public void setLastName(String lastName) {
	this.lastName = lastName;
}


/**
* Function:  getAddress (); 
* Description: Function used to get someones address
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getAddress() {
	return address;
}


/**
* Function:  setAddress (String address); 
* Description: Function used to set someones address
* Pre: Nothing
* Post: address will contain our input
*/


public void setAddress(String address) {
	this.address = address;
}


/**
* Function:  getCity (); 
* Description: Function used to get someones city
* Pre: Nothing
* Post:Helps us output the input 
*/


public String getCity() {
	return city;
}


/**
* Function:  setCity (String city); 
* Description: Function used to set someones city
* Pre: Nothing
* Post: city will contain our input
*/

public void setCity(String city) {
	this.city = city;
}


/**
* Function:  getState (); 
* Description: Function used to get someones state
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getState() {
	return state;
}


/**
* Function:  setState (String state); 
* Description: Function used to set someones state
* Pre: Nothing
* Post: state will contain our input
*/

public void setState(String state) {
	this.state = state;
}


/**
* Function:  getZipCode (); 
* Description: Function used to get someones zipcode
* Pre: Nothing
* Post:Helps us output the input 
*/

public int getZipCode() {
	return zipCode;
}


/**
* Function:  setZipCode (int zipCode); 
* Description: Function used to set someones zipcode
* Pre: Nothing
* Post: zipCode will contain our input
*  */

public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}


/**
* Function:  getEmergencyName (); 
* Description: Function used to get someones emergency contact name
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getEmergencyName() {
	return emergencyName;
}


/**
* Function:  setEmergencyName (String emergencyName); 
* Description: Function used to set someones emergency contact name
* Pre: Nothing
* Post: emergencyName will contain the input
*/

public void setEmergencyName(String emergencyName) {
	this.emergencyName = emergencyName;
}


/**
* Function:  getEmergencyNum (); 
* Description: Function used to get someones emergency contact number
* Pre: Nothing
* Post:Helps us output the input 
*/

public String getEmergencyNum() {
	return emergencyNum;
}


/**
* Function:  setEmergencyNum (String emergencyNum); 
* Description: Function used to set someones emergency contact number
* Pre: Nothing
* Post: emergencyNum will contain our input
*/

public void setEmergencyNum(String emergencyNum) {
	this.emergencyNum = emergencyNum;
}


}