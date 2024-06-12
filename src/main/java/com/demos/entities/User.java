package com.demos.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class User extends Audit {
	
	@Column(nullable = false)
	private String nom , prenom, adresse, tel;
@ManyToMany(mappedBy = "users")
private List<Message> messages = new  ArrayList<Message>();
}
