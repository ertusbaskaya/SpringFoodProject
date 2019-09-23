package com.works.model;
// Generated 21 Eyl 2019 16:01:34 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name = "contact", catalog = "foodtown")
public class Contact implements java.io.Serializable {

	private Integer contactid;
	private String contactname;
	private String contactmail;
	private String contactsubject;
	private String contactphone;
	private String contactmessage;

	public Contact() {
	}

	public Contact(String contactname, String contactmail, String contactsubject, String contactphone,
			String contactmessage) {
		this.contactname = contactname;
		this.contactmail = contactmail;
		this.contactsubject = contactsubject;
		this.contactphone = contactphone;
		this.contactmessage = contactmessage;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "contactid", unique = true, nullable = false)
	public Integer getContactid() {
		return this.contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	@Column(name = "contactname")
	public String getContactname() {
		return this.contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	@Column(name = "contactmail")
	public String getContactmail() {
		return this.contactmail;
	}

	public void setContactmail(String contactmail) {
		this.contactmail = contactmail;
	}

	@Column(name = "contactsubject")
	public String getContactsubject() {
		return this.contactsubject;
	}

	public void setContactsubject(String contactsubject) {
		this.contactsubject = contactsubject;
	}

	@Column(name = "contactphone")
	public String getContactphone() {
		return this.contactphone;
	}

	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}

	@Column(name = "contactmessage")
	public String getContactmessage() {
		return this.contactmessage;
	}

	public void setContactmessage(String contactmessage) {
		this.contactmessage = contactmessage;
	}

}
