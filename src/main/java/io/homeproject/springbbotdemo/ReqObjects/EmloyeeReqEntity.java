package io.homeproject.springbbotdemo.ReqObjects;

public class EmloyeeReqEntity
{
    private String name;
    private Integer age;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmloyeeReqEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation=" + designation +
                '}';
    }
}
