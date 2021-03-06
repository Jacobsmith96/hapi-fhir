package ca.uhn.fhir.parser;

import org.hl7.fhir.dstu3.model.Address.AddressUse;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Patient;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name = "Patient")
public class MyPatientWithOneDeclaredEnumerationExtensionDstu3 extends Patient {

	private static final long serialVersionUID = 1L;

	@Child(order = 0, name = "foo")
	@ca.uhn.fhir.model.api.annotation.Extension(url = "urn:foo", definedLocally = true, isModifier = false)
	private Enumeration<AddressUse> myFoo;

	public Enumeration<AddressUse> getFoo() {
		return myFoo;
	}

	public void setFoo(Enumeration<AddressUse> theFoo) {
		myFoo = theFoo;
	}

}