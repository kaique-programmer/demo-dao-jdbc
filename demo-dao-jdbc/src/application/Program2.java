package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("--- TEST 1: department findById ---");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n--- TEST 2: department Insert");
        Department newDepartment = new Department(null,"Entertainment");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new id = " + newDepartment.getId());

        System.out.println("\n--- TEST 3: seller findAll ----");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n--- TEST 4: department Update ----");
        department = departmentDao.findById(9);
        department.setName("Construction");
        departmentDao.update(department);
        System.out.println("Updated success");

        System.out.println("\n--- TEST 5: department Delete ----");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted success!");

        scanner.close();
    }
}
