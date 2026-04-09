import java.util.*;
//correction needed
public class Stack {
     static class stack{
        static ArrayList<Integer> arrlist=new ArrayList<>();
        public static boolean isEmpty()
        {
            return arrlist.size()==0;
        }

        public static void push(int data)
        {
           arrlist.add(data);
        }

        public int pop()
        {  if(isEmpty())
            {
                return -1;
            }
            int top=arrlist.get(arrlist.size()-1);
            arrlist.remove(arrlist.size()-1);
            return top;
        }
        public int peek()
        {   if(isEmpty())
            {
                return -1;
            }

            return arrlist.size()-1;
        }

    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        stack s= new stack();
        System.out.println("Enter your choice 1.push 2.pop 3.peek");
        int choice =sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("enter the data you want to insert:");
                int data=sc.nextInt();
                s.push(data);
                break;
            case 2:
                s.pop();
                break;
            case 3:
                s.peek();
                break;
                
        }
         while(!s.isEmpty())
                {
                    System.out.println(s.peek());
                    s.pop();
                }
            
    }
    
}
