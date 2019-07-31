package com.kiran.fanatasyPremierLeageue.models;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Test {

	 private @Id Long id; // will be set when persisting
	 
	    private String firstName;
	    private String lastName;
	    private int age;
}
