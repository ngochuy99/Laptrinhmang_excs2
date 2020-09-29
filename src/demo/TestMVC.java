package demo;


import controller.DepartmentControl;
import controller.EmployeeControl;
import model.Department;
import view.DepartmentView;
import view.EmployeeView;

public class TestMVC {
	public static void main(String[] args) {
		// Lấy ra đối tượng Connection kết nối vào DB.
//		EmployeeView v = new EmployeeView();
//		EmployeeControl control = new EmployeeControl(v);
		DepartmentView d = new DepartmentView();
		DepartmentControl control = new DepartmentControl(d);
		control.run();
		control.exit();
	}
}
