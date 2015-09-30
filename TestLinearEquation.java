import java.util.Scanner;

public class TestLinearEquation{

   public static void main(String[] args) {
       // Create a scanner.
       Scanner input = new Scanner(System.in);
       /** ax + by = e 
           cx + dy = f 
       	   Prompt the user to enter six values.
       */
       System.out.println("ax + by = e");
       System.out.println("cx + dy = f");
       System.out.println("Enter the value of a,b,c,d,e, and f to compute the linear equation X and Y.");
       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();
       double d = input.nextDouble();
       double e = input.nextDouble();
       double f = input.nextDouble();  
       LinearEquations LE = new LinearEquations(a, b, c, d, e, f);
       // Judge a*d - b*c is 0 or not,and replay the result . 
       boolean isSolvable = LE.isSolvable();
       if (isSolvable == false){
       System.out.println("The equation has no solution.");
       }
       else {
       System.out.println("X is " + LE.getX() + " Y is " + LE.getY() + ".");
       }
  }
}

class LinearEquations{

   private double a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;

   LinearEquations(double newa, double newb, double newc, double newd, double newe, double newf ){
      a = newa;
      b = newb;
      c = newc;
      d = newd;
      e = newe;
      f = newf;
   }
   
   double geta(){
   return a; 
   }  
   double getb(){
   return b;
   }
   double getc(){
   return c; 
   }
   double getd(){
   return d;
   }
   double gete(){
   return e; 
   }
   double getf(){
   return f; 
   }
   // Judge a*d - b*c is 0 or not. 
   boolean isSolvable(){
      if (geta() * getd() - getb() * getc() == 0){ 
         return false;   
      }
      else{
         return true;
      }
   }
   // Compute X and Y of this linear formula.
   double getX(){
      return (gete() * getd() - getb() * getf()) / (geta() * getd() - getb() * getc());
   }
   double getY(){
      return (geta() * getf() - gete() * getc()) / (geta() * getd() - getb() * getc());
   }
}
