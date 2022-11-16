package HW5;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.println(fullName + " " + jobTitle + " " + email + " " + phone + " " + salary + " " + age);
    }

    public int getAge() {
        return age;
    }

}
