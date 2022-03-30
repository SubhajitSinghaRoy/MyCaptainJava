import java.util.Scanner;
class Employee
{
    int id;
    String name;
    String address; 
    float yoj;
}
class EmployeeDetails{
            public static void main(String[] args) 
   {
            Scanner sc = new Scanner(System.in);
            System.out.print("How many employees? ");
            int n = sc.nextInt();
            Employee emp[] = new Employee[n];
            for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("");
            System.out.println("");
            System.out.println("________INPUT DETAILS________________");
            System.out.println("Enter " + (i + 1) + " Employee data :");
            System.out.print("Enter employee id :");
            emp[i].id = sc.nextInt();
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee Address :");
            emp[i].address = sc.next();
            System.out.print("Enter employee year of joining :");
            emp[i].yoj = sc.nextFloat();
            System.out.println("_________________________________________");
}
 System.out.println("\n\n******************** All Employee Details are :*********************\n");
 for (int i = 0; i < n; i++) {
        System.out.println("Employee id, Name, Address and year of joining :" + emp[0].id + " " + emp[i].name + " " + emp[i].address + " " +emp[i].yoj);
  }
 }
}