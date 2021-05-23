
public class Book implements Comparable<Book> {

    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }

        return this.age - o.age;
    }

}

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author truongtuan
// */
//public class Book implements Comparable<Book> {
//
//    private final String title;
//    private final int ageRcm;
//
//    public Book(String title, int age) {
//        this.title = title;
//        this.ageRcm = age;
//    }
//
//    public String getTitle() {
//        return this.title;
//    }
//
//    public int getAgeRcm() {
//        return this.ageRcm;
//    }
//
//    @Override
//    public String toString() {
//        return this.title + " (recommended for " + this.ageRcm + " year-olds or older)";
//    }
//
//    @Override
//    public int compareTo(Book anotherBook) {
//        return this.ageRcm - anotherBook.getAgeRcm();
//    }
//
//}
