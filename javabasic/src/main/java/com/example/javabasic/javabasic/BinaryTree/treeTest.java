package com.example.javabasic.javabasic.BinaryTree;

import java.util.Scanner;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/2/22 17:01
 */
public class treeTest {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.root = create(binaryTree.root);
    printTree(binaryTree.root);
  }

  private static void printTree(TreeNode root) {
    if (root != null) {
      System.out.print(root.val + " ");
      printTree(root.left);
      printTree(root.right);
    }

  }

  /**
   * 创建二叉树
   *
   * @param node
   * @return
   */
  private static TreeNode create(TreeNode node) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入节点的值：");
    int value = in.nextInt();
    if (value != 0) {
      node = new TreeNode();
      node.val = value;
      node.left = create(node.left);
      node.right = create(node.right);
    } else {
      node = null;
    }
    return node;
  }

}
