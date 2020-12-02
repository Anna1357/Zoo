package org.itstep;

public class Application {
    public static void main(String[] args) {
        System.out.println("Zoo app");
        AnimalAccounting an=new AnimalAccounting();
        an.start();
    }
}
