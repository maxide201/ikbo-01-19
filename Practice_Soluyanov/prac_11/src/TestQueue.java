public class TestQueue {
    public static void main(String[]Args)
    {
        ArrayQueue queue = new ArrayQueue();
        System.out.println("arrayQueue: ");
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.size());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());

        System.out.println("ArrayQueueModule: ");
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.dequeue());

        ArrayQueueADT queue2 = new ArrayQueueADT();
        System.out.println("arrayQueueADT: ");
        System.out.println(queue2.isEmpty(queue2));
        queue2.enqueue(queue2,1);
        queue2.enqueue(queue2,2);
        queue2.enqueue(queue2,3);
        System.out.println(queue2.size(queue2));
        System.out.println(queue2.element(queue2));
        System.out.println(queue2.dequeue(queue2));
    }
}
