class Employee {
    public double calculateSalary() {
        System.out.println("Menghitung gaji karyawan secara umum.");
        return 0.0;
    }

    public double calculateSalary(boolean withBonus) {
        double baseSalary = calculateSalary();
        if (withBonus) {
            double bonus = baseSalary * 0.1; 
            return baseSalary + bonus;
        } else {
            return baseSalary;
        }
    }

    public void tampilkanData() {
        System.out.println("Data karyawan umum.");
    }
}

class SoftwareEngineer extends Employee {
    @Override
    public double calculateSalary() {
        return 12000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 2000000;
        }
        return calculateSalary();
    }

    @Override
    public void tampilkanData() {
        System.out.println("Software Engineer");
    }
}

class DataScientist extends Employee {
    @Override
    public double calculateSalary() {
        return 15000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 2500000;
        }
        return calculateSalary();
    }

    @Override
    public void tampilkanData() {
        System.out.println("Data Scientist");
    }
}

class Intern extends Employee {
    @Override
    public double calculateSalary() {
        return 3000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 500000;
        }
        return calculateSalary();
    }

    @Override
    public void tampilkanData() {
        System.out.println("Magang (Intern)");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] karyawan = {
            new SoftwareEngineer(),
            new DataScientist(),
            new Intern()
        };

        System.out.println("   Gaji Tanpa Bonus (Polymorphism) ");
        for (Employee emp : karyawan) {
            emp.tampilkanData();
            System.out.println("Gaji: Rp " + (int) emp.calculateSalary());
            System.out.println("---------------------------");
        }

        System.out.println("\n   Gaji Dengan Bonus ");
        for (Employee emp : karyawan) {
            emp.tampilkanData();
            System.out.println("Gaji dengan Bonus: Rp " + (int) emp.calculateSalary(true));
            System.out.println("---------------------------");
        }
    }
}
