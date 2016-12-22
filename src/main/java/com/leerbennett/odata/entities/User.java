package com.leerbennett.odata.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.leerbennett.odata.annotations.SAPLineItem;
import com.leerbennett.odata.annotations.Sap;

@Entity
@Table(name="user")
public class User {

	@Id
	private int id;
	@SAPLineItem
    private String firstName;
	@Sap(filterable=true, sortable=true)
	@SAPLineItem
    private String lastName;
	private String sapIdpId;
	private String screenName;

    public User() {}

    public User(int id, String firstName, String lastName) {
    	this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Member[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getSapIdpId() {
		return sapIdpId;
	}

	public void setSapIdpId(String sapIdpId) {
		this.sapIdpId = sapIdpId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
}
