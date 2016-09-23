package datamanagement;
        public class ListStudentsCTL
        {
private StudentManager Sm_;
public ListStudentsCTL() {Sm_ = StudentManager.get();}
            public void listStudents( IStudentLister lister, String unitCode ) {
    lister.clearStudents();
                StudentMap students = Sm_.getStudentsByUnit( unitCode );
for (Integer id : students.keySet() ) lister.addStudent(students.get(id));
}
            }
