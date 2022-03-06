package SortComparator;

public class Emp {
        private String name;
        private String phone;
        private int empId;

        public Emp(String name, String phone, int empId)
        {
            this.name = name;
            this.empId = empId;
            this.phone = phone;
        }


        public String getName() {
            return name;
        }

        public String getPhone() {
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
