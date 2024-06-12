package com.demos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Note extends Audit {
	@Lob
	private String text;

@ManyToOne(fetch = FetchType.LAZY)	
@JoinColumn(name = "user")
private User user;
}
