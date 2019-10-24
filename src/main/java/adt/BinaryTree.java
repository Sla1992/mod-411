package adt;

import java.lang.reflect.Method;

public interface BinaryTree<T> {

    /**
     * @return liefert den Wert true, falls der Baum leer ist
     */
    boolean isEmpty();

    /**
     * Liefert die Wurzel des Baumes.
     *
     * @return Liefert den Wert null, falls der Baum leer ist
     */
    BinaryTreeNode getRoot();

    /**
     * Erstellt eine Baumstruktur mit den angegebenen Parameter.
     *
     * <b>Vorsicht:</b> Der rechte und linke Teilbaum wird nicht geklont!
     *
     * @param payload Daten unseres Knotens
     * @param left    Linker Teilbaum
     * @param right   Rechter Teilbaum
     */
    void makeTree(T payload, BinaryTreeNode left, BinaryTreeNode right);

    /**
     * Löscht den linken Teilbaum.
     *
     * @return Gelöschter Teilbaum
     */
    BinaryTree removeLeftSubtree();

    /**
     * Löscht den rechten Teilbaum.
     *
     * @return Gelöschter Teilbaum
     */
    BinaryTree removeRightSubtree();

    void preOrder(Method visit);

    void inOrder(Method visit);

    void postOrder(Method visit);

    void levelOrder(Method visit);

}
