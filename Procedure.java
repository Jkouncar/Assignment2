//Create class called Procedure
public class Procedure {
	//create our variables
private String procedureName;
private String procedureDate;
private String practitionerName;
private double procedureCharge;

//create constructor
public Procedure (String procedureName, String procedureDate, String practitionerName,
		double  procedureCharge) {
	this.procedureName=procedureName;
	this.procedureDate=procedureDate;
	this.practitionerName= practitionerName;
	this.procedureCharge= procedureCharge;
}

//below is all of our setters and getters, our accessors and mutators

/**
* Function:  getProcedureName (); 
* Description: Function used to get someones procedure name
* Post:Helps us output the input 
 */
public String getProcedureName() {
	return procedureName;
}

/**
* Function:  setProcedureName (String procedureName); 
* Description: Function used to set someones emergency contact number
* Pre: Nothing
* Post: procedureName will contain our input
 */
public void setProcedureName(String procedureName) {
	this.procedureName = procedureName;
}

/**
* Function:  getProcedureDate (); 
* Description: Function used to get someones procedure date
* Pre: Nothing
* Post:Helps us output the input 
 */
public String getProcedureDate() {
	return procedureDate;
}

/**
* Function:  setProcedureDate (String procedureDate); 
* Description: setProcedureDate used to set someones procedure date
* Pre: Nothing
* Post: procedureDate will contain our input
 */
public void setProcedureDate(String procedureDate) {
	this.procedureDate = procedureDate;
}

/**
* Function:  getPractitionerName (); 
* Description: Function used to get someones dr name
* Pre: Nothing
* Post:Helps us output the input 
 */
public String getPractitionerName() {
	return practitionerName;
}

/**
* Function:  setPractitionerName (String practitionerName); 
* Description: Function used to set someones dr name
* Pre: Nothing
* Post:practitionerName will contain our input
*  */
public void setPractitionerName(String practitionerName) {
	this.practitionerName = practitionerName;
}

/**
* Function:  getProcedureCharge (); 
* Description: Function used to get someones procedure cost
* Pre: Nothing
* Post:Helps us output the input 
 */
public double getProcedureCharge() {
	return procedureCharge;
}

/**
* Function:  setProcedureCharge (); 
* Description: Function used to set someones procedure cost 
* Pre: Nothing
* Post: procedureCharge will contain our input
 */
public void setProcedureCharge(double procedureCharge) {
	this.procedureCharge = procedureCharge;
}
}