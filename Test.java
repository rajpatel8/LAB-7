import java.util.Arrays;

public class Test {
    public static void main(String[] args) {        
        QueueInt qi = new QueueInt ();  	 	
        qi.enqueue(100);  	 	
        System.out.println("\n");
        qi.enqueue(200);  	 	
        System.out.println(qi.getFront());
    }
}
