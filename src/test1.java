public class test1 {

    public static void main(String[] args) {
          int a = 0,b=4,c=3;

         if(a>b && a>c) {
             if(a!=0) System.out.println("a ");
             else if(b>c) {
                 if(b!=0) System.out.println("b");
                 else {
                     if (c!=0) System.out.println("c");
                 }
             }
             else System.out.println("c");
         }
         else if (b>a && b>c) {
             if(b!=0) System.out.println("b ");
             else if(a>c) {
                 if(a!=0) System.out.println("a");
                 else {
                     if (c!=0) System.out.println("c");
                 }
             }
             else System.out.println("c");
         }
          else {
             if(c!=0) System.out.println("c ");
             else if(a>b) {
                 if(a!=0) System.out.println("a");
                 else {
                     if (b!=0) System.out.println("b");
                 }
             }
             else System.out.println("b");
         }
    }
}
