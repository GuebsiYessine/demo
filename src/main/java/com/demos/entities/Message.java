package com.demos.entities;

import java.util.List;
import java.util.ArrayList; 
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Message extends Audit {
	
	@NotBlank
	private String message ;
	@ManyToMany
	private List<User> users = new ArrayList<User>();

}
