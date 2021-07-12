package com.test.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(includeFieldNames = true)
public class CopyModel {
	
	String name;
	Integer age;
	String mail;

}
