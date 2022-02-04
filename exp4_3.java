public class exp4_3{   
    public static void main(String args[]){  
         /* Here we are intentionally assigning a null 
          * value to a reference so that the object becomes
          * non reachable
          */
     exp4_3 obj=new exp4_3();  
     obj=null;  
         
         /* Here we are intentionally assigning reference a 
          * to the another reference b to make the object referenced
          * by b unusable.
          */
     exp4_3 a = new exp4_3();
     exp4_3 b = new exp4_3();
     b = a;
     System.gc();  
    }  
    protected void finalize() throws Throwable
    {
         System.out.println("Garbage collection is performed by JVM");
    }
 }