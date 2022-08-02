/**
 * @author Delete020
 * @since 08/02/22 20:36 PM
 */
public class DesignCircularQueue {
    class MyCircularQueue {

        int front;
        int rear;
        int[] queue;
        int n;
        int size;

        public MyCircularQueue(int k) {
            queue = new int[k];
            front = 0;
            rear = 0;
            n = k;
            size = 0;
        }

        public boolean enQueue(int value) {
            if (size == n) return false;
            queue[rear] = value;
            rear = (rear + 1) % n;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (size == 0) return false;
            front = (front + 1) % n;
            size--;
            return true;
        }

        public int Front() {
            if (size == 0) return -1;
            return queue[front];
        }

        public int Rear() {
            if (size == 0) return -1;
            return queue[(rear + n - 1) % n];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == n;
        }
    }
}