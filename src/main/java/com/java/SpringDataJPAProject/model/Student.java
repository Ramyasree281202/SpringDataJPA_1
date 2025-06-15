package com.java.SpringDataJPAProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
	@Id
	private Integer SID;
	
	private String SCITY;
	
	private String SNAME;

	public Student() {
	
		System.out.println("Hiberate creates Student Entity");
	}

	@Override
	public String toString() {
		return "Student [SID=" + SID + ", SCITY=" + SCITY + ", SNAME=" + SNAME + "]";
	}

	public Integer getSID() {
		return SID;
	}

	public void setSID(Integer sID) {
		SID = sID;
	}

	public String getSCITY() {
		return SCITY;
	}

	public void setSCITY(String sCITY) {
		SCITY = sCITY;
	}

	public String getSNAME() {
		return SNAME;
	}

	public void setSNAME(String sNAME) {
		SNAME = sNAME;
	}

	public Student(Integer sID, String sCITY, String sNAME) {
		super();
		SID = sID;
		SCITY = sCITY;
		SNAME = sNAME;
	}
}
