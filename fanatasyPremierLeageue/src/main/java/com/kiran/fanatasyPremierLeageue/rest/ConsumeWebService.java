package com.kiran.fanatasyPremierLeageue.rest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kiran.fanatasyPremierLeageue.models.PlayerList;

@RestController
public class ConsumeWebService {
   @Autowired
   RestTemplate restTemplate;

   @RequestMapping(value = "/template/products", method = RequestMethod.GET)
   public String createProducts(@RequestBody PlayerList playerList) throws JsonParseException, JsonMappingException, IOException {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<PlayerList> entity = new HttpEntity<PlayerList>(playerList,headers);
      String strOut=(restTemplate.exchange(
         "https://fantasy.premierleague.com/api/elements/", HttpMethod.GET, entity, String.class).getBody());
     // JsonObject jsonObject = new JsonParser().parse(strOut).getAsJsonObject();
      /*Gson gson = new Gson();  
      PlayerList Player = gson.fromJson(strOut, PlayerList.class);  
      System.out.println(Player.toString());*/
      ObjectMapper mapper = new ObjectMapper();
      List<PlayerList> participantJsonList = mapper.readValue(strOut, new TypeReference<List<PlayerList>>(){});
      System.out.println(participantJsonList.size());
      return restTemplate.exchange(
         "https://fantasy.premierleague.com/api/elements/", HttpMethod.GET, entity, String.class).getBody();
   }
}

