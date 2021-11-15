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

@Table(name= "Admin")
public class Admin_entity {
	
	@Id
	@Column(name= "admin_id", nullable = false, unique = true, length=10)
	private String admin_id;
	
	@Column(name="admin_first_name", nullable = false)
	private String admin_fname;
	
	@Column(name="admin_last_name", nullable = false)
	private String admin_lname;
	
	@Column(name="admin_name", nullable = false, length=20)
	private long admin_mob;
	
	@Column(name="admin_email", nullable = false, unique=true)
	private String admin_email;
	
	@Column(name="admin_password", nullable = false)
	private String admin_pwd;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_on", nullable = false)
	private Date admin_created_at;
	
	@Column(name="created_by", nullable = false)
	private String admin_created_by;
	
	@Temporal(TemporalType.DATE)
	@Column(name="updated_on", nullable = false)
	private Date last_updated_on;
	
	@Column(name="lastUpdated_by", nullable = false)
	private String last_updated_by;
	
	@Temporal(TemporalType.DATE)
	@Column(name="deleted_on", nullable = false)
	private Date admin_deleted_on;
	
	@Column(name="deletd_by", nullable = false)
	private String admin_deleted_by;
	
	
	
	
	
	
	

}
