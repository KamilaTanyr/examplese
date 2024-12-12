package se2423first;

public class Student {
    
   public Student(){
       
   } 
   public Student(int b, int g){
       barcode=b;
       gpa=g;
       
   } 


   public static int stVar=6;
   private int barcode;
   private int gpa;
   int age;
   int temp;
   
   public int getBarcode(){
       return this.barcode;
   }
   public void setBarcode(int bcode){
       this.barcode=bcode;
   }
   
   
   
   
   public int sum(int a, int b){
       return a+b;
   }
   
   //public protected private default - 4 access modificators
   //static
}
