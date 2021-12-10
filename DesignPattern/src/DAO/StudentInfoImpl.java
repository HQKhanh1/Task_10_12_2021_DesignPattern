package DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoImpl implements StudentInfoDAO{
    private final List<StudentInfo> studentInfoList;

    public  StudentInfoImpl(){
        studentInfoList = new ArrayList<>();
        studentInfoList.add(new StudentInfo(1,"Huynh Quoc Khanh", "0123456789","PTITHCM"));
        studentInfoList.add(new StudentInfo(2,"Ngo Thi Cuc", "0126387468","PTITHCM"));
        studentInfoList.add(new StudentInfo(3,"Vo Hoang Long", "0142356789","PTITHCM"));
        studentInfoList.add(new StudentInfo(4,"Nguyen Duy Tan", "0543567654","PTITHCM"));
        studentInfoList.add(new StudentInfo(5,"Nguyen Bao Ngoc", "0123455986","PTITHCM"));
    }
    @Override
    public List<StudentInfo> getAllStudentInfos() {
        return studentInfoList;
    }

    @Override
    public StudentInfo getStudentInfoByID(int id) {
        return studentInfoList.get(id);
    }

    @Override
    public void addStudentInfo(StudentInfo studentInfo) {
        studentInfoList.add(studentInfo);
    }

    @Override
    public void saveStudentInfo(StudentInfo studentInfo) {
        studentInfoList.set(studentInfo.getId()-1,studentInfo);
    }

    @Override
    public void deleteStudentInfo(StudentInfo studentInfo) {
        studentInfoList.remove(studentInfo);
    }

}
