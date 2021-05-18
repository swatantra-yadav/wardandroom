package com.wardandroom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ward {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ward_id;
	private String ward_name;
	private int ward_floor;
	private boolean oxygen_availability;
	private boolean vacancy_status;
	@OneMany
	private List<Room> TotalRooms;

}
