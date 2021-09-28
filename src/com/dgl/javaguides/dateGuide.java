package com.dgl.javaguides;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;

import java.util.Date;

import java.time.format.DateTimeFormatter;


import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalUnit;


public class dateGuide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		dateGuide example = new dateGuide();
	    example.withMethodExample();
	    example.untilMethodExample();
		example.toStringMethodExample();
		
		 example.rangeMethodExample();

	        example.queryMethodExample();

	        example.plusYearsMethodExample();

	        example.ofMethodExample();

	        example.nowMethod();

	        example.now();

	        example.nowMethodExample();

	        example.minusYearsMethodExample();

	        example.minusMethodExample();

	        example.isLeapMethodExample();

	        example.isBeforeMethodExample();

	        example.isAfterMethodExample();

	        example.getMethodExample();

	        example.fromMethodExample();

	        example.formatMethodExample();

	        example.atDayMethodExample();
		
		
	}

	
	  /**
     *  Demonstration of Year.parse(CharSequence text)
     */
    public void withMethodExample() {
        Year date = Year.parse("2021");
        Year result = date.with(Year.of(2001));
        System.out.println(result);
    }
    
    
    /**
     *  Demonstration of Year.until(Temporal endExclusive, TemporalUnit unit)
     */
    public void untilMethodExample() {
        Year date = Year.parse("1964");
        Year date1 = Year.now();
        System.out.println(date.until(date1, ChronoUnit.YEARS));
    }

    
    /**
     *  Demonstration of Year.toString()
     */
    public void toStringMethodExample() {
        Year date = Year.parse("2021");
        Date d = new Date();
        System.out.println(date.toString());
        System.out.println("Today is "  + d);
    }

    
    /**
     *  Demonstration of Year.range(TemporalField field)
     */
    public void rangeMethodExample() {
        Year date = Year.parse("2014");
        System.out.println("Range : " + date.range(ChronoField.YEAR_OF_ERA));
    }

    /**
     *  Demonstration of Year.query(TemporalQuery<TemporalUnit> query)
     */
    public void queryMethodExample() {
        Year date = Year.parse("2014");
        System.out.printf("Year precision is %s%n", date.query(TemporalQueries.precision()));
    }

    /**
     *  Demonstration of Year.plusYears(long yearsToAdd)
     */
    public void plusYearsMethodExample() {
        Year date = Year.parse("2017");
        Year date1 = date.plusYears(10);
        System.out.println(date1);
    }

    /**
     *  Demonstration of Year.of(int isoYear)
     */
    public void ofMethodExample() {
        Year year = Year.of(2017);
        System.out.println(year);
    }

    /**
     *  Demonstration of Year.now(ZoneId zone)
     */
    public void nowMethod() {
        Year date = Year.now(ZoneId.systemDefault());
        System.out.println(date);
    }

    /**
     *  Demonstration of Year.now(Clock clock)
     */
    public void now() {
        Year date = Year.now(Clock.systemUTC());
        System.out.println(date);
    }

    /**
     *  Demonstration of Year.now()
     */
    public void nowMethodExample() {
        Year date = Year.now();
        System.out.println(date);
    }

    /**
     *  Demonstration of Year.minusYears(long yearsToSubtract)
     */
    public void minusYearsMethodExample() {
        Year date = Year.of(2017);
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.minusYears(4).get(ChronoField.YEAR));
    }

    /**
     *  Demonstration of Year.minus(long amountToSubtract, TemporalUnit unit)
     */
    public void minusMethodExample() {
        Year date = Year.of(2017);
        System.out.println(date.minus(2, ChronoUnit.YEARS));
    }

    /**
     *  Demonstration of Year.isLeap(long year)
     */
    public void isLeapMethodExample() {
        System.out.println(Year.isLeap(2016));
    }

    /**
     *  Demonstration of Year.isBefore(Year other)
     */
    public void isBeforeMethodExample() {
        Year date = Year.of(2016);
        Year date1 = Year.of(2017);
        System.out.println(date1.isBefore(date));
    }

    /**
     *  Demonstration of Year.isAfter(Year other)
     */
    public void isAfterMethodExample() {
        Year date = Year.of(2016);
        Year date1 = Year.of(2017);
        System.out.println(date1.isAfter(date));
    }

    /**
     *  Demonstration of Year.get(TemporalField field)
     */
    public void getMethodExample() {
        Year date = Year.of(2017);
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
    }

    /**
     *  Demonstration of Year.from(TemporalAccessor temporal)
     */
    public void fromMethodExample() {
        Year date = Year.from(Year.of(2017));
        System.out.println(date);
    }

    /**
     *  Demonstration of java.time.format.DateTimeFormatter.format(TemporalAccessor temporal)
     */
    public void formatMethodExample() {
        Year date = Year.of(2017);
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy");
        System.out.println(formatter.format(date));
    }

    /**
     *  Demonstration of Year.atDay(int dayOfYear)
     */
    public void atDayMethodExample() {
        Year year = Year.of(2015);
        LocalDate date = year.atDay(26);
        System.out.println(date);
    }
}
