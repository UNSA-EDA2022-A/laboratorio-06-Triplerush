package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
    	if (a.isEmpty()) { //Caso de que esten vacios
    	    return true;
    	}else {
    	    Node<T> raiz = a.root; 
            return compareNode(raiz);
    	}
    }
    private <T extends Comparable<T>> boolean compareNode(Node<T> node){//Metodo Recursivo
    	if(node.left != null && node.right != null)
    	    return compareNode(node.left) && compareNode(node.right); 
    	else if(node.left == null && node.right == null)//el nodo es una hoja
    	    return true;
    	else//No sera binario si solo tiene un hijo
    	    return false;
    }
}
