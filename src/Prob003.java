import algos.Prime;

import java.util.Collections;
import java.util.LinkedList;

public class Prob003 {
    public static void main(String[] args) {
        LinkedList<Long> pf = Prime.prime_facts_of_ll(600851475143L);
        System.out.println(Collections.max(pf));
    }
}
