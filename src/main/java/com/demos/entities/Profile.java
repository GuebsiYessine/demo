package com.demos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Profile extends Audit {
	@Column(nullable = false)
	private String photo , password, description;
	@Email
	@Column(unique = true, nullable = false)
	private String email;
	@Column(columnDefinition = "varchar(30) default 'user' ")
	private String grade;
	
@OneToOne
@MapsId
@JoinColumn(name = "user_id")
User user;

}
