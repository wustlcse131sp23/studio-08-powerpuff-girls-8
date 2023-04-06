package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private static int hour;
	private static int min;
	private static int day;
	private static int month;
	private static int year;
	
	@Override
	public int hashCode() {
		return Objects.hash(day, hour, min, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return day == other.day && hour == other.hour && min == other.min && month == other.month && year == other.year;
	}
	public Appointment(int day, int month, int year, int hour, int min) {
		Appointment.day = day;
		Appointment.month = month;
		Appointment.year = year;
		Appointment.hour = hour;
		this.min = min;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year + " at " + hour + ":" + min;
	}

	public static void main(String[] args) {
		
		
		LinkedList<Appointment> list = new LinkedList<Appointment>();
		Appointment a1 = new Appointment(month, day, year, hour, min);
		Appointment a2 = new Appointment(month, day, year, hour, min);
		list.add(a1);
		list.add(a2);
		list.add(a1);
		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(a1);
		set.add(a2);
		set.add(a1);
		System.out.println(set);
		System.out.println(list);
		System.out.println(list);
	}

}
