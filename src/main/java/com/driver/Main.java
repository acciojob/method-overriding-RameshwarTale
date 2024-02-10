package com.driver;

class A{
     public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
     public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {

        B obj = new B();

        String str = obj.meth();
        System.out.println(str);

        B obj1 = new B();
        String str1 = obj1.meth();
        System.out.println(str1);

    }
}




