package DAO;

import java.util.List;

public interface StudentInfoDAO {
    List<StudentInfo> getAllStudentInfos();
    StudentInfo getStudentInfoByID(int id);
    void addStudentInfo(StudentInfo studentInfo);
    void saveStudentInfo(StudentInfo studentInfo);
    void deleteStudentInfo(StudentInfo studentInfo);
}
