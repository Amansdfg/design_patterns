package StructuralDesignPatterns.Composite;

/**
 *
 *{@code Composite}
 * <blockquote><pre>Also known as: Object tree</pre></blockquote><p>
 *  Intent
 * Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
 *
 *@author  Aman
 */


public class Test {
    public static void main(String[] args) {
        File file1 = new File("Document1.txt", 120);
        File file2 = new File("Image1.png", 300);
        File file3 = new File("Presentation1.ppt", 450);

        Folder folder1 = new Folder("Document");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Project");
        folder2.addComponent(file3);
        folder2.addComponent(folder1);
        System.out.println("Folder Structure");
        folder2.showDetails();
    }
}
