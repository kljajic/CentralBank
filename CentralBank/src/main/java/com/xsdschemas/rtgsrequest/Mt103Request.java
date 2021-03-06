//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.14 at 10:45:43 PM CEST 
//


package com.xsdschemas.rtgsrequest;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.model.RtgsRequestResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://com/xsdSchemas/types}str50num"/>
 *         &lt;element name="originatorBankSwiftCode" type="{http://com/xsdSchemas/types}swift"/>
 *         &lt;element name="originatorBankTransactionAccount" type="{http://com/xsdSchemas/types}accountNumber"/>
 *         &lt;element name="recieverBankSwiftCode" type="{http://com/xsdSchemas/types}swift"/>
 *         &lt;element name="recieverBankTransactionAccount" type="{http://com/xsdSchemas/types}accountNumber"/>
 *         &lt;element name="originator" type="{http://com/xsdSchemas/types}str255"/>
 *         &lt;element name="paymentPurpose" type="{http://com/xsdSchemas/types}str255"/>
 *         &lt;element name="reciever" type="{http://com/xsdSchemas/types}str255"/>
 *         &lt;element name="statementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="currencyDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="originatorAccountNumber" type="{http://com/xsdSchemas/types}accountNumber"/>
 *         &lt;element name="chargeModel" type="{http://com/xsdSchemas/types}ordinate2"/>
 *         &lt;element name="chargeDialNumber" type="{http://com/xsdSchemas/types}str20num"/>
 *         &lt;element name="recieverAccountNumber" type="{http://com/xsdSchemas/types}accountNumber"/>
 *         &lt;element name="clearanceModel" type="{http://com/xsdSchemas/types}ordinate2"/>
 *         &lt;element name="clearanceDialNumber" type="{http://com/xsdSchemas/types}str20num"/>
 *         &lt;element name="amount" type="{http://com/xsdSchemas/types}dec15_2"/>
 *         &lt;element name="currency" type="{http://com/xsdSchemas/types}str3currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageId",
    "originatorBankSwiftCode",
    "originatorBankTransactionAccount",
    "recieverBankSwiftCode",
    "recieverBankTransactionAccount",
    "originator",
    "paymentPurpose",
    "reciever",
    "statementDate",
    "currencyDate",
    "originatorAccountNumber",
    "chargeModel",
    "chargeDialNumber",
    "recieverAccountNumber",
    "clearanceModel",
    "clearanceDialNumber",
    "amount",
    "currency"
})
@XmlRootElement(name = "mt103Request")
@Entity
public class Mt103Request {
	
	@XmlTransient
	@Id
	@GeneratedValue
	private Long id;

    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 50)
    protected String messageId;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 8)
    protected String originatorBankSwiftCode;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 18)
    protected String originatorBankTransactionAccount;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 8)
    protected String recieverBankSwiftCode;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 18)
    protected String recieverBankTransactionAccount;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 255)
    protected String originator;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 255)
    protected String paymentPurpose;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 255)
    protected String reciever;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Transient
    protected XMLGregorianCalendar statementDate;
    
    @XmlTransient
    @Column(nullable = false)
    private Date dateStatementDate;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    @Transient
    protected XMLGregorianCalendar currencyDate;
    
    @XmlTransient
    @Column(nullable = false)
    private Date dateCurrencyDate;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 18)
    protected String originatorAccountNumber;
    
    @XmlElement(required =true)
    @Column(nullable = true)
    protected short chargeModel;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    protected String chargeDialNumber;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 18)
    protected String recieverAccountNumber;
    
    @XmlElement(required =true)
    @Column(nullable = true)
    protected short clearanceModel;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(max = 20)
    protected String clearanceDialNumber;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Digits(integer = 17, fraction = 2)
    protected BigDecimal amount;
    
    @XmlElement(required = true)
    @Column(nullable = false)
    @Size(min = 3, max = 3)
    protected String currency;
    
    @XmlTransient
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mt103Request", orphanRemoval = true, targetEntity = RtgsRequestResponse.class)
    private Set<RtgsRequestResponse> rtgsRequestResponses;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the originatorBankSwiftCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorBankSwiftCode() {
        return originatorBankSwiftCode;
    }

    /**
     * Sets the value of the originatorBankSwiftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorBankSwiftCode(String value) {
        this.originatorBankSwiftCode = value;
    }

    /**
     * Gets the value of the originatorBankTransactionAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorBankTransactionAccount() {
        return originatorBankTransactionAccount;
    }

    /**
     * Sets the value of the originatorBankTransactionAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorBankTransactionAccount(String value) {
        this.originatorBankTransactionAccount = value;
    }

    /**
     * Gets the value of the recieverBankSwiftCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverBankSwiftCode() {
        return recieverBankSwiftCode;
    }

    /**
     * Sets the value of the recieverBankSwiftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverBankSwiftCode(String value) {
        this.recieverBankSwiftCode = value;
    }

    /**
     * Gets the value of the recieverBankTransactionAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverBankTransactionAccount() {
        return recieverBankTransactionAccount;
    }

    /**
     * Sets the value of the recieverBankTransactionAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverBankTransactionAccount(String value) {
        this.recieverBankTransactionAccount = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the paymentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    /**
     * Sets the value of the paymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPurpose(String value) {
        this.paymentPurpose = value;
    }

    /**
     * Gets the value of the reciever property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReciever() {
        return reciever;
    }

    /**
     * Sets the value of the reciever property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReciever(String value) {
        this.reciever = value;
    }

    /**
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatementDate(XMLGregorianCalendar value) {
        this.statementDate = value;
    }

    /**
     * Gets the value of the currencyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrencyDate() {
        return currencyDate;
    }

    /**
     * Sets the value of the currencyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrencyDate(XMLGregorianCalendar value) {
        this.currencyDate = value;
    }

    /**
     * Gets the value of the originatorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorAccountNumber() {
        return originatorAccountNumber;
    }

    /**
     * Sets the value of the originatorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorAccountNumber(String value) {
        this.originatorAccountNumber = value;
    }

    /**
     * Gets the value of the chargeModel property.
     * 
     */
    public short getChargeModel() {
        return chargeModel;
    }

    /**
     * Sets the value of the chargeModel property.
     * 
     */
    public void setChargeModel(short value) {
        this.chargeModel = value;
    }

    /**
     * Gets the value of the chargeDialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDialNumber() {
        return chargeDialNumber;
    }

    /**
     * Sets the value of the chargeDialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDialNumber(String value) {
        this.chargeDialNumber = value;
    }

    /**
     * Gets the value of the recieverAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverAccountNumber() {
        return recieverAccountNumber;
    }

    /**
     * Sets the value of the recieverAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverAccountNumber(String value) {
        this.recieverAccountNumber = value;
    }

    /**
     * Gets the value of the clearanceModel property.
     * 
     */
    public short getClearanceModel() {
        return clearanceModel;
    }

    /**
     * Sets the value of the clearanceModel property.
     * 
     */
    public void setClearanceModel(short value) {
        this.clearanceModel = value;
    }

    /**
     * Gets the value of the clearanceDialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceDialNumber() {
        return clearanceDialNumber;
    }

    /**
     * Sets the value of the clearanceDialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceDialNumber(String value) {
        this.clearanceDialNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

	public Long getId() {
		return id;
	}

	public Date getDateStatementDate() {
		return dateStatementDate;
	}

	public Date getDateCurrencyDate() {
		return dateCurrencyDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDateStatementDate(Date dateStatementDate) {
		this.dateStatementDate = dateStatementDate;
	}

	public void setDateCurrencyDate(Date dateCurrencyDate) {
		this.dateCurrencyDate = dateCurrencyDate;
	}
	
}
