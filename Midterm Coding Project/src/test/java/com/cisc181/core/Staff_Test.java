package com.cisc181.core;
import com.cisc181.eNums.eTitle;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	static ArrayList<Staff> staff520 = new ArrayList<Staff>();
	public static Date aDate(int nian, int yue, int ri) {
		Calendar a = Calendar.getInstance();
		a.set(nian,yue,ri);
		return a.getTime();
	}

	@BeforeClass
	public static void setup()throws PersonException {
		staff520.add(new Staff("si","yu", "xu",aDate(1996,05,30),"somewhere","(124)-456-7589","123456@udel.edu", "M 1:10-2:10am", 1, 10000, aDate(1996,05,30), eTitle.MRS));
		staff520.add(new Staff("123","456", "789",aDate(1996,05,30),"123","(123)-456-7859","123456@udel.edu", "M 1:10-2:10am", 1, 20000,aDate(1997,05,30), eTitle.MRS));
		staff520.add(new Staff("123","456", "789",aDate(1996,05,30),"123","(123)-456-7859","123456@udel.edu", "M 1:10-2:10am", 1, 30000,aDate(1998,05,30), eTitle.MRS));
		staff520.add(new Staff("123","456", "789", aDate(1996,05,30),"123","(123)-456-7859","123456@udel.edu", "M 1:10-2:10am", 1, 40000,aDate(1999,05,30), eTitle.MRS));
		staff520.add(new Staff("123","456", "789",aDate(1996,05,30),"123","(123)-456-7899","123456@udel.edu", "M 1:10-2:10am", 1, 50000,aDate(2000,05,30), eTitle.MRS));
		
	}
	
	@Test
	public void salary() throws PersonException {
		double total = 0;
		for (Staff avgsalary : staff520) {
			total += avgsalary.getSalary();
		}
		double average = total / staff520.size();
		assertEquals(average, 30000, 0.1);
	}
		
	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		new Staff("123","456", "789",aDate(1996,05,30),"123","12455675","123456@udel.edu", "M 1:10-2:10am", 1, 10000, aDate(1996,05,30), eTitle.MRS);
	}
	
	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		new Staff("123","456", "789",aDate(1800,05,30),"123","(124)-556-7859","123456@udel.edu", "M 1:10-2:10am", 1, 10000, aDate(1996,05,30), eTitle.MRS);
	}

}
