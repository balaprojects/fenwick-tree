package com.balaprojects.fenwicktree;

public class Test {

    public static void main(String[] args) {
        int input[] = {1,2,3,4,5,6,7};
        FenwickTree ft = new FenwickTree();
        int binaryIndexedTree[] = ft.constructTree(input);
        System.out.println(ft.findSum(binaryIndexedTree, 0));
        System.out.println(ft.findSum(binaryIndexedTree, 1));
        System.out.println(ft.findSum(binaryIndexedTree, 2));
        System.out.println(ft.findSum(binaryIndexedTree, 3));
        System.out.println(ft.findSum(binaryIndexedTree, 4));
        System.out.println(ft.findSum(binaryIndexedTree, 5));
        System.out.println(ft.findSum(binaryIndexedTree, 6));

        assert 1 == ft.findSum(binaryIndexedTree, 0);
        assert 3 == ft.findSum(binaryIndexedTree, 1);
        assert 6 == ft.findSum(binaryIndexedTree, 2);
        assert 10 == ft.findSum(binaryIndexedTree, 3);
        assert 15 == ft.findSum(binaryIndexedTree, 4);
        assert 21 == ft.findSum(binaryIndexedTree, 5);
        assert 28 == ft.findSum(binaryIndexedTree, 6);
    }
}
