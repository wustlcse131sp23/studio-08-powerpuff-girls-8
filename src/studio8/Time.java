package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int min;
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, min);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && min == other.min;
	}

	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public String toString() {
		return hour + ":" + min;
	}
	public static void main(String[] args) {
	
    	
    }

}