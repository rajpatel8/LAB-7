public class QueueInt {
    int[] arr ;
    int rear;
    int front = rear = -1 ;
    int count = 0 ;

    public QueueInt(){
        arr = new int[10];
        front = rear = -1 ;
    }

    public QueueInt(int size){
        arr = new int[size];
        front = rear = -1 ;
    }

    public void print() {
        if ((front==rear&&front==-1)||front>=arr.length) {
            System.out.println("\nQueue is empty \n");
        }
        else{
            for (int i = front; i <=rear; i++) {
                System.out.print(arr[i]+"->");
            }
        }
    }

    public void enqueue(int data) {

        if (rear==arr.length-1)
        {
            System.out.println("\n Can't enqueue \n");
        }
        else if (count == 0) {
            front++ ;
            rear++;
            arr[rear] = data ;
            count++ ;
        }
        else
        {
            rear++;
            arr[rear] = data ;
        }
        
    }

    public int getFront() {
        return arr[front];
    }

    public void dequeue() {
        if ((front==rear&&front==-1)||front>=arr.length) {
            System.out.println("\ncan't pop \n");
        }
        else {
        int t = arr[front] ;
        if (front++==arr.length-1) {
            System.out.println("Poped element :" + t + "\n");
            front++ ;
        }
        else
        {
            System.out.println("Poped element :" + t + "\n");
            front++;
        }
        }
    }

    

}