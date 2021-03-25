package com.example.curd.model;

//import java.util.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

//import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
//	@Column(updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//    @Temporal(TemporalType.TIMESTAMP) 
//    @CreatedDate 
//	private Date created_at = new Date();
//	
	// ---------------------------------
	public String getName() {
		return this.name;
	}
	
//	@overrivde
//	public String setName(name) {
//		this.name = name;
//	}
	
//	public void createddAt() {  
//	    this.created_at= new Date(); 
//	}
}
