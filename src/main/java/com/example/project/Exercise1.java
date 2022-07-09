package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }

    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
    	if (a1.isEmpty() && a2.isEmpty()) { //Caso de que esten vacios
    	    return true;
    	}else {
    	    Node<T> raiz1 = a1.root; 
            Node<T> raiz2 = a2.root; 
            return compareNodes(raiz1, raiz2);
    	}
    }

    private <T extends Comparable<T>> boolean compareNodes(Node<T> node1, Node<T> node2){//Metodo Recursivo
    	if(node1 != null && node2 != null) { 
    	    return compareNodes(node1.left, node2.left) && compareNodes(node1.right, node2.right); 
    	}else if(node1 == null && node2 == null){
    	    return true;
    	}else//Seran diferentes si algun nodo es nulo y el otro no
    	    return false;
    }
}
