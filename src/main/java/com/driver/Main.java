package com.driver;

public class Main {
    public static void main(String[] args) {

        B obj = new B();

        String str = obj.meth();
        System.out.println(str);

        String str1 = obj.meth();
        System.out.println(str1);

    }
}

class A{
    public String meth(){
        return "class A meth";
    }

    String str = meth();
}

class B extends A{

    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}