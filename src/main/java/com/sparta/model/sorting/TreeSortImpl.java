package com.sparta.model.sorting;

public class TreeSortImpl <T extends Comparable <? super T>> {

    public void sortingAlgorithm(T [] arr){
        TreeSortImpl treeSort = new TreeSortImpl();
        treeSort.tree(arr);
        treeSort.inOrder(treeSort.node, arr, 0);
    }

    public Node node;

    public TreeSortImpl() {
        node = null;
    }

    public void insert(T value){
        node = insertRecursive(node , value);
    }

    public Node insertRecursive(Node node, T value){

        if(node == null){
            node = new Node(value);
            return node;
        }

        if (value.compareTo(node.value) < 0){
            node.left = insertRecursive(node.left, value);
        } else if(value.compareTo(node.value) > 0){
            node.right = insertRecursive(node.right, value);
        } else if(value.compareTo(node.value) == 0){
            node.left = insertRecursive(node.left, value);
        }

        return node;
    }

    public int inOrder(Node node, T[] arr, int i){
        if(node != null){
            i = inOrder(node.left, arr, i);
            arr[i++] = node.value;
            i = inOrder(node.right, arr, i);
        }

        return i;
    }

    public void tree(T[] arr){
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
    }


    private class Node{
        public T value;
        public Node left;
        public Node right;

        public Node(T value) {
            this.value = value;
            left = right = null;
        }
    }

}
