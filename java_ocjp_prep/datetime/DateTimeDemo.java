import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo {
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); 
		System.out.println(LocalTime.now()); 
		System.out.println(LocalDateTime.now());

		LocalDate date1 = LocalDate.of(2016, Month.JULY, 31);
		LocalDate date2 = LocalDate.of(2016, 7, 31);

		System.out.println("Before manipulation Date 1: " + date1); //2016-07-01
		date1 = date1.plusYears(-1);
		date1 = date1.plusMonths(-1);
		date1 = date1.plusDays(-180);
		date1 = date1.plusWeeks(8); //This will set the date to Feb 27th 2015
		date1 = date1.plusDays(3);
		//date1 = date1.plusMinutes(1); //This will not compile as date1 is a date only object (LocalDate), plusminutes works only on Time and DateTime objects

		System.out.println("Date 1: " + date1 + "\nDate 2: " + date2);

		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		System.out.println("Time: " + time3);

		LocalDateTime dateTime1 = LocalDateTime.of(2016, Month.JULY, 31, 6, 15, 30); 
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time3);

		System.out.println("Date time 1: " + dateTime1 + "\nDate time 2: " + dateTime2);

		//For Date & Time related there are no constructors, JAVA forces to use static methods
		//LocalDate d = new LocalDate(); //This will not compile as constructors are private for Date & Time classes

		//This should throw exception
		//This will give a run time error (java.time.DateTimeException), though this will compile 
		//LocalDate invalidDate1 = LocalDate.of(2015, Month.FEBRUARY, 29); 
		//LocalDate invalidDate2 = LocalDate.of(9, Month.NOVEMBER, 31);

		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1); 
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30); 
		performAnimalEnrichment(start, end);

		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date = date.plusDays(2); 
		//date.plusHours(3); 
		System.out.println("Parsed date: " + date); //date.getYear() + + date.getDayOfMonth());

		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); 
		System.out.println("Formatted LocalDateTime: " + d.format(f));

		d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle .SHORT);
		System.out.println("Period date format: " + f.format(d));
	}

	public static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month 
		}
	}
}