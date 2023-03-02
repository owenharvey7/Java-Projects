import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Title
        System.out.println("Project 3 - Binary Search Tree");
        System.out.println("By: Owen Harvey and Hobee Hembree");
        System.out.println("---------------------------------\n\n");


        //1. Randomly generate 100 unique values in the range of [1-200] and insert them into a binary search tree (BST1)
        System.out.println("Task 1 generate values for BST1\n\n");
        BST<Integer> tree = new BST<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            tree.insert(random.nextInt(200) + 1);
        }

        //2. Print the height and inorder output of the BST1 tree.
        System.out.println("Task 2 print height and inorder output of BST1");
        System.out.println("Height of the tree: " + tree.size());
        System.out.println("Inorder traversal of the tree: ");
        tree.inorder();
        System.out.println();

        //3. Randomly generate 10 unique values in the range of [1-200] (there should be an overlap with the previous values in BST1) and insert them into another binary search tree (BST2).
        System.out.println("\nTask 3 generate values for BST2");
        BST<Integer> tree2 = new BST<>();
        for (int i = 0; i < 10; i++) {
            tree2.insert(random.nextInt(200) + 1);
        }
        System.out.println();

        //4. Print preorder, inorder, and postorder output of the BST2 tree.
        System.out.println("Task 4 print preorder, inorder, and postorder output of BST2");
        System.out.println("Preorder traversal of the tree: ");
        tree2.preorder();
        System.out.println();
        System.out.println("Inorder traversal of the tree: ");
        tree2.inorder();
        System.out.println();
        System.out.println("Postorder traversal of the tree: ");
        tree2.postorder();
        System.out.println();
        System.out.println();


        //5. Print the number of leaves in BST2.
        System.out.println("Task 5 print the number of leaves in BST2");
        System.out.println("Number of leaves in the tree: " + (tree2.getSize()+1)/2);
        System.out.println();


        //6. Write a method to print all paths of BST2 from root to leaf .
        System.out.println("Task 6 print all paths of BST2 from root to leaf");
        System.out.println("All paths from root to leaf: ");
        tree2.printPaths();



        System.out.println();

        //7. Find and remove any values of BST2 from BST1.
        System.out.println("Task 7 find and remove any values of BST2 from BST1");
        System.out.println("Removing values of BST2 from BST1: ");
        tree.removeAll(tree2);
        System.out.println("Removal complete");
        System.out.println();


        //8. Print the height, number of nodes, and inorder output of the modified BST1 tree.
        System.out.println("Task 8 print the height, number of nodes, and inorder output of the modified BST1 tree");
        System.out.println("Height of the tree: " + tree.size());
        System.out.println("Number of nodes in the tree: " + (2^(tree.size() + 1)-1));
        System.out.println("Inorder traversal of the tree: ");
        tree.inorder();
        System.out.println();
        System.out.println();

        //9. Clear the binary search trees. Print whether trees are empty before and after the clear operation.
        System.out.println("Task 9 clear the binary search trees");
        System.out.println("Is tree one empty? " + tree.isEmpty());
        tree.clear();
        System.out.println("Is tree one empty? " + tree.isEmpty());
        System.out.println("Is tree two empty? " + tree2.isEmpty());
        tree2.clear();
        System.out.println("Is tree two empty? " + tree2.isEmpty());

    }
}

