package com.wardandroom.service;

import com.wardandroom.entities.Room;

public interface IRoomService {
	
	public boolean createRoom(Room room) ;
	
	public boolean updateRoom(Room room);
	
	public Room findById(int id);

}
