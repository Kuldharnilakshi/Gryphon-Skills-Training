public class arr {
    public static void main(String[] args) {
        
        int marks[]=new int[5];
        marks[0]=90;
        marks[1]=80;
        marks[3]=70;
        String [] friends={"vaish","vaibh","bali","kavi"};
        for(String s :friends){
            System.out.println(s);
        }
        System.out.println("__________");

        for (int number : marks) {
            System.out.println(number);
        }
    }
}
