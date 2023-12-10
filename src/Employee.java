import java.util.Objects;

public class Employee {
    String initials;
    double salaries;
    int department;
    static int count;
    int id;

    public Employee(String initials, double salaries, int department, int id) {
        id = count + 1;
        count++;
        this.initials = initials;
        this.salaries = salaries;
        this.department = department;
        this.id = id;
    }

    public String getInitials() {
        return this.initials;
    }

    public double getSalaries() {
        return this.salaries;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalaries(double salaries) {
        this.salaries = salaries;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee employee = (Employee) other;
        return Objects.equals(initials, employee.initials) && Objects.equals(department, employee.department) && Objects.equals(salaries, employee.salaries);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(initials, department, salaries);
    }

    @Override
    public String toString() {
        return "id=" + this.id + ". ФИО: " + this.initials + ". Отдел: " + this.department + ". Зарплата: " + this.salaries + ".";
    }
}


