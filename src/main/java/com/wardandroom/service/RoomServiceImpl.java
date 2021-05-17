package com.wardandroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wardandroom.exception.RoomException;
import com.wardandroom.repository.RoomRepository;
import com.wardandroom.service.IRoomService;
import com.wardandroom.entities.Room;

	@Service
	public class RoomServiceImpl implements IRoomService {
		
		@Autowired
		private RoomRepository roomRepository;

		@Override
		public boolean createRoom(Room room) {
			
			roomRepository.save(room);
			
			return false;
		}

		@Override
		public boolean updateRoom(Room room) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Room findById(int id)  {
			if(!roomRepository.existsById(id)) {
				throw new RoomException("Room Not Found");
			}
			
			Room e =  roomRepository.findById(id).get();
			return e;
		}

	}
