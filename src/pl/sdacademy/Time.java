package pl.sdacademy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

	public static void main(String[] args) {
		// Klas¹, której bêdziemy u¿ywali do reprezentacji dat bêdzie LocalDate
		LocalDate date;
		// Aby przypisaæ wartoœæ mo¿na u¿yæ jednego z przeci¹¿eñ medoty statyczej of
		date = LocalDate.of(2000, 2, 10);
		System.out.println(date);
		// Aby przypisaæ wartoœæ dnia dzisiejszego skorzystamy z metody statycznej no
		date = LocalDate.now();
		System.out.println(date);
		
		// Aby reprezentowaæ czas bêdziemy u¿ywali klasy LocalTime. Podobnie jak w przypadku 
		// LocalDate, mamy metodê of, której mo¿emy u¿yæ do inicjalizacji wartoœci
		LocalTime time = LocalTime.of(12, 50);
		System.out.println(time);
		// Analogicznie mamy równie¿ metodê now
		time = LocalTime.now();
		System.out.println(time);
		
		// Aby reprezentowaæ zarówno datê jak i czas, mo¿emy u¿yæ klasy LocalDateTime
		LocalDateTime localDateTime;
		// Ponownie korzystamy z wariantu metody of, do dyspozycji mamy równie¿ metodê now.
		localDateTime = LocalDateTime.of(date, time);
		System.out.println(localDateTime);
	}
}
