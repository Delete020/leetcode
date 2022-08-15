/**
 * @author Delete020
 * @since 08/15/22 21:28 PM
 */
public class MyCircularDeque {
    int[] array;
    int n;
    int front;
    int rear;
    int size;

    public MyCircularDeque(int k) {
        array = new int[k];
        n = k;
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (size == n) return false;
        front = (front + n - 1) % n;
        array[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == n) return false;
        rear = (rear + 1) % n;
        array[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) return false;
        front = (front + 1) % n;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) return false;
        rear = (rear + n - 1) % n;
        size--;
        return true;
    }

    public int getFront() {
        if (size == 0) return -1;
        return array[front];
    }

    public int getRear() {
        if (size == 0) return -1;
        return array[(front + n + size - 1) % n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }
}