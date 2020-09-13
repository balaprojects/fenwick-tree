# fenwick-tree

>What is a fenwick tree?
   - It is a binary indexed tree.
   - Its use cases are **finding prefix sum**, **update index** which is done efficiently in O(log n) time.
   
>Conceptual Representation
   - Logical representation of tree is as below but actually it is stored in an array.
     ![](https://github.com/balaprojects/images/blob/master/Fenwick_Tree.png)
 
>Building Tree, Calculating prefix sum of tree and updating tree
   - Above are the operations that can be performed on fenwick tree efficiently.
   - These operations are based on below two utility methods.
      - getNext()   - N + (N & -N)
      - getParent() - N - (N & -N)
