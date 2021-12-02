package com.sparta.model.sorting;

import java.util.List;

public class TreeSortImpl <T extends Comparable <? super T>> implements Sorter<T> {

    // Implements tree sort ARRAY
    public void sortingAlgorithm(T [] arr){
        TreeSortImpl treeSort = new TreeSortImpl();
        treeSort.tree(arr);
        treeSort.inOrder(treeSort.node, arr, 0);
    }

    // implement tree sort LIST
    public void sortingAlgorithm(List<T> list){
        TreeSortImpl treeSort = new TreeSortImpl();
        treeSort.tree(list);
        treeSort.inOrder(treeSort.node, list, 0);
    }

    //Nested Class
    private class Node{
        public T value;
        public Node left;
        public Node right;

        public Node(T value) {
            this.value = value;
            left = right = null;
        }
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


    /**
     *      Polymorphism for Array sort
     */
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


    /**
     *      Polymorphism for List sort
     */
    public int inOrder(Node node, List<T> list, int i){
        if(node != null){
            i = inOrder(node.left, list, i);
            list.set(i++, node.value);
            i = inOrder(node.right, list, i);
        }

        return i;
    }

    public void tree(List<T> list){
        for(int i = 0; i < list.size(); i++){
            insert(list.get(i));
        }
    }

}
