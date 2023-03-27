package com;

public interface Calculator {
	int add(int x , int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
	String displayErrorMessage();
	

}
//all the above methods are automatically public & abstract.
//declaration and implementation
//itnerface- variables-- public, static .final
//interface- methods == public abstract
//abstract methods== no private, no static, no final
//overriding abstract methods== same name or higher visiblitiy.
//abstract method == only declaration
//concreate method== both declararion and implementation