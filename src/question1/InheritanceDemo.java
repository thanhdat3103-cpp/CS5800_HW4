package question1;

public class InheritanceDemo {
    public static void main(String[] args) {

        SalariedEmployee joe = new SalariedEmployee(
                "Joe", "Jones", "111-11-1111", 2500);

        HourlyEmployee stephanie = new HourlyEmployee(
                "Stephanie", "Smith", "222-22-2222", 25, 32);

        HourlyEmployee mary = new HourlyEmployee(
                "Mary", "Quinn", "333-33-3333", 19, 47);

        CommisionEmployee nicole = new CommisionEmployee(
                "Nicole", "Dior", "444-44-4444", 0.15, 50000);

        SalariedEmployee renwa = new SalariedEmployee(
                "Renwa", "Chanel", "555-55-5555", 1700);

        BaseEmployee mike = new BaseEmployee(
                "Mike", "Davenport", "666-66-6666", 95000);

        CommisionEmployee mahnaz = new CommisionEmployee(
                "Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);


        System.out.println("===== SALARIED EMPLOYEES =====");

        System.out.println("Name: " + joe.getFirstName() + " " + joe.getLastName());
        System.out.println("Social Security Number: " + joe.getSocialSecurityNumber());
        System.out.printf("Weekly Salary: $%.2f%n%n", joe.getWeeklySalary());

        System.out.println("Name: " + renwa.getFirstName() + " " + renwa.getLastName());
        System.out.println("Social Security Number: " + renwa.getSocialSecurityNumber());
        System.out.printf("Weekly Salary: $%.2f%n%n", renwa.getWeeklySalary());


        System.out.println("===== HOURLY EMPLOYEES =====");

        System.out.println("Name: " + stephanie.getFirstName() + " " + stephanie.getLastName());
        System.out.println("Social Security Number: " + stephanie.getSocialSecurityNumber());
        System.out.printf("Wage: $%.2f%n", stephanie.getWage());
        System.out.println("Hours Worked: " + stephanie.getHoursWorked());
        System.out.println();

        System.out.println("Name: " + mary.getFirstName() + " " + mary.getLastName());
        System.out.println("Social Security Number: " + mary.getSocialSecurityNumber());
        System.out.printf("Wage: $%.2f%n", mary.getWage());
        System.out.println("Hours Worked: " + mary.getHoursWorked());
        System.out.println();


        System.out.println("===== COMMISSION EMPLOYEES =====");

        System.out.println("Name: " + nicole.getFirstName() + " " + nicole.getLastName());
        System.out.println("Social Security Number: " + nicole.getSocialSecurityNumber());
        System.out.printf("Commission Rate: %.0f%%%n", nicole.getCommissionRate() * 100);
        System.out.printf("Gross Sales: $%.2f%n%n", nicole.getGrossSales());

        System.out.println("Name: " + mahnaz.getFirstName() + " " + mahnaz.getLastName());
        System.out.println("Social Security Number: " + mahnaz.getSocialSecurityNumber());
        System.out.printf("Commission Rate: %.0f%%%n", mahnaz.getCommissionRate() * 100);
        System.out.printf("Gross Sales: $%.2f%n%n", mahnaz.getGrossSales());


        System.out.println("===== BASE EMPLOYEE =====");

        System.out.println("Name: " + mike.getFirstName() + " " + mike.getLastName());
        System.out.println("Social Security Number: " + mike.getSocialSecurityNumber());
        System.out.printf("Base Salary: $%.2f%n", mike.getBaseSalary());
    }
}