package com.linkedlist.circularlinkedlist;

public class TaskSchedular {

    // Node
    static class Task {
        int id;
        String name;
        int priority;
        String dueDate;
        Task next;

        Task(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    Task head = null;
    Task current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = t;
            t.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        t.next = head;
        temp.next = t;
        head = t;
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = t;
            t.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = t;
        t.next = head;
    }

    // Add at position
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task t = new Task(id, name, priority, dueDate);
        Task temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        t.next = temp.next;
        temp.next = t;
    }

    // Remove by ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Task curr = head, prev = null;

        do {
            if (curr.id == id) {

                // single node
                if (curr == head && curr.next == head) {
                    head = null;
                    current = null;
                    return;
                }

                // removing head
                if (curr == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Task removed");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    void viewCurrentTask() {
        if (current == null) {
            System.out.println("No task available");
            return;
        }

        System.out.println("\nCurrent Task:");
        System.out.println(current.id + "  " + current.name + "  "
                + current.priority + "  " + current.dueDate);

        current = current.next;
    }

    // Display all tasks
    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        Task temp = head;
        System.out.println("\nAll Tasks:");
        do {
            System.out.println(temp.id + "  " + temp.name + "  "
                    + temp.priority + "  " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int p) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == p) {
                System.out.println(temp.id + "  " + temp.name + "  " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task with given priority");
    }

    // Main
    public static void main(String[] args) {

        TaskSchedular t = new TaskSchedular();

        t.addAtEnd(1, "Design", 1, "10-01-2026");
        t.addAtBeginning(2, "Coding", 2, "08-01-2026");
        t.addAtPosition(2, 3, "Testing", 1, "09-01-2026");

        t.displayTasks();

        t.viewCurrentTask();
        t.viewCurrentTask();

        t.searchByPriority(1);

        t.removeById(2);
        t.displayTasks();
    }
}
