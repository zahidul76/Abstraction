package Abstraction;

 class Teacher extends Human {
     @Override
     public void humanactive() {
         System.out.println("Teacher can teach and read books!");

     }

     public static void main(String[] args) {
         Teacher myTeacher = new Teacher();
         myTeacher.humanactive();
         myTeacher.speak();
     }
 }
