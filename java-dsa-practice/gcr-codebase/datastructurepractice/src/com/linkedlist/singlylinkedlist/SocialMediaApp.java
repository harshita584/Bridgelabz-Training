package com.linkedlist.singlylinkedlist;

import java.util.*;

class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}

class SocialMedia {
    private UserNode head;

    // Add User
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newUser;
    }

    // Search User
    public UserNode searchById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend Connection
    public void addFriend(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);
   
        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        addFriendToList(u1, id2);
        addFriendToList(u2, id1);

        System.out.println("Friend connection added.");
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    // Remove friend Connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        removeFriendFromList(u1, id2);
        removeFriendFromList(u2, id1);

        System.out.println("Friend connection removed.");
    }

    private void removeFriendFromList(UserNode user, int friendId) {
        FriendNode temp = user.friendHead, prev = null;

        while (temp != null) {
            if (temp.friendId == friendId) {
                if (prev == null)
                    user.friendHead = temp.next;
                else
                    prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Display friends
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);

        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // mutual friends
    public void mutualFriends(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendHead;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // count friends
    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}


public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Harshita", 21);
        sm.addUser(2, "Aman", 22);
        sm.addUser(3, "Neha", 20);
        sm.addUser(4, "Rahul", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.displayFriends(1);
        sm.displayFriends(3);

        sm.mutualFriends(1, 2);

        sm.removeFriend(1, 2);
        sm.displayFriends(1);

        sm.countFriends();
    }
}
