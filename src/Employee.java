import java.util.ArrayList;

public class Employee {
    private String name;
    private int salary;
    private int hours;
    private int id;
    public Employee(String name,int salary,int hours,int id){
        this.salary=salary;
        this.name=name;
        this.hours=hours;
        this.id=id;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getInfo(int salary, int hours){
        int total_Salary =salary*hours;
        return total_Salary;

    }
    public  int addSal(ArrayList<Employee> list){
        if(getSalary()<500){
            setSalary(getSalary()+5);
        }
        return getSalary();


    }
    public String toString () {
        return "ID:" + getId ()  + "\tName:" + getName () + "\tSalary:" + getSalary () +
                "\tHours:" + getHours () + "\t bonus " + getSalary();
    }

    public static void main(String[] args){
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee("amna",500,8,1));
        list.add(new Employee("fiza",600,7,1));
        list.add(new Employee("sohaib",800,9,1));
         Employee obj =null;
         obj.addSal(list);
         System.out.println(" adding salary"+ obj.addSal(list));



    }
}
