package DAO;

public class Demo {
    public static void main(String[] args) {
        StudentInfoDAO studentInfoDAO = new StudentInfoImpl();
        // show all student info
        for (StudentInfo studentInfo : studentInfoDAO.getAllStudentInfos()){
            studentInfo.showStudentInfo();
        }

        //update student
        StudentInfo studentInfo = studentInfoDAO.getAllStudentInfos().get(4);
        studentInfo.setPhone("Nguyen Ngoc");
        studentInfo.setUniversity("PTITHN");
        studentInfoDAO.saveStudentInfo(studentInfo);
        //After update
        System.out.println("After update");
        for (StudentInfo studentInfoAfter : studentInfoDAO.getAllStudentInfos()){
            studentInfoAfter.showStudentInfo();
        }
    }
}
