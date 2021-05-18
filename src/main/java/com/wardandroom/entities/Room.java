package com.wardandroom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int room_no;
	private String room_type;
	private boolean oxygen_availability;
	private boolean room_status;
	
	@ManyToOne
	private Ward ward;


}
