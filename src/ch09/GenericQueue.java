package ch09;

import java.util.LinkedList;

// 큐(Queue): FIFO(First In First Out) 자료구조
// 가장 먼저 들어간 것이 가장 먼저 처리됨
// ex) 메시지 처리 시스템
public class GenericQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // 요소 추가
    // 가장 마지막 위치에 넣음
    // -----------------------
    //          ...      3 2 1
    //------------------------
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 요소 꺼내오기
    public T dequeue() {
        return queue.pollFirst();
    }
}
