package HybridInheritance;

 public class Result extends Exam implements Project {
     int sum = pm + Project.pmark;
     public void disp(){
         System.out.println("Roll = "+roll);
         System.out.println("Theory = "+theory);
         System.out.println("Practical = "+practical);
         System.out.println("Project = "+Project.pmark);
         System.out.println("Total marks = "+sum);
     }

}
