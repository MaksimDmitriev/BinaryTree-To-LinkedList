package algo.treetolist;

public class Main {

    /*
     * http://www.careercup.com/question?id=5647453514629120
     * 
     * The problem was a little unclear to me. Especially this:
     * 
     * Hint: A single node Left & Right points to itself. 
     * 
     * I think I'd ask what it means at the real interview. Now I just want to move on.
     * 
     * Maksim Dmitriev
     * April 13, 2015
     */
    public static void main(String[] args) {
        Node root = fillTree();
        Node.inOrder(root);
    }

    /**
     * 
     * @return root
     */
    private static Node fillTree() {
        Node d = new Node('d');
        Node e = new Node('e');

        Node b = new Node('b');
        b.setLeft(d);
        b.setRight(e);

        Node f = new Node('f');
        Node g = new Node('g');

        Node c = new Node('c');
        c.setLeft(f);
        c.setRight(g);

        Node a = new Node('a');
        a.setLeft(b);
        a.setRight(c);

        return a;
    }

}
