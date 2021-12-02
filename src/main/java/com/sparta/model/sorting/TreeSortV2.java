package com.sparta.model.sorting;

import java.util.List;

public class TreeSortV2 <T extends Comparable <? super T>> {

    public void sortingAlgorithm(List <T> list){
        TreeSortV2 treeSort = new TreeSortV2();
        treeSort.tree(list);
        treeSort.inOrder(treeSort.node, list, 0);
    }

    public Node node;

    public TreeSortV2() {
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
