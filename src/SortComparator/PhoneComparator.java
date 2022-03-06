package SortComparator;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return(int) o1.getPhone().compareTo(o2.getPhone());
    }
}
