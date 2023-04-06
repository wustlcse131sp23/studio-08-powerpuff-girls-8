package studio8;

import java.util.List;
import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	private boolean holiday;

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	public static void main(String[] args) {
		
    }

}
