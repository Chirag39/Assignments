package CapgeminiJavaAssignment2;


 class Main{
    public static void main(String[] args) {
        Student Stud1=Student.createobj();
//        Student stud2=new Student();
    }
}


class Student {
    static Student obj = new Student();

    private Student(){
        System.out.println("1st Obj created");
    }

    public static Student createobj(){
        return obj;
    }

}
