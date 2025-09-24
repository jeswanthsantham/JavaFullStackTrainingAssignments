package com.inher.quest1;

public class CompanyMain {

	public static void main(String[] args) {
		
			Project project =  new TeamOne(); 
			// call the method of TeamOne 
			// Also call the own method of TeamOne 
			// Follow the same process for TeamTwo
			
			project.doTask();
			TeamOne p=(TeamOne)project;
			p.softwaresUsed("eclipse", "Jenkins", "maven");
			
			Project project1 =  new TeamTwo(); 
			
			TeamTwo t =(TeamTwo)project1;
			t.doTask();
			String []techStack;
			techStack=t.getTechStack();
			for (String string : techStack) {
				System.out.println(string);
			}
			} 
	}


