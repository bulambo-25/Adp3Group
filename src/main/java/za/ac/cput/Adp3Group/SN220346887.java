package za.ac.cput.Adp3Group;

public class SN220346887 {
    private String name;
    private double salary;
    private double hoursPerWeek;
    private int leaveDays;

    public SN220346887(){}
    public SN220346887(String nam,double salar,double hoursPerWee,int leaveDay)
    {
        name=nam;
        salary=salar;
        hoursPerWeek=hoursPerWee;
        leaveDays=leaveDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
    public void leaveApplication()
    {
        System.out.println("Please go to our online website to apply for leave");
    }
    public void work()
    {
        System.out.println("job description : worker");
    }
    public String toString()
    {
        String str1=String.format("NAME----%s||SALARY----R%.2f||Hours per week----%.2f||LEAVE DAYS----%d",this.name,this.salary,this.hoursPerWeek,this.leaveDays);
        return str1;
    }

}

