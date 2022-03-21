package main;

import domain.Person;

public class Main {
	public static void main(String[]args) {
		Person person = new Person("Milan", "Ivic",31);
		
		System.out.println("Ovo je osoba: ");
		System.out.println("Name: "+person.getName()+" \nSurname: "+person.getSurname()+" \nAge: "+person.getAge());
	}
}
