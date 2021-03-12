package package1;
//import java.util.Date;

public class MainClass {
	
 public static void main(String[] args) {
		
//		Student student = new Student();
//        student.setName("Yogi");
//        student.setId(1);
//        student.setDept("IT");
//        student.setDob(new Date());
//        
//        Groups groups = new Groups();
//        groups.setName("XYZ");
//        groups.setId(001);
//        groups.setDept("IT-1");
//        
//        System.out.println("Student name:"+ student.getName());
//        System.out.println("Student ID:"  + student.getId());
//        System.out.println("Student Dept:"  + student.getDept());
//        System.out.println("Student DOB:"  + student.getDob());
//        
//        System.out.println("Group name:"  +group.getName());
//        System.out.println("Student DOB:"  +group.getDept());
        
        
        //method overriding
        Shape shape= new Shape();
        shape.side();
        shape.display();
        

        
        Square square = new Square();
        square.side();
        square.display();
        square.display1();
        
        
        Shape s1 = new Square();
        s1.side();
        s1.display();
      //  s1.display1(); //not having display1 in parent class
        
        
//        Square sq1 = new Shape();
//        sq1.side();    //not working..can't convert from shape to square
        
        StudentInterfaceImplement StudentInterfaceImplement = new  StudentInterfaceImplement();
        StudentInterfaceImplement.performance();
        StudentInterfaceImplement.score();
        

}}
