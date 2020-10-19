package com.pointware.hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FraudulentActivityNotificationsImpl implements FraudulentActivityNotifications {
    @Override
    public int activityNotifications(int[] expenditure, int d) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < d; i++) {
            genMedianHeap(minHeap, maxHeap, expenditure[i]);
        }

        int count = 0;
        for (int i = d; i < expenditure.length; i++) {
            float median = getMedian(minHeap, maxHeap, d);
            if (median * 2 <= expenditure[i]) {
                result++;
            }
            setMedianHeap(minHeap, maxHeap, expenditure[count++], expenditure[i]);
        }
        return result;
    }

    public float getMedian(PriorityQueue<Integer> minHeap,
                         PriorityQueue<Integer> maxHeap,
                         int window) {
        if (window % 2 == 0) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0f;
        } else {
            return maxHeap.peek();
        }
    }

    public void setMedianHeap(PriorityQueue<Integer> minHeap,
                              PriorityQueue<Integer> maxHeap,
                              int removeValue,
                              int addValue) {
        if (!maxHeap.remove(removeValue)) {
            minHeap.remove(removeValue);
        }
        genMedianHeap(minHeap, maxHeap, addValue);
    }

    private void genMedianHeap(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap, int addValue) {
        if (maxHeap.size() == 0 || minHeap.size() == 0 || addValue < minHeap.peek()) {
            maxHeap.add(addValue);
        } else {
            minHeap.add(addValue);
        }

        if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() - maxHeap.size() >= 1) {
            maxHeap.add(minHeap.poll());
        }
    }

}
