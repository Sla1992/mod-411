package adt;

import lombok.Getter;
import lombok.Setter;

/**
 * Representiert einen Knoten in einer binären Baumstruktur
 */
@Setter
@Getter
@SuppressWarnings("WeakerAccess")
public class BinaryTreeNode<T> {

    /**
     * Zu speicherne Daten in in unserem Knoten.
     */
    private T payload;

    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    /**
     * Konstruktor ohne Argumente.
     */
    public BinaryTreeNode() {
    }

    /**
     * Erstellt einen Knotenpunkt mit den gegebenen Daten.
     *
     * @param payload Zu speichernde Daten im Knoten
     */
    public BinaryTreeNode(T payload) {
        this.payload = payload;
    }

    /**
     * Erstellt einen Knotenpunkt mit den übergebenen Daten.
     *
     * @param payload    Root element of the BinaryTreeNode
     * @param leftChild  Linker Teilbaum
     * @param rightChild Rechter Teilbaum
     */
    public BinaryTreeNode(T payload, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        this.payload = payload;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

}
