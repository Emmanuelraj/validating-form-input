package com.example.validatingforminput.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm 
{

	@NotNull
	@Size(min=2,max=30)
	private String name;
	
	@NotNull
	@Min(18)
	private Integer age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * you can getters/settersfor name and age as well as convenient
	 */
	@Override
	public String toString() {
		return "PersonForm [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
