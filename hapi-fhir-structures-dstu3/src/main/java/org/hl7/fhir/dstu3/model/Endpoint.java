package org.hl7.fhir.dstu3.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, May 29, 2016 16:57-0400 for FHIR v1.4.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.dstu3.exceptions.FHIRException;
/**
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
 */
@ResourceDef(name="Endpoint", profile="http://hl7.org/fhir/Profile/Endpoint")
public class Endpoint extends DomainResource {

    public enum EndpointStatus {
        /**
         * This endpoint is expected to be active and can be used
         */
        ACTIVE, 
        /**
         * This endpoint is temporarily unavailable
         */
        SUSPENDED, 
        /**
         * This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken
         */
        ERROR, 
        /**
         * This endpoint is no longer to be used
         */
        OFF, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static EndpointStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("suspended".equals(codeString))
          return SUSPENDED;
        if ("error".equals(codeString))
          return ERROR;
        if ("off".equals(codeString))
          return OFF;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown EndpointStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case SUSPENDED: return "suspended";
            case ERROR: return "error";
            case OFF: return "off";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACTIVE: return "http://hl7.org/fhir/endpoint-status";
            case SUSPENDED: return "http://hl7.org/fhir/endpoint-status";
            case ERROR: return "http://hl7.org/fhir/endpoint-status";
            case OFF: return "http://hl7.org/fhir/endpoint-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "This endpoint is expected to be active and can be used";
            case SUSPENDED: return "This endpoint is temporarily unavailable";
            case ERROR: return "This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken";
            case OFF: return "This endpoint is no longer to be used";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case SUSPENDED: return "Suspended";
            case ERROR: return "Error";
            case OFF: return "Off";
            default: return "?";
          }
        }
    }

  public static class EndpointStatusEnumFactory implements EnumFactory<EndpointStatus> {
    public EndpointStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return EndpointStatus.ACTIVE;
        if ("suspended".equals(codeString))
          return EndpointStatus.SUSPENDED;
        if ("error".equals(codeString))
          return EndpointStatus.ERROR;
        if ("off".equals(codeString))
          return EndpointStatus.OFF;
        throw new IllegalArgumentException("Unknown EndpointStatus code '"+codeString+"'");
        }
        public Enumeration<EndpointStatus> fromType(Base code) throws FHIRException {
          if (code == null || code.isEmpty())
            return null;
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("active".equals(codeString))
          return new Enumeration<EndpointStatus>(this, EndpointStatus.ACTIVE);
        if ("suspended".equals(codeString))
          return new Enumeration<EndpointStatus>(this, EndpointStatus.SUSPENDED);
        if ("error".equals(codeString))
          return new Enumeration<EndpointStatus>(this, EndpointStatus.ERROR);
        if ("off".equals(codeString))
          return new Enumeration<EndpointStatus>(this, EndpointStatus.OFF);
        throw new FHIRException("Unknown EndpointStatus code '"+codeString+"'");
        }
    public String toCode(EndpointStatus code) {
      if (code == EndpointStatus.ACTIVE)
        return "active";
      if (code == EndpointStatus.SUSPENDED)
        return "suspended";
      if (code == EndpointStatus.ERROR)
        return "error";
      if (code == EndpointStatus.OFF)
        return "off";
      return "?";
      }
    public String toSystem(EndpointStatus code) {
      return code.getSystem();
      }
    }

    /**
     * active | suspended | error | off.
     */
    @Child(name = "status", type = {CodeType.class}, order=0, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | suspended | error | off", formalDefinition="active | suspended | error | off." )
    protected Enumeration<EndpointStatus> status;

    /**
     * The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).
     */
    @Child(name = "managingOrganization", type = {Organization.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Organization that exposes the endpoint", formalDefinition="The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data)." )
    protected Reference managingOrganization;

    /**
     * The actual object that is the target of the reference (The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).)
     */
    protected Organization managingOrganizationTarget;

    /**
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
     */
    @Child(name = "contact", type = {ContactPoint.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Contact details for source (e.g. troubleshooting)", formalDefinition="Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting." )
    protected List<ContactPoint> contact;

    /**
     * The type of channel to send notifications on.
     */
    @Child(name = "connectionType", type = {CodeType.class}, order=3, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="rest-hook | websocket | email | sms | message", formalDefinition="The type of channel to send notifications on." )
    protected CodeType connectionType;

    /**
     * The http verb to be used when calling this endpoint.
     */
    @Child(name = "method", type = {Coding.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The http verb to be used when calling this endpoint", formalDefinition="The http verb to be used when calling this endpoint." )
    protected List<Coding> method;

    /**
     * The interval during which the managing organization assumes the defined responsibility.
     */
    @Child(name = "period", type = {Period.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Interval during responsibility is assumed", formalDefinition="The interval during which the managing organization assumes the defined responsibility." )
    protected Period period;

    /**
     * The uri that describes the actual end-point to send messages to.
     */
    @Child(name = "address", type = {UriType.class, StringType.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Where the channel points to", formalDefinition="The uri that describes the actual end-point to send messages to." )
    protected Type address;

    /**
     * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
     */
    @Child(name = "payloadFormat", type = {StringType.class}, order=7, min=1, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Mimetype to send, or blank for no payload", formalDefinition="The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification." )
    protected StringType payloadFormat;

    /**
     * The payload type describes the acceptable content that can be communicated on the endpoint.
     */
    @Child(name = "payloadType", type = {CodeableConcept.class}, order=8, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)", formalDefinition="The payload type describes the acceptable content that can be communicated on the endpoint." )
    protected List<CodeableConcept> payloadType;

    /**
     * Additional headers / information to send as part of the notification.
     */
    @Child(name = "header", type = {StringType.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Usage depends on the channel type", formalDefinition="Additional headers / information to send as part of the notification." )
    protected List<StringType> header;

    /**
     * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
     */
    @Child(name = "publicKey", type = {StringType.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="PKI Public keys to support secure communications", formalDefinition="The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available." )
    protected StringType publicKey;

    private static final long serialVersionUID = -336265613L;

  /**
   * Constructor
   */
    public Endpoint() {
      super();
    }

  /**
   * Constructor
   */
    public Endpoint(Enumeration<EndpointStatus> status, CodeType connectionType, StringType payloadFormat) {
      super();
      this.status = status;
      this.connectionType = connectionType;
      this.payloadFormat = payloadFormat;
    }

    /**
     * @return {@link #status} (active | suspended | error | off.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<EndpointStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<EndpointStatus>(new EndpointStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (active | suspended | error | off.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Endpoint setStatusElement(Enumeration<EndpointStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return active | suspended | error | off.
     */
    public EndpointStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value active | suspended | error | off.
     */
    public Endpoint setStatus(EndpointStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<EndpointStatus>(new EndpointStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #managingOrganization} (The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).)
     */
    public Reference getManagingOrganization() { 
      if (this.managingOrganization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.managingOrganization");
        else if (Configuration.doAutoCreate())
          this.managingOrganization = new Reference(); // cc
      return this.managingOrganization;
    }

    public boolean hasManagingOrganization() { 
      return this.managingOrganization != null && !this.managingOrganization.isEmpty();
    }

    /**
     * @param value {@link #managingOrganization} (The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).)
     */
    public Endpoint setManagingOrganization(Reference value) { 
      this.managingOrganization = value;
      return this;
    }

    /**
     * @return {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).)
     */
    public Organization getManagingOrganizationTarget() { 
      if (this.managingOrganizationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.managingOrganization");
        else if (Configuration.doAutoCreate())
          this.managingOrganizationTarget = new Organization(); // aa
      return this.managingOrganizationTarget;
    }

    /**
     * @param value {@link #managingOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).)
     */
    public Endpoint setManagingOrganizationTarget(Organization value) { 
      this.managingOrganizationTarget = value;
      return this;
    }

    /**
     * @return {@link #contact} (Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.)
     */
    public List<ContactPoint> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ContactPoint>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Endpoint setContact(List<ContactPoint> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ContactPoint item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ContactPoint addContact() { //3
      ContactPoint t = new ContactPoint();
      if (this.contact == null)
        this.contact = new ArrayList<ContactPoint>();
      this.contact.add(t);
      return t;
    }

    public Endpoint addContact(ContactPoint t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ContactPoint>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist
     */
    public ContactPoint getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #connectionType} (The type of channel to send notifications on.). This is the underlying object with id, value and extensions. The accessor "getConnectionType" gives direct access to the value
     */
    public CodeType getConnectionTypeElement() { 
      if (this.connectionType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.connectionType");
        else if (Configuration.doAutoCreate())
          this.connectionType = new CodeType(); // bb
      return this.connectionType;
    }

    public boolean hasConnectionTypeElement() { 
      return this.connectionType != null && !this.connectionType.isEmpty();
    }

    public boolean hasConnectionType() { 
      return this.connectionType != null && !this.connectionType.isEmpty();
    }

    /**
     * @param value {@link #connectionType} (The type of channel to send notifications on.). This is the underlying object with id, value and extensions. The accessor "getConnectionType" gives direct access to the value
     */
    public Endpoint setConnectionTypeElement(CodeType value) { 
      this.connectionType = value;
      return this;
    }

    /**
     * @return The type of channel to send notifications on.
     */
    public String getConnectionType() { 
      return this.connectionType == null ? null : this.connectionType.getValue();
    }

    /**
     * @param value The type of channel to send notifications on.
     */
    public Endpoint setConnectionType(String value) { 
        if (this.connectionType == null)
          this.connectionType = new CodeType();
        this.connectionType.setValue(value);
      return this;
    }

    /**
     * @return {@link #method} (The http verb to be used when calling this endpoint.)
     */
    public List<Coding> getMethod() { 
      if (this.method == null)
        this.method = new ArrayList<Coding>();
      return this.method;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Endpoint setMethod(List<Coding> theMethod) { 
      this.method = theMethod;
      return this;
    }

    public boolean hasMethod() { 
      if (this.method == null)
        return false;
      for (Coding item : this.method)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Coding addMethod() { //3
      Coding t = new Coding();
      if (this.method == null)
        this.method = new ArrayList<Coding>();
      this.method.add(t);
      return t;
    }

    public Endpoint addMethod(Coding t) { //3
      if (t == null)
        return this;
      if (this.method == null)
        this.method = new ArrayList<Coding>();
      this.method.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #method}, creating it if it does not already exist
     */
    public Coding getMethodFirstRep() { 
      if (getMethod().isEmpty()) {
        addMethod();
      }
      return getMethod().get(0);
    }

    /**
     * @return {@link #period} (The interval during which the managing organization assumes the defined responsibility.)
     */
    public Period getPeriod() { 
      if (this.period == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.period");
        else if (Configuration.doAutoCreate())
          this.period = new Period(); // cc
      return this.period;
    }

    public boolean hasPeriod() { 
      return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The interval during which the managing organization assumes the defined responsibility.)
     */
    public Endpoint setPeriod(Period value) { 
      this.period = value;
      return this;
    }

    /**
     * @return {@link #address} (The uri that describes the actual end-point to send messages to.)
     */
    public Type getAddress() { 
      return this.address;
    }

    /**
     * @return {@link #address} (The uri that describes the actual end-point to send messages to.)
     */
    public UriType getAddressUriType() throws FHIRException { 
      if (!(this.address instanceof UriType))
        throw new FHIRException("Type mismatch: the type UriType was expected, but "+this.address.getClass().getName()+" was encountered");
      return (UriType) this.address;
    }

    public boolean hasAddressUriType() { 
      return this.address instanceof UriType;
    }

    /**
     * @return {@link #address} (The uri that describes the actual end-point to send messages to.)
     */
    public StringType getAddressStringType() throws FHIRException { 
      if (!(this.address instanceof StringType))
        throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.address.getClass().getName()+" was encountered");
      return (StringType) this.address;
    }

    public boolean hasAddressStringType() { 
      return this.address instanceof StringType;
    }

    public boolean hasAddress() { 
      return this.address != null && !this.address.isEmpty();
    }

    /**
     * @param value {@link #address} (The uri that describes the actual end-point to send messages to.)
     */
    public Endpoint setAddress(Type value) { 
      this.address = value;
      return this;
    }

    /**
     * @return {@link #payloadFormat} (The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.). This is the underlying object with id, value and extensions. The accessor "getPayloadFormat" gives direct access to the value
     */
    public StringType getPayloadFormatElement() { 
      if (this.payloadFormat == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.payloadFormat");
        else if (Configuration.doAutoCreate())
          this.payloadFormat = new StringType(); // bb
      return this.payloadFormat;
    }

    public boolean hasPayloadFormatElement() { 
      return this.payloadFormat != null && !this.payloadFormat.isEmpty();
    }

    public boolean hasPayloadFormat() { 
      return this.payloadFormat != null && !this.payloadFormat.isEmpty();
    }

    /**
     * @param value {@link #payloadFormat} (The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.). This is the underlying object with id, value and extensions. The accessor "getPayloadFormat" gives direct access to the value
     */
    public Endpoint setPayloadFormatElement(StringType value) { 
      this.payloadFormat = value;
      return this;
    }

    /**
     * @return The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
     */
    public String getPayloadFormat() { 
      return this.payloadFormat == null ? null : this.payloadFormat.getValue();
    }

    /**
     * @param value The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.
     */
    public Endpoint setPayloadFormat(String value) { 
        if (this.payloadFormat == null)
          this.payloadFormat = new StringType();
        this.payloadFormat.setValue(value);
      return this;
    }

    /**
     * @return {@link #payloadType} (The payload type describes the acceptable content that can be communicated on the endpoint.)
     */
    public List<CodeableConcept> getPayloadType() { 
      if (this.payloadType == null)
        this.payloadType = new ArrayList<CodeableConcept>();
      return this.payloadType;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Endpoint setPayloadType(List<CodeableConcept> thePayloadType) { 
      this.payloadType = thePayloadType;
      return this;
    }

    public boolean hasPayloadType() { 
      if (this.payloadType == null)
        return false;
      for (CodeableConcept item : this.payloadType)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addPayloadType() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.payloadType == null)
        this.payloadType = new ArrayList<CodeableConcept>();
      this.payloadType.add(t);
      return t;
    }

    public Endpoint addPayloadType(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.payloadType == null)
        this.payloadType = new ArrayList<CodeableConcept>();
      this.payloadType.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #payloadType}, creating it if it does not already exist
     */
    public CodeableConcept getPayloadTypeFirstRep() { 
      if (getPayloadType().isEmpty()) {
        addPayloadType();
      }
      return getPayloadType().get(0);
    }

    /**
     * @return {@link #header} (Additional headers / information to send as part of the notification.)
     */
    public List<StringType> getHeader() { 
      if (this.header == null)
        this.header = new ArrayList<StringType>();
      return this.header;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Endpoint setHeader(List<StringType> theHeader) { 
      this.header = theHeader;
      return this;
    }

    public boolean hasHeader() { 
      if (this.header == null)
        return false;
      for (StringType item : this.header)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #header} (Additional headers / information to send as part of the notification.)
     */
    public StringType addHeaderElement() {//2 
      StringType t = new StringType();
      if (this.header == null)
        this.header = new ArrayList<StringType>();
      this.header.add(t);
      return t;
    }

    /**
     * @param value {@link #header} (Additional headers / information to send as part of the notification.)
     */
    public Endpoint addHeader(String value) { //1
      StringType t = new StringType();
      t.setValue(value);
      if (this.header == null)
        this.header = new ArrayList<StringType>();
      this.header.add(t);
      return this;
    }

    /**
     * @param value {@link #header} (Additional headers / information to send as part of the notification.)
     */
    public boolean hasHeader(String value) { 
      if (this.header == null)
        return false;
      for (StringType v : this.header)
        if (v.equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #publicKey} (The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.). This is the underlying object with id, value and extensions. The accessor "getPublicKey" gives direct access to the value
     */
    public StringType getPublicKeyElement() { 
      if (this.publicKey == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Endpoint.publicKey");
        else if (Configuration.doAutoCreate())
          this.publicKey = new StringType(); // bb
      return this.publicKey;
    }

    public boolean hasPublicKeyElement() { 
      return this.publicKey != null && !this.publicKey.isEmpty();
    }

    public boolean hasPublicKey() { 
      return this.publicKey != null && !this.publicKey.isEmpty();
    }

    /**
     * @param value {@link #publicKey} (The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.). This is the underlying object with id, value and extensions. The accessor "getPublicKey" gives direct access to the value
     */
    public Endpoint setPublicKeyElement(StringType value) { 
      this.publicKey = value;
      return this;
    }

    /**
     * @return The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
     */
    public String getPublicKey() { 
      return this.publicKey == null ? null : this.publicKey.getValue();
    }

    /**
     * @param value The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
     */
    public Endpoint setPublicKey(String value) { 
      if (Utilities.noString(value))
        this.publicKey = null;
      else {
        if (this.publicKey == null)
          this.publicKey = new StringType();
        this.publicKey.setValue(value);
      }
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "code", "active | suspended | error | off.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("managingOrganization", "Reference(Organization)", "The organization that exposes the endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data).", 0, java.lang.Integer.MAX_VALUE, managingOrganization));
        childrenList.add(new Property("contact", "ContactPoint", "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.", 0, java.lang.Integer.MAX_VALUE, contact));
        childrenList.add(new Property("connectionType", "code", "The type of channel to send notifications on.", 0, java.lang.Integer.MAX_VALUE, connectionType));
        childrenList.add(new Property("method", "Coding", "The http verb to be used when calling this endpoint.", 0, java.lang.Integer.MAX_VALUE, method));
        childrenList.add(new Property("period", "Period", "The interval during which the managing organization assumes the defined responsibility.", 0, java.lang.Integer.MAX_VALUE, period));
        childrenList.add(new Property("address[x]", "uri|string", "The uri that describes the actual end-point to send messages to.", 0, java.lang.Integer.MAX_VALUE, address));
        childrenList.add(new Property("payloadFormat", "string", "The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification.", 0, java.lang.Integer.MAX_VALUE, payloadFormat));
        childrenList.add(new Property("payloadType", "CodeableConcept", "The payload type describes the acceptable content that can be communicated on the endpoint.", 0, java.lang.Integer.MAX_VALUE, payloadType));
        childrenList.add(new Property("header", "string", "Additional headers / information to send as part of the notification.", 0, java.lang.Integer.MAX_VALUE, header));
        childrenList.add(new Property("publicKey", "string", "The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.", 0, java.lang.Integer.MAX_VALUE, publicKey));
      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<EndpointStatus>
        case -2058947787: /*managingOrganization*/ return this.managingOrganization == null ? new Base[0] : new Base[] {this.managingOrganization}; // Reference
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactPoint
        case 1270211384: /*connectionType*/ return this.connectionType == null ? new Base[0] : new Base[] {this.connectionType}; // CodeType
        case -1077554975: /*method*/ return this.method == null ? new Base[0] : this.method.toArray(new Base[this.method.size()]); // Coding
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case -1147692044: /*address*/ return this.address == null ? new Base[0] : new Base[] {this.address}; // Type
        case -2140609755: /*payloadFormat*/ return this.payloadFormat == null ? new Base[0] : new Base[] {this.payloadFormat}; // StringType
        case 909929960: /*payloadType*/ return this.payloadType == null ? new Base[0] : this.payloadType.toArray(new Base[this.payloadType.size()]); // CodeableConcept
        case -1221270899: /*header*/ return this.header == null ? new Base[0] : this.header.toArray(new Base[this.header.size()]); // StringType
        case 1446899510: /*publicKey*/ return this.publicKey == null ? new Base[0] : new Base[] {this.publicKey}; // StringType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public void setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -892481550: // status
          this.status = new EndpointStatusEnumFactory().fromType(value); // Enumeration<EndpointStatus>
          break;
        case -2058947787: // managingOrganization
          this.managingOrganization = castToReference(value); // Reference
          break;
        case 951526432: // contact
          this.getContact().add(castToContactPoint(value)); // ContactPoint
          break;
        case 1270211384: // connectionType
          this.connectionType = castToCode(value); // CodeType
          break;
        case -1077554975: // method
          this.getMethod().add(castToCoding(value)); // Coding
          break;
        case -991726143: // period
          this.period = castToPeriod(value); // Period
          break;
        case -1147692044: // address
          this.address = (Type) value; // Type
          break;
        case -2140609755: // payloadFormat
          this.payloadFormat = castToString(value); // StringType
          break;
        case 909929960: // payloadType
          this.getPayloadType().add(castToCodeableConcept(value)); // CodeableConcept
          break;
        case -1221270899: // header
          this.getHeader().add(castToString(value)); // StringType
          break;
        case 1446899510: // publicKey
          this.publicKey = castToString(value); // StringType
          break;
        default: super.setProperty(hash, name, value);
        }

      }

      @Override
      public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
          this.status = new EndpointStatusEnumFactory().fromType(value); // Enumeration<EndpointStatus>
        else if (name.equals("managingOrganization"))
          this.managingOrganization = castToReference(value); // Reference
        else if (name.equals("contact"))
          this.getContact().add(castToContactPoint(value));
        else if (name.equals("connectionType"))
          this.connectionType = castToCode(value); // CodeType
        else if (name.equals("method"))
          this.getMethod().add(castToCoding(value));
        else if (name.equals("period"))
          this.period = castToPeriod(value); // Period
        else if (name.equals("address[x]"))
          this.address = (Type) value; // Type
        else if (name.equals("payloadFormat"))
          this.payloadFormat = castToString(value); // StringType
        else if (name.equals("payloadType"))
          this.getPayloadType().add(castToCodeableConcept(value));
        else if (name.equals("header"))
          this.getHeader().add(castToString(value));
        else if (name.equals("publicKey"))
          this.publicKey = castToString(value); // StringType
        else
          super.setProperty(name, value);
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -892481550: throw new FHIRException("Cannot make property status as it is not a complex type"); // Enumeration<EndpointStatus>
        case -2058947787:  return getManagingOrganization(); // Reference
        case 951526432:  return addContact(); // ContactPoint
        case 1270211384: throw new FHIRException("Cannot make property connectionType as it is not a complex type"); // CodeType
        case -1077554975:  return addMethod(); // Coding
        case -991726143:  return getPeriod(); // Period
        case 1341051916:  return getAddress(); // Type
        case -2140609755: throw new FHIRException("Cannot make property payloadFormat as it is not a complex type"); // StringType
        case 909929960:  return addPayloadType(); // CodeableConcept
        case -1221270899: throw new FHIRException("Cannot make property header as it is not a complex type"); // StringType
        case 1446899510: throw new FHIRException("Cannot make property publicKey as it is not a complex type"); // StringType
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Endpoint.status");
        }
        else if (name.equals("managingOrganization")) {
          this.managingOrganization = new Reference();
          return this.managingOrganization;
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("connectionType")) {
          throw new FHIRException("Cannot call addChild on a primitive type Endpoint.connectionType");
        }
        else if (name.equals("method")) {
          return addMethod();
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("addressUri")) {
          this.address = new UriType();
          return this.address;
        }
        else if (name.equals("addressString")) {
          this.address = new StringType();
          return this.address;
        }
        else if (name.equals("payloadFormat")) {
          throw new FHIRException("Cannot call addChild on a primitive type Endpoint.payloadFormat");
        }
        else if (name.equals("payloadType")) {
          return addPayloadType();
        }
        else if (name.equals("header")) {
          throw new FHIRException("Cannot call addChild on a primitive type Endpoint.header");
        }
        else if (name.equals("publicKey")) {
          throw new FHIRException("Cannot call addChild on a primitive type Endpoint.publicKey");
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Endpoint";

  }

      public Endpoint copy() {
        Endpoint dst = new Endpoint();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.managingOrganization = managingOrganization == null ? null : managingOrganization.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ContactPoint>();
          for (ContactPoint i : contact)
            dst.contact.add(i.copy());
        };
        dst.connectionType = connectionType == null ? null : connectionType.copy();
        if (method != null) {
          dst.method = new ArrayList<Coding>();
          for (Coding i : method)
            dst.method.add(i.copy());
        };
        dst.period = period == null ? null : period.copy();
        dst.address = address == null ? null : address.copy();
        dst.payloadFormat = payloadFormat == null ? null : payloadFormat.copy();
        if (payloadType != null) {
          dst.payloadType = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : payloadType)
            dst.payloadType.add(i.copy());
        };
        if (header != null) {
          dst.header = new ArrayList<StringType>();
          for (StringType i : header)
            dst.header.add(i.copy());
        };
        dst.publicKey = publicKey == null ? null : publicKey.copy();
        return dst;
      }

      protected Endpoint typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof Endpoint))
          return false;
        Endpoint o = (Endpoint) other;
        return compareDeep(status, o.status, true) && compareDeep(managingOrganization, o.managingOrganization, true)
           && compareDeep(contact, o.contact, true) && compareDeep(connectionType, o.connectionType, true)
           && compareDeep(method, o.method, true) && compareDeep(period, o.period, true) && compareDeep(address, o.address, true)
           && compareDeep(payloadFormat, o.payloadFormat, true) && compareDeep(payloadType, o.payloadType, true)
           && compareDeep(header, o.header, true) && compareDeep(publicKey, o.publicKey, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof Endpoint))
          return false;
        Endpoint o = (Endpoint) other;
        return compareValues(status, o.status, true) && compareValues(connectionType, o.connectionType, true)
           && compareValues(payloadFormat, o.payloadFormat, true) && compareValues(header, o.header, true) && compareValues(publicKey, o.publicKey, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(status, managingOrganization
          , contact, connectionType, method, period, address, payloadFormat, payloadType
          , header, publicKey);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Endpoint;
   }

 /**
   * Search parameter: <b>payload-type</b>
   * <p>
   * Description: <b>The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Endpoint.payloadType</b><br>
   * </p>
   */
  @SearchParamDefinition(name="payload-type", path="Endpoint.payloadType", description="The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)", type="token", target={} )
  public static final String SP_PAYLOAD_TYPE = "payload-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>payload-type</b>
   * <p>
   * Description: <b>The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Endpoint.payloadType</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PAYLOAD_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PAYLOAD_TYPE);

 /**
   * Search parameter: <b>organization</b>
   * <p>
   * Description: <b>The organization that is exposing the endpoint</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Endpoint.managingOrganization</b><br>
   * </p>
   */
  @SearchParamDefinition(name="organization", path="Endpoint.managingOrganization", description="The organization that is exposing the endpoint", type="reference", target={Organization.class} )
  public static final String SP_ORGANIZATION = "organization";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>organization</b>
   * <p>
   * Description: <b>The organization that is exposing the endpoint</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Endpoint.managingOrganization</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ORGANIZATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ORGANIZATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Endpoint:organization</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ORGANIZATION = new ca.uhn.fhir.model.api.Include("Endpoint:organization").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the Endpoint (usually expected to be active)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Endpoint.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Endpoint.status", description="The current status of the Endpoint (usually expected to be active)", type="token", target={} )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the Endpoint (usually expected to be active)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Endpoint.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}

