package com.app.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import com.Employee.core.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer, Employee> employee = new HashMap<>();

		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines().forEach(l -> {
				String[] argus = l.split(" ");
				Employee emp = new Employee(Integer.parseInt(argus[0]), argus[1], argus[2], argus[3],
						Double.parseDouble(argus[4]), LocalDate.parse(argus[5]));
				employee.put(emp.getEmpId(), emp);
			});

			employee.values().forEach(s -> System.out.print(s));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
