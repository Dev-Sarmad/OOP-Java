
/*Before understanding the encapsulation we should have the idea about the packages and accessmodifiers
 * to formate the code  wrt to their functionality that contains code for purpose in a single package
 * The dummy package is created in this repo;
 */

import java.util.*;
import bank.*;;

class Shape {
    public void shape() {
        System.out.println("shapes are here");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * h * l);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.142) * r);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        bank.Account ac1 = new bank.Account();
        ac1.name ="customer";
        System.out.println(ac1.name);
    }
}
