public class exceptionshand {
    public static void main(String[] args) {

        //Arithmetic Exception
        int a=45;
        int b=0;
        try {
        int c=a/b;
        System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:");
            System.out.println(e);
        }
        

        //NullPointerException
        String university=null;
        try{
            System.out.println(university.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

        
        //"Array Index Out of bound Exception
        int arr[]={1,2,3,4,5};
        try {
            System.err.println(arr[6]);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
