package date_time_api;

import java.util.Arrays;
import java.util.List;

public class Student {
    private  int id;
    private  String name;
    private  String email;
    private  List<Integer> contactList;

    public Student(int id, String name, String email, List<Integer> contactList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactList=" + contactList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getContactList() {
        return contactList;
    }

    public void setContactList(List<Integer> contactList) {
        this.contactList = contactList;
    }
}
