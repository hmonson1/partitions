import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //initializing data members
        Numbers NUM=new Numbers();
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        //setting and printing the first test
        NUM.setNumbers(numbers,15,1,6,12,-3,4,8,21,2,30,-1,9);
        System.out.println("The order of 'numbers' before: " + numbers);

        //calling partition and re-printing the test
        NUM.partition(numbers,5);
        System.out.println("The order of 'numbers' after: " + numbers);

        //setting and printing the second test
        NUM.setNumbers(numbers,5,1,6,12,-3,4,8,21,2,1,1,9);
        System.out.println("The order of 'numbers' before: " + numbers);

        //calling partition and re-printing the test
        NUM.partition(numbers,5);
        System.out.println("The order of 'numbers' after: " + numbers);
    }
}