package course;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered ?");
		
		int employees = sc.nextInt();
		List<Employee> empregados = new ArrayList<>();
		
		for (int i = 0; i < employees; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Id: ");
			int id = sc.nextInt();
		
			System.out.println("Salary: ");
			double salary = sc.nextInt();
			
			Employee bunda = new Employee(id,name,salary);
			empregados.add(bunda);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
	
		List<Employee> empregadosComAumento = empregados.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
		
		if (empregadosComAumento == null) {
			System.out.println("This id does not exist !");
		}
		
		else {
			
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			for (Employee employee : empregadosComAumento) {
				employee.raiseSalary(percentage);
			}
			
		}
		System.out.println("List of employees: ");
		for (Employee employee : empregados) {
			System.out.println(employee);
		}
		
		
		
	}
}
