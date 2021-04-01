/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongtuan
 */
public class Person {

    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String name() {
        return this.name;
    }

    public String address() {
        return this.address;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }
}
