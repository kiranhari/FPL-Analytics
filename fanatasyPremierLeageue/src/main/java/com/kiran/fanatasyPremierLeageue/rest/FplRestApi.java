package com.kiran.fanatasyPremierLeageue.rest;

import java.util.List;

import javax.validation.Valid;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.kiran.fanatasyPremierLeageue.Service.PlayerListService;
import com.kiran.fanatasyPremierLeageue.models.PlayerList;
import com.kiran.fanatasyPremierLeageue.repositories.PlayerRepository;

@RestController
@RequestMapping("/PlayerList")
public class FplRestApi {
	
	@Autowired
	PlayerRepository repository;
	
	PlayerListService playerListService;
	@GetMapping("/getList")
	public List<PlayerList> getPlayerList()
	{
		List<PlayerList> alPlayerList=new ArrayList<PlayerList>();
		
		
		return alPlayerList;
	}
		 
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<PlayerList> getAllPlayerList() {
	    return repository.findAll();
	  }
	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public PlayerList getPetById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	 
	  
	 
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deletePet(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }
	

}
