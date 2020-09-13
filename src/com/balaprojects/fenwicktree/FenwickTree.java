package com.balaprojects.fenwicktree;

public class FenwickTree {

    public int[] constructTree(int[] input) {
        int[] fenwickTree = new int[input.length + 1];
        for(int i = 1; i <= input.length; i++) {
            updateFenwickTree(fenwickTree, input[i - 1], i);
        }
        return fenwickTree;
    }

    private void updateFenwickTree(int[] fenwickTree, int value, int index) {
        while (index < fenwickTree.length) {
            fenwickTree[index] += value;
            index = getNext(index);
        }
    }

    private int getNext(int index) {
        return index + (index & -index);
    }

    public int findSum(int[] fenwickTree, int index) {
        index = index + 1;
        int sum = 0;
        while (index > 0) {
            sum += fenwickTree[index];
            index = getParent(index);
        }
        return sum;
    }

    private int getParent(int index) {
        return index - (index & -index);
    }

}
