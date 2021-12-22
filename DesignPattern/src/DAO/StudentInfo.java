package DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {

    private int id;
    private String name;
    private String phone;
    private String university;


    public void showStudentInfo(){
        System.out.println("ID: "+id+"\nFull name: "+name+"\nNumber phone: "+phone+"\nUniversity name: "+university);
    }

}
