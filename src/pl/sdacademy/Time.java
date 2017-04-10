package pl.sdacademy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

	public static void main(String[] args) {
		// Klas�, kt�rej b�dziemy u�ywali do reprezentacji dat b�dzie LocalDate
		LocalDate date;
		// Aby przypisa� warto�� mo�na u�y� jednego z przeci��e� medoty statyczej of
		date = LocalDate.of(2000, 2, 10);
		System.out.println(date);
		// Aby przypisa� warto�� dnia dzisiejszego skorzystamy z metody statycznej no
		date = LocalDate.now();
		System.out.println(date);
		
		// Aby reprezentowa� czas b�dziemy u�ywali klasy LocalTime. Podobnie jak w przypadku 
		// LocalDate, mamy metod� of, kt�rej mo�emy u�y� do inicjalizacji warto�ci
		LocalTime time = LocalTime.of(12, 50);
		System.out.println(time);
		// Analogicznie mamy r�wnie� metod� now
		time = LocalTime.now();
		System.out.println(time);
		
		// Aby reprezentowa� zar�wno dat� jak i czas, mo�emy u�y� klasy LocalDateTime
		LocalDateTime localDateTime;
		// Ponownie korzystamy z wariantu metody of, do dyspozycji mamy r�wnie� metod� now.
		localDateTime = LocalDateTime.of(date, time);
		System.out.println(localDateTime);
	}
}
