package LearnJava;

import java.util.*;

interface interfaceContainer {
    void show();
}

class Outer {
    int a = 0;

    static class In {
        public static void show() {
            System.out.println ("It's kind of static here! :(");
        }
    }

    class Inner {
        public void show() {
            System.out.println ("It's not static in here :)");
        }
    }
}

class A {
    public A() {
        System.out.println ("I'm in A");
    }

    public A(int i) {
        System.out.println ("I'm in an integer styled A!");
    }

    public void show() {
        System.out.println ("I'm in A's show method");
    }
}

class B extends A {
    public B() {
        System.out.println ("I'm in B");
    }

    public B(int i) {
        super (5);
        System.out.println ("I'm in an integer styled B!");
    }

    public void show() {
        System.out.println ("I'm in B's show method");
    }

    public void show(int i) {
        System.out.println ("I'm in B's integer show method: " + i);
    }

    public void config() {
        System.out.println ("I'm in B's config method");
    }
}

class Student {
    private int rollNumber;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

abstract class AbstractClass {
    public abstract void show();
}

class extendAbstractClass extends AbstractClass {

    @Override
    public void show() {
        System.out.println ("I'm using abstract class's method here");
    }
}

class implementor implements interfaceContainer {
    public void show() {
        System.out.println ("Implemented interface method!");
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println ("\n***** Inner Class *****\n");
        Outer out = new Outer ();
        Outer.Inner in = out.new Inner ();
        in.show ();
        System.out.println ("\n***** Inner Static Class *****\n");
        Outer.In InObj = new Outer.In ();
        InObj.show ();
        System.out.println ("\n***** Enhanced For Loop *****\n");
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8}
        };
        for (int itr[] : arr) {
            for (int iterator : itr)
                System.out.println (iterator);
            System.out.println ();
        }
        System.out.println ("\n***** Inheritance *****\n");
        B obj = new B ();
        System.out.println ("\n***** Inheritance with super method! *****\n");
        B objInt = new B (5);
        System.out.println ("\n***** Dynamic Method Dispatching *****\n");
        A objA = new B ();
        objA.show ();
        obj.config ();
        // objA.config(); cannot be called with A's object as reference since method is not present in A
        System.out.println ("\n***** Method Overriding *****\n");
        obj.show (5);
        System.out.println ("\n***** Encapsulation *****\n");
        Student objStudent = new Student ();
        objStudent.setRollNumber (12);
        System.out.println ("Roll number is: " + objStudent.getRollNumber ());
        System.out.println ("\n***** Abstract Keyword/Class *****\n");
        extendAbstractClass objExtendAbstractClass = new extendAbstractClass ();
        objExtendAbstractClass.show ();
        System.out.println ("\n***** Interface *****\n");
        interfaceContainer interfaceContainerObj = new implementor ();
        interfaceContainerObj.show ();
        System.out.println ("\n***** List DS *****\n");
        List<Integer> list = new ArrayList<> ();
        list.add (4);
        list.add (0);
        list.add (3);
        list.add (2);
        Collections.sort (list);
        for (Integer i : list)
            System.out.println (i);
        System.out.println ("\n***** Set DS *****\n");
        Set<Integer> set = new HashSet<> ();
        set.add (4);
        set.add (0);
        set.add (3);
        set.add (3);

        for (Integer i : set)
            System.out.println (i);
        System.out.println ("\n***** HashMap DS *****\n");
        Map<String, Integer> map = new HashMap<> ();
        map.put ("A", 1);
        map.put ("B", 2);
        map.put ("C", 4);
        map.put ("C", 7);
        map.put ("E", 0);
        System.out.println ("HashMap: " + map);
        Set<String> keys = map.keySet ();
        for (String key : keys)
            System.out.println (map.get (key));


    }
}
