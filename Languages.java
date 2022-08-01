package com.tnsif.lambdaexpressions;
//lambda expression using foreach
import java.util.Set;

public class Languages {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set languages =Set.of("Java","Ruby","Python","C");
languages.forEach(language->System.out.println("language is: "+language));
	}

	
}
