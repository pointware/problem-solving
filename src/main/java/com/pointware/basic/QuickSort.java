package com.pointware.basic;

public class QuickSort {
    private void swap(int[] a, int i1, int i2){
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
    private int getPivot(int[] a, int left, int right){
        return a[right];
    }
    private int partitioning(int[] a, int left, int right){
        int leftIndex = left-1;
        int rightIndex = right;
        int pivotValue = a[right];
        while(leftIndex+1 < rightIndex){
            if(leftIndex+1 < rightIndex-1 && pivotValue < a[leftIndex+1] &&
                    pivotValue > a[rightIndex-1]){
                swap(a, leftIndex+1, rightIndex-1);
            }
            if(pivotValue > a[leftIndex+1]){
                leftIndex++;
            }
            if(pivotValue <= a[rightIndex-1]){
                rightIndex--;
            }
        }
        swap(a, leftIndex+1, right);
        return rightIndex;
    }
    private int partitioning2(int[] a, int left, int right){
        int leftIndex = left;
        int rightIndex = right-1;
        int pivotValue = a[right];
        while(leftIndex < rightIndex){
            if(pivotValue < a[leftIndex] && pivotValue > a[rightIndex]){
                swap(a, leftIndex, rightIndex);
            }
            if(pivotValue > a[leftIndex]){
                leftIndex++;
            }
            if(pivotValue <= a[rightIndex]){
                rightIndex--;
            }
        }
        swap(a, rightIndex+1, right);
        return leftIndex;
    }
    private void sort(int[] a, int left, int right){
        if(left >= right) return;
        var partedIndex = partitioning(a, left, right);
        sort(a, left, partedIndex-1);
        sort(a, partedIndex, right);

    }
    public int[] sort(int[] a){
        sort(a, 0, a.length-1);
        return a;
    }
}
