package com.kiran.fanatasyPremierLeageue.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.kiran.fanatasyPremierLeageue.models.PlayerList;

public interface PlayerRepository extends MongoRepository<PlayerList, String> {
	
	PlayerList findBy_id(String id);
	
	PlayerList findBy_id(ObjectId id);
	
	 List<PlayerList> findAll();
}
