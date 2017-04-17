package com.epam.redefinitionobject;

public class Person {
    private String name;
    private int age;
    private boolean sex;

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (sex ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null){
            return false;
        }
        if(getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (age != person.age){
            return false;
        }
        if (sex != person.sex){
            return false;
        }
        if(name != null){
            if(person.name == null){
                return false;
            }
            if(!name.equals(person.name)){
                return false;
            }
        }
        return true;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + ", age=" + age + ", sex=" + sex + '}';
    }
}
