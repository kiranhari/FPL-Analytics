package com.kiran.fanatasyPremierLeageue.Service;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.kiran.fanatasyPremierLeageue.models.PlayerList;
import com.kiran.fanatasyPremierLeageue.repositories.PlayerRepository;

@Component
public class DbSeeder implements CommandLineRunner {
    private PlayerRepository PlayerRepository;
    @Autowired
    RestTemplate restTemplate;
    @Value(value = "FplElementUrl")
    String strFplElementUrl;

    public DbSeeder(PlayerRepository PlayerRepository) {
        this.PlayerRepository = PlayerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.PlayerRepository.deleteAll();
        insertRecordInMongo(); 	
    	
    }
    
    
   // @Scheduled(cron= "0 * * * * ?")
    public void insertRecordInMongo() throws JsonParseException, JsonMappingException, IOException
    {
    	
    	System.out.println("Cron");
    	HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<PlayerList> entity = new HttpEntity<PlayerList>(headers);
        String strOut=(restTemplate.exchange(
           "https://fantasy.premierleague.com/api/bootstrap-static/", HttpMethod.GET, entity, String.class).getBody());
        //System.out.println(strOut);
        JSONObject ja = new JSONObject(strOut);
        JSONArray jArray=ja.getJSONArray("elements");
        System.out.println("Array");
       // System.out.println(jArray.toString());
        ObjectMapper mapper = new ObjectMapper();
        strOut=jArray.toString();
        List<PlayerList> participantJsonList = mapper.readValue(strOut, new TypeReference<List<PlayerList>>(){});
        System.out.println(participantJsonList.size());
       this.PlayerRepository.deleteAll();
        for(PlayerList playerList:participantJsonList)
        {
        	PlayerRepository.save(playerList);
        	//System.out.println(playerList.getFirst_name());
        }
    }
}

