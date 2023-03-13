/*Inheritance is the process in which the classes inherit the properties of the base class
 * it increases the resuability in code 
 */

// This is the parent class
class Shape {
    public void shape(){
        System.out.println("shapes are here");
    }
}
// These are child classes which inherit the properties of parent class 
class Triangle extends Shape{
    public void area (int l, int h){
        System.out.println(1/2*h*l);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.142)*r);
    }
}
// this type of inheritance called the heirachal inheritance
public class Inheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.shape();
    }
}

