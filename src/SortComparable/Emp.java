package SortComparable;

public class Emp implements Comparable<Emp>{
    private String name;
    private long phone;
    private int empId;

    @Override
    public int compareTo(Emp o) {
        return (this.empId - o.empId);
    }


    public Emp(String name, long phone, int empId){
        this.name = name;
        this.empId = empId;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", empId=" + empId +
                '}';
    }
}

