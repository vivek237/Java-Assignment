package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/

public class StudentService {
    static HashMap<Integer, StudentInfo> studentIdMap = getStudentIdMap();// map list
    public StudentService() {
    super();
    {
      if(studentIdMap == null) {
         studentIdMap = new HashMap<Integer, StudentInfo>();

// Creating some objects of Student while initializing =======================================
            
   StudentInfo GermanyStudent = new StudentInfo(1, "vivek", "vivek@gmail.com", "delhi", 
		   "CSE", "101",388900693, "845401");
   StudentInfo IndiaStudent = new StudentInfo(2, "abhishek", "abhishek@gmail.com", "mumbai", 
		   "CE", "102",796798969, "160056");
   StudentInfo nepalStudent = new StudentInfo(3, "mayank", "mayank@gmail.com", "noida", 
		   "CSE", "103",193939494, "140307");
   StudentInfo bhutanStudent = new StudentInfo(4, "rahuk", "rahul@gmail.com", "patna",
		   "CSE", "104",958548538, "67584");


// adding map list of collections in java ====================================================
   
studentIdMap.put(1, GermanyStudent);
studentIdMap.put(4, IndiaStudent);
studentIdMap.put(3, nepalStudent);
studentIdMap.put(2, bhutanStudent);        
  }
 }
}

public List<StudentInfo> getAllStudentlist() {
     List<StudentInfo> personlist = new ArrayList<StudentInfo>(studentIdMap.values());
     return personlist;
}

 
public StudentInfo getStudent(int id) {
        StudentInfo Student = studentIdMap.get(id);
        return Student;
    }

// add student ===============================================================================
    public StudentInfo addStudent(StudentInfo student) {
        student.setId(getMaxId() + 1);
        
// key , value ===============================================================================
        
    studentIdMap.put(student.getId(), student); /// logic class
    return student;
   }

//update =====================================================================================
    
    public StudentInfo updateStudent(StudentInfo student) {
      if (student.getId() <= 0)
        return null;
        studentIdMap.put(student.getId(), student);
        return student;
     }
    
//delete =====================================================================================

 public void deleteStudent(int id) {
        studentIdMap.remove(id);
    }

 
public static HashMap<Integer, StudentInfo> getStudentIdMap() {
        return studentIdMap;
    }

 

// Utility method to get max id ==============================================================

public static int getMaxId() {
     int max = 0;
        for (int id : studentIdMap.keySet()) {
            if (max <= id)
                max = id;
        }
        return max;
    }
}