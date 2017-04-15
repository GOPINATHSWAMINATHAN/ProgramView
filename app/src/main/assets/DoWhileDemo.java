package conditional.statement;
//conditional statement 
// print reverse number using do while

public class DoWhileDemo {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Given number : "+number);
        do {            
            System.out.print(number + " ");
            number--;
        } while (number >= 1);
    }
}
