package com.example.rms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name= "Result")
public class Result_entity {
	
	@Id
	@Column(name= "result_id", nullable = false, unique = true, length=10)
	private String result_id;
	
	@OneToOne
	@JoinColumn(name="student_id", referencedColumnName = "student_id")
	private Student_entity student_id;
	
	@ManyToOne
	@JoinColumn(name="admin_id")
	private Admin_entity admin_id;
	
	@Column(name= "english", nullable = false,  length=5)
	private double sub_eng;
	
	@Column(name= "mathematics", nullable = false,  length=5)
	private double sub_maths;
	
	@Column(name= "science", nullable = false,  length=5)
	private double sub_sci;
	
	@Column(name= "result_status", nullable = false)
	private boolean result_status;
	
	@Column(name= "attendance", nullable = false)
	private double attendance;
	
	
	

}
