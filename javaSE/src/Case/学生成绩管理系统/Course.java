package javaSE.src.Case.学生成绩管理系统;

//课程类
public class Course {
    private String name;
    private int ID;
    private double grade;
    private double credit;

    public Course() {
    }

    public Course(String name, int ID, double grade, double credit) {
        this.name = name;
        this.ID = ID;
        this.grade = grade;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

}
