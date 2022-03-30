package com.zyp.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Peoper {
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
//
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Peoper{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
