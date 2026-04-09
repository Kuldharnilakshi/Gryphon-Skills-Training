import java.util.Scanner;

public class Stringifyjava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        String s2="welcome";


        //Fibonacci series
        int a=0;
        int b=1;
        for(int i=0;i<10;i++){
            int c=a+b;
            a=b;
            b=c;
            System.err.println(c);
        }


        

        // count of a in string
        int count =0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("count of a is:"+ count);



        //String operations

        if(s1.equals(s2)){
        System.out.println("s1 is equal to s2");

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        System.out.println(s1.contains("z"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.endsWith("st"));
        System.out.println(s1+" "+s2);


        //reverse using forloop
        for(int i=s2.length();i>0;i--){
            System.out.print(s2.charAt(i-1));
        }

        
        //s1 reverse
        String rev="";
        for(int i=s1.length();i>0;i--){
            rev=rev+s1.charAt(i-1);          
        }
        System.out.println(" \n" +rev);


        //palindrome check
        if(s1.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        //index of character
        char target='e';
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==target){  
                System.out.println("first e found at index "+i);
                break;
            }
        }


    }
    
    }
}