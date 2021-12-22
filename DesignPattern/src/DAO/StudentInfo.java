package DAO;


public class StudentInfo {

    private int id;
    private String name;
    private String phone;
    private String university;

    public StudentInfo() {
    }

    public StudentInfo(int id, String name, String phone, String university) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.university = university;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void showStudentInfo(){
        System.out.println("ID: "+id+"\nFull name: "+name+"\nNumber phone: "+phone+"\nUniversity name: "+university);
    }

}
