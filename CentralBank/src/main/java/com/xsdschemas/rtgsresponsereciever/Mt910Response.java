//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.14 at 10:45:43 PM CEST 
//

package com.xsdschemas.rtgsresponsereciever;

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
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://com/xsdSchemas/types}str50num"/>
 *         &lt;element name="recieverBankSwiftCode" type="{http://com/xsdSchemas/types}swift"/>
 *         &lt;element name="recieverBankTransactionAccount" type="{http://com/xsdSchemas/types}accountNumber"/>
 *         &lt;element name="requestMessageId" type="{http://com/xsdSchemas/types}str50num"/>
 *         &lt;element name="currencyDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "messageId", "recieverBankSwiftCode", "recieverBankTransactionAccount",
		"requestMessageId", "currencyDate", "amount", "currency" })
@XmlRootElement(name = "mt910Response")
public class Mt910Response {
	
	@XmlTransient
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	@Size(min = 1, max = 50)
	@XmlElement(required = true)
	protected String messageId;

	@Column(nullable = false)
	@Size(min = 1, max = 8)
	@XmlElement(required = true)
	protected String recieverBankSwiftCode;

	@Column(nullable = false)
	@Size(min = 1, max = 20)
	@XmlElement(required = true)
	protected String recieverBankTransactionAccount;

	@Column(nullable = false)
	@Size(min = 1, max = 50)
	@XmlElement(required = true)
	protected String requestMessageId;

	@Transient
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar currencyDate;
	
	@XmlTransient
	@Column(nullable = false)
	private Date currencyDateDatabase;

	@Column(nullable = false)
	@Digits(integer = 17, fraction = 2)
	@XmlElement(required = true)
	protected BigDecimal amount;

	@Column(nullable = false)
	@Size(min = 1, max = 3)
	@XmlElement(required = true)
	protected String currency;
	
	@XmlTransient
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mt910Response", orphanRemoval = true, targetEntity = RtgsRequestResponse.class)
	private Set<RtgsRequestResponse> rtgsRequestResponse;
	
	@XmlTransient
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mt910Response", orphanRemoval = true, targetEntity = RtgsRequestResponse.class)
	private Set<RtgsRequestResponse> clearingAndSettlementRequestResponse;

	/**
	 * Gets the value of the messageId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * Sets the value of the messageId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessageId(String value) {
		this.messageId = value;
	}

	/**
	 * Gets the value of the recieverBankSwiftCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecieverBankSwiftCode() {
		return recieverBankSwiftCode;
	}

	/**
	 * Sets the value of the recieverBankSwiftCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecieverBankSwiftCode(String value) {
		this.recieverBankSwiftCode = value;
	}

	/**
	 * Gets the value of the recieverBankTransactionAccount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecieverBankTransactionAccount() {
		return recieverBankTransactionAccount;
	}

	/**
	 * Sets the value of the recieverBankTransactionAccount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecieverBankTransactionAccount(String value) {
		this.recieverBankTransactionAccount = value;
	}

	/**
	 * Gets the value of the requestMessageId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestMessageId() {
		return requestMessageId;
	}

	/**
	 * Sets the value of the requestMessageId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestMessageId(String value) {
		this.requestMessageId = value;
	}

	/**
	 * Gets the value of the currencyDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCurrencyDate() {
		return currencyDate;
	}

	/**
	 * Sets the value of the currencyDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCurrencyDate(XMLGregorianCalendar value) {
		this.currencyDate = value;
	}

	/**
	 * Gets the value of the amount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAmount(BigDecimal value) {
		this.amount = value;
	}

	/**
	 * Gets the value of the currency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCurrency(String value) {
		this.currency = value;
	}

	public Date getCurrencyDateDatabase() {
		return currencyDateDatabase;
	}

	public void setCurrencyDateDatabase(Date currencyDateDatabase) {
		this.currencyDateDatabase = currencyDateDatabase;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
