package datastorage;

import java.util.HashMap;
import java.util.Scanner;

public class RunFromHere {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		student s = new student();
		System.out.println("Please Enter Student`s Name");
		s.setName(in.nextLine());
		System.out.println("Please Enter Student`s Roll Number");
		s.setRoll_no(in.nextInt());
		System.out.println("\n For How many years you want to enter the data");
		int total_years = in.nextInt();
		HashMap<Integer, Marks> map = new HashMap<Integer, Marks>(); 
		for(int i=0;i<total_years;i++)
		{
			System.out.println("\nPlease enter year");
			int year = in.nextInt();
			Marks m = new Marks();
			System.out.println("\nEnter the marks with you have received in Maths");
			m.setMaths(in.nextInt());
			System.out.println("\nEnter the marks with you have received in Science");
			m.setScience(in.nextInt());
			System.out.println("\nEnter the marks with you have received in Physics");
			m.setPhysics(in.nextInt());
			map.put(year, m);
		}
		HashMap<student, HashMap> Newmap = new HashMap<student, HashMap>();
		Newmap.put(s, map);
		System.out.println("Here are your Details \n" + Newmap);   
	}
}
