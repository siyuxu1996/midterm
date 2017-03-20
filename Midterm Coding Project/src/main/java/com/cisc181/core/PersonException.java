package com.cisc181.core;


public class PersonException extends Exception
{
	private Person a;
	
	public PersonException()
	{
		super();
	}
	
	public PersonException(Person a)
	{
		super();
		this.a = a;
	}
	
}