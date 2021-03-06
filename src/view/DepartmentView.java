package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.Department;

public class DepartmentView {
	Scanner scan;

	public DepartmentView() {
		scan = new Scanner(System.in);
	}

	public void showMessage(String smg) {
		System.out.println("-----------");
		System.out.println(smg);
		System.out.println("-----------");
	}

	public int menu() {
		System.out.println("1. Hien thi tat ca department");
		System.out.println("2. Hien thi department theo ten");
		System.out.println("3. Them department");
		System.out.println("4. Sua department");
		int choice = 0;
		choice = scan.nextInt();
		return choice;
	}

	public Department input(int choice) {
		switch (choice) {
		case 2:
			BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
			Department d = new Department();
			System.out.println("Nhap ten can tim: ");
			String str;
			try {
				str = scan2.readLine();
				d.setDeptName(str);
				return d;
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		case 3:

			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

				Department insertE = new Department();
				System.out.println("Them moi department");

				System.out.print("DEPT_ID: ");
				insertE.setDeptId(Integer.parseInt(scan.readLine()));

				System.out.println("DEPT_Name: ");
				insertE.setDeptName(scan.readLine());

				System.out.println("DEPT_No:");
				insertE.setDeptNo(scan.readLine());

				System.out.println("Location:");
				insertE.setLocation(scan.readLine());

				return insertE;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}

		case 4:
			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

				Department insertE = new Department();
				System.out.println("Sua department");

				System.out.print("DEPT_ID: ");
				insertE.setDeptId(Integer.parseInt(scan.readLine()));

				System.out.println("DEPT_Name: ");
				insertE.setDeptName(scan.readLine());

				System.out.println("DEPT_No:");
				insertE.setDeptNo(scan.readLine());

				System.out.println("Location");
				insertE.setLocation(scan.readLine());

				return insertE;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;

			}
		default:
			break;
		}
		return null;
	}

	public void exit() {
		this.scan.close();
	}

}
