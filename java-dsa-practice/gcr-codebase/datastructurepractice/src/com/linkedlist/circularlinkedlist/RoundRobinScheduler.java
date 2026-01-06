package com.linkedlist.circularlinkedlist;

public class RoundRobinScheduler {

    // Node representing a process
    static class Process {
        int pid;
        int burstTime;
        int remainingTime;
        int priority;
        int waitingTime;
        int turnaroundTime;
        Process next;

        Process(int pid, int burstTime, int priority) {
            this.pid = pid;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
            this.waitingTime = 0;
            this.turnaroundTime = 0;
            this.next = null;
        }
    }

    Process head = null;

    // Add process at end
    void addProcess(int pid, int burst, int priority) {
        Process p = new Process(pid, burst, priority);

        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = p;
            p.next = head;
        }
    }

    // Remove process by PID
    Process removeProcess(Process curr, Process prev) {
        if (curr == head && curr.next == head) { // Only one process
            head = null;
            return null;
        }

        if (curr == head) { // Removing head
            Process last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            return head;
        }

        prev.next = curr.next;
        return curr.next;
    }

    // Display current process list
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes left");
            return;
        }

        Process temp = head;
        System.out.println("Current Processes:");
        do {
            System.out.println("P" + temp.pid + " | Remaining: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Round Robin Scheduling
    void roundRobin(int timeQuantum) {
        if (head == null) return;

        Process curr = head;
        Process prev = null;
        int time = 0;
        int totalWT = 0, totalTAT = 0, count = 0;

        while (head != null) {
            System.out.println("Executing P" + curr.pid);

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                time += timeQuantum;
                prev = curr;
                curr = curr.next;
            } else {
                time += curr.remainingTime;
                curr.remainingTime = 0;
                curr.turnaroundTime = time;
                curr.waitingTime = curr.turnaroundTime - curr.burstTime;

                totalWT += curr.waitingTime;
                totalTAT += curr.turnaroundTime;
                count++;

                System.out.println("P" + curr.pid + " finished execution");

                Process next = curr.next;
                curr = removeProcess(curr, prev);
                if (curr == null) break; // last process finished
                curr = next;
            }

            displayProcesses();
        }

        System.out.println("Average Waiting Time = " + (float) totalWT / count);
        System.out.println("Average Turnaround Time = " + (float) totalTAT / count);
    }

    // Main method
    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        int timeQuantum = 3;
        rr.roundRobin(timeQuantum);
    }
}
