package adt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryLinkedTreeTest {

    private BinaryLinkedTree<Integer> tree;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        tree = new BinaryLinkedTree<>();
        tree.makeTree(
                4,
                new BinaryTreeNode<>(2,
                        new BinaryTreeNode<>(1),
                        new BinaryTreeNode<>(3)),
                new BinaryTreeNode<>(6,
                        new BinaryTreeNode<>(5),
                        new BinaryTreeNode<>(7))
        );
    }

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void preOrder() {
        tree.preOrder(BinaryLinkedTree.outputMethod);
        assertEquals("4 2 1 3 6 5 7 ", outContent.toString());
    }

    @Test
    void inOrder() {
        tree.inOrder(BinaryLinkedTree.outputMethod);
        assertEquals("1 2 3 4 5 6 7 ", outContent.toString());
    }

    @Test
    void postOrder() {
        tree.postOrder(BinaryLinkedTree.outputMethod);
        assertEquals("1 3 2 5 7 6 4 ", outContent.toString());
    }

    @Test
    void levelOrder() {
        tree.levelOrder(BinaryLinkedTree.outputMethod);
        assertEquals("4 2 6 1 3 5 7 ", outContent.toString());
    }

    @Test
    void size() {
        assertEquals(7, tree.size());
    }

    @Test
    void height() {
        assertEquals(3, tree.height());
    }

}
