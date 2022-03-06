package SortComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Output {
    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Durgesh",7106790,12));
        emps.add(new Emp("Bhawesh",4106790,36));
        emps.add(new Emp("Rakesh",2106790,6));
        System.out.println(emps);

        Collections.sort(emps);
        System.out.println(emps);

    }
}
