public class Main {

    public static void main(String[] args) {


        //this code test the DFS algo in postOrder
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("DFS PostOrder:");
        System.out.println( myBST.DFSPostOrder() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS PostOrder:
            [18, 27, 21, 52, 82, 76, 47]

        */

    }

}