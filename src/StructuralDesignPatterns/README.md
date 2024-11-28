# Decorator vs Composite Design Pattern

The Decorator and Composite design patterns both deal with the composition of objects, but they serve different purposes and are used in different scenarios. Here’s a comparison to highlight their differences:

## 1. Purpose:
### Decorator Pattern:
The purpose is to add responsibilities or behaviors to individual objects dynamically, without modifying the object’s class. It’s useful when you want to extend functionality in a flexible way by wrapping objects with decorators.

### Composite Pattern:
The purpose is to represent part-whole hierarchies where you treat individual objects and compositions of objects uniformly. It’s useful when you have to represent tree structures like file systems, organizational structures, or UI components.

## 2. Structure:
### Decorator Pattern:
- The decorator wraps an object, adding new behaviors while keeping the original interface intact. It focuses on enhancing individual objects without modifying the structure.
- Typically involves a single object being wrapped by decorators.
- **Example**: Adding different toppings (e.g., milk, sugar) to a coffee.

### Composite Pattern:
- The composite organizes objects into a tree structure where individual objects (leaves) and composite objects (containers or groups) are treated uniformly through the same interface.
- Involves a hierarchical structure (tree), where a composite contains other objects (both composites and leaves).
- **Example**: A folder containing files and subfolders in a file system.

## 3. Hierarchy:
### Decorator Pattern:
- Does not deal with part-whole hierarchies. It works by chaining decorators that wrap individual objects.
- Focuses on adding functionality by wrapping.

### Composite Pattern:
- Deals explicitly with part-whole hierarchies, where a composite can be composed of both individual objects and other composites.
- Focuses on composing objects into a tree-like structure.

## 4. Behavior:
### Decorator Pattern:
- Behaviors or responsibilities can be added or removed dynamically by adding or removing decorators.
- Changes behavior of individual objects, not all objects of a class.

### Composite Pattern:
- Focuses on managing groups of objects and performing operations uniformly on both the individual (leaf) objects and composites.
- It doesn’t modify behavior but enables uniform treatment of individual and composite objects.

## 5. Example Use Cases:
### Decorator Pattern:
- When you want to add features or responsibilities to individual objects at runtime.
- **Example**: Adding different features to a coffee (like sugar, milk, cream) without changing the base coffee class.

### Composite Pattern:
- When you want to build tree structures to represent part-whole hierarchies and perform operations uniformly across the tree.
- **Example**: A folder system where a folder contains files and subfolders, and you can operate on both in the same way.

## 6. Client Interaction:
### Decorator Pattern:
- Clients usually interact with the core object and its decorators in a flat structure, without concern for part-whole relationships.
- Typically applies operations to individual objects, even if those objects are wrapped in decorators.

### Composite Pattern:
- Clients interact with the whole structure (composite) and don’t need to differentiate between individual objects (leaves) and groups (composites).
- Operations are applied recursively to the whole structure (both individual and composite objects).

## Summary Table:

| Feature           | Decorator Pattern                    | Composite Pattern                                      |
|-------------------|--------------------------------------|-------------------------------------------------------|
| **Purpose**        | Add behavior to individual objects   | Treat part-whole hierarchies uniformly                 |
| **Structure**      | Wrapping objects                    | Tree structure of objects                              |
| **Hierarchy**      | No part-whole hierarchy              | Part-whole hierarchy (composites and leaves)           |
| **Behavior**       | Add or modify behavior dynamically   | Uniform treatment of individual and composite objects  |
| **Focus**          | Enhancing individual objects         | Managing groups of objects                             |
| **Example**        | Adding milk, sugar to coffee         | File system with folders and files                     |
| **Client Interaction** | Interacts with object + decorators | Interacts with structure (whole or parts)              |

## Conclusion:
- **Decorator** is about adding responsibilities to individual objects dynamically.
- **Composite** is about building and managing hierarchies of objects where individual objects and groups of objects can be treated the same way.

They are both structural design patterns, but Decorator focuses on enhancing object behavior, while Composite focuses on treating object groups and individuals uniformly.
