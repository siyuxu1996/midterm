package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Enrollment> afall = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> aspring = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> bfall = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> bspring = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> cfall = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> cspring = new ArrayList<Enrollment>();
	
	public static Date Date(int nian, int yue, int ri) {
		Calendar a = Calendar.getInstance();
		a.set(nian,yue,ri);
		return a.getTime();
	}

	@BeforeClass
	public static void setup()throws PersonException {
		Course a = new Course(UUID.randomUUID(),"abc", 100, eMajor.BUSINESS);
		Course b = new Course(UUID.randomUUID(),"def", 100, eMajor.CHEM);
		Course c = new Course(UUID.randomUUID(),"ghi", 100, eMajor.COMPSI);
		
		courses.add(a);
		courses.add(b);
		courses.add(c);
		
		Semester fall = new Semester(UUID.randomUUID(),Date(2016,8,28), Date(2016,12,17));
		Semester spring = new Semester(UUID.randomUUID(),Date(2017,2,6), Date(2017,5,25));
		
		semesters.add(fall);
		semesters.add(spring);
		
		Section falla = new Section(a.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),123);
		Section fallb = new Section(b.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),456);
		Section fallc = new Section(c.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),456);
		Section springa = new Section(a.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),456);
		Section springb = new Section(b.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),456);
		Section springc = new Section(c.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),456);
		
		sections.add(falla);
		sections.add(fallb);
		sections.add(fallc);
		sections.add(springa);
		sections.add(springb);
		sections.add(springc);
		
		Student number1 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number2 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number3 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number4 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number5 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number6 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number7 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number8 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number9 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		Student number10 = new Student("Siyu", "Xu","ai", Date(1996,05,30), eMajor.CHEM, "1000shumway","(111)-111-1111", "siyuxu@udel.edu",UUID.randomUUID());
		
		students.add(number1);
		students.add(number2);
		students.add(number3);
		students.add(number4);
		students.add(number5);
		students.add(number6);
		students.add(number7);
		students.add(number8);
		students.add(number9);
		students.add(number10);
		
		ArrayList<Integer> grade1 = new ArrayList<Integer>();
		ArrayList<Integer> grade2= new ArrayList<Integer>();
		ArrayList<Integer> grade3 = new ArrayList<Integer>();
		
		grade1.add(99);
		grade1.add(85);
		grade1.add(80);
		grade1.add(75);
		grade1.add(70);
		grade1.add(65);
		grade1.add(60);
		grade1.add(55);
		grade1.add(50);
		grade1.add(0);
		
		grade2.add(99);
		grade2.add(85);
		grade2.add(80);
		grade2.add(75);
		grade2.add(70);
		grade2.add(65);
		grade2.add(60);
		grade2.add(55);
		grade2.add(50);
		grade2.add(0);
		
		grade3.add(99);
		grade3.add(85);
		grade3.add(80);
		grade3.add(75);
		grade3.add(70);
		grade3.add(65);
		grade3.add(60);
		grade3.add(55);
		grade3.add(50);
		grade3.add(0);
		
		for (int i = 0; i < students.size(); i++) {

			afall.add(new Enrollment(sections.get(0).getSectionID(), students.get(i).getStudentID()));
			afall.get(i).setGrade(grade1.get(i));

			aspring.add(new Enrollment(sections.get(1).getSectionID(), students.get(i).getStudentID()));
			aspring.get(i).setGrade(grade1.get(i));

			bfall.add(new Enrollment(sections.get(2).getSectionID(), students.get(i).getStudentID()));
			bfall.get(i).setGrade(grade2.get(i));

			bspring.add(new Enrollment(sections.get(3).getSectionID(), students.get(i).getStudentID()));
			bspring.get(i).setGrade(grade2.get(i));

			cfall.add(new Enrollment(sections.get(4).getSectionID(), students.get(i).getStudentID()));
			cfall.get(i).setGrade(grade3.get(i));

			cspring.add(new Enrollment(sections.get(5).getSectionID(), students.get(i).getStudentID()));
			cspring.get(i).setGrade(grade3.get(i));
		}
	}
	public double StudentGPA(ArrayList<Enrollment> afall, ArrayList<Enrollment> aspring, ArrayList<Enrollment> bfall,
			ArrayList<Enrollment> bspring, ArrayList<Enrollment> cfall, ArrayList<Enrollment> cspring, int Student) {
		

		
		double adoihs = ((afall.get(Student).getGrade() + aspring.get(Student).getGrade() + bfall.get(Student).getGrade()
				+ bspring.get(Student).getGrade() + cfall.get(Student).getGrade() + cspring.get(Student).getGrade())/6);
				
		double gpa = 0;

		if (adoihs>= 93) {
			gpa = 4.0;
		} else if (adoihs>= 85) {
			gpa = 3.50;
		} else if (adoihs >= 80) {
			gpa = 3.00;
		} else if (adoihs>= 75) {
			gpa = 2.50;
		} else if (adoihs>= 70) {
			gpa = 2.00;
		} else if (adoihs>=  65) {
			gpa = 1.50;
		} else if (adoihs>=  60) {
			gpa = 1.00;
		} else {
			gpa = 0.00;
		}
		return gpa;
	}

	
	public static void changemajor(eMajor major, Student student){
		student.setMajor(major);
	}
	
	@Test
	public void testgpa() {
		assertEquals(4.0, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 0), .001);
		assertEquals(3.5, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 1), .001);
		assertEquals(3.0, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 2), .001);
		assertEquals(2.5, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 3), .001);
		assertEquals(2.0,StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 4), .001);
		assertEquals(1.5, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 5), .001);
		assertEquals(1.0, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 6), .001);
		assertEquals(0.0, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 7), .001);
		assertEquals(0.0, StudentGPA(afall, aspring, bfall, bspring, cfall, cspring, 8), .001);
	}
	public static double coursegrade(ArrayList<Enrollment> c) {
		double avggrade = 0;
		double courseavg = 0;
		for (int i = 0; i < students.size(); i++) {
			avggrade += c.get(i).getGrade();
			courseavg = (avggrade / students.size());
		}
		return courseavg;
	}
	@Test
	public void test() {
		assertEquals(63.9, coursegrade(afall), .01);
		assertEquals(63.9, coursegrade(aspring), 01);
		assertEquals(63.9, coursegrade(bfall), .01);
		assertEquals(63.9, coursegrade(bspring), .01);
		assertEquals(63.9, coursegrade(cfall), 01);
		assertEquals(63.9, coursegrade(cspring), .01);
	}
	@Test
	public void testmajor(){
		changemajor(eMajor.BUSINESS, students.get(2));
		assertEquals(students.get(2).getMajor(), eMajor.BUSINESS);
	}
}