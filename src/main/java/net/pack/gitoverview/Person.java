package net.pack.gitoverview;

public class Person {
    private String ttName;
    private String secondName;

    public String getTtName() {
        return ttName;
    }

    public void setTtName(String ttName) {
        this.ttName = ttName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + ttName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
