package org.sid.entites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="Clients")


public class Client {
	@Id
	private String clienId;
	@Indexed(direction=IndexDirection.ASCENDING)
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String tel;
	@DBRef
	private List<Compte> comptes;
	
	protected Client() {this.comptes = new ArrayList<>();}
	public Client( String firstName, String lastName, Date birthDate, String tel,List<Compte> comptes) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.tel = tel;
		this.comptes = comptes;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getClienId() {
		return clienId;
	}
	public void setClienId(String clienId) {
		this.clienId = clienId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
