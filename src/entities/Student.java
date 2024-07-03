package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double sumTrimesters() {
        return this.grade1 + this.grade2 + this.grade3;
    }

    public double missingPoints() {
        return 60 - this.sumTrimesters();
    }

    public String toString() {
        return "\nFINAL GRADE = " + this.sumTrimesters();
    }
}
