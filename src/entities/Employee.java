package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += this.grossSalary/100 * percentage;
    }

    public String toString() {
        return this.name
                + ", $ "
                + String.format("%.2f", this.netSalary())
                + "\n";
    }
}
