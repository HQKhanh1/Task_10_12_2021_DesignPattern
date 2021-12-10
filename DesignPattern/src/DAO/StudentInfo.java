package DAO;

public class StudentInfo {
    private int id;
    private String full_name;
    private String number_phone;
    private String university_name;

    public StudentInfo() {
    }

    public StudentInfo(int id, String full_name, String number_phone, String university_name) {
        this.id = id;
        this.full_name = full_name;
        this.number_phone = number_phone;
        this.university_name = university_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public void showStudentInfo(){
        System.out.println("ID: "+id+"\nFull name: "+full_name+"\nNumber phone: "+number_phone+"\nUniversity name: "+university_name);
    }

}
