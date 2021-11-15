package com.example.rms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name= "Student")
		
public class Student_entity {
	
		@Id
		@Column(name= "student_id", nullable = false, unique = true, length=10)
		private String student_id;
		
		@Column(name="student_name", nullable = false)
		private String student_name;
		
		@Column(name="student_contact_no", nullable = false, length=20)
		private long student_mob;
		
		@Column(name="student_email", nullable = false, unique=true)
		private String student_email;
		
		@Column(name="student_password", nullable = false)
		private String student_pwd;
		
		@Column(name="student_gender", nullable = false)
		private String student_gender;
		
		@Column(name="student_DOB", nullable = false)
		private Date student_dob;
		
		@Column(name="student_status", nullable = false)
		private boolean student_deteled;
		
		@Column(name="roll_no", nullable = false)
		private long student_roll;
		
		@Temporal(TemporalType.DATE)
		@Column(name="created_on", nullable = false)
		private Date student_created_at;
		
		@Column(name="created_by", nullable = false)
		private String student_created_by;
		
		@Temporal(TemporalType.DATE)
		@Column(name="updated_on", nullable = false)
		private Date last_updated_on;
		
		@Column(name="lastUpdated_by", nullable = false)
		private String last_updated_by;
		
		@Temporal(TemporalType.DATE)
		@Column(name="deleted_on", nullable = false)
		private Date student_deleted_on;
		
		@Column(name="deletd_by", nullable = false)
		private String student_deleted_by;
		
		

}



