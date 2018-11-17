package SDA_Algorytmy.pl.dopierala.lesson13.Tree.BinaryTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeElement root = BinaryTreeElement.exampleTree();
        System.out.println(root.toFormattedJSON());
        System.out.println("Wysokosc drzewa: " + root.heightOfTree());
        //root.getPostOrderList();

        root.getPostOrderList().stream().forEach(System.out::println);

    }

    public static void printTree(BinaryTreeElement root) {
        System.out.println(root);
        if (root.getLeftElement() != null)
            printTree(root.getLeftElement());
        if (root.getRightElement() != null)
            printTree(root.getRightElement());


    }
}

