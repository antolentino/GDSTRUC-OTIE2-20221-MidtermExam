package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode next;
    private PlayerNode previous;
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        playerNode.setPreviousPlayer(next);
        next = playerNode;

    }
    public void deleteFirstNode(){
        if (head == null){
            return;
        }
        else {
            if (head != previous){
                head = head.getPreviousPlayer();
                head.setPreviousPlayer(next);
            }
            else {
                head = previous = null;
            }
        }
    }
    public void searchNode(int p) {
        PlayerNode temp = head;
        int found = 0;
        int i = 0;
        if(temp != null) {
            while(temp != null) {
                i++;
                if(temp-> == p) {
                    found++;
                    break;
                }
                temp = temp.getNextPlayer();
            }
            if (found == 1) {
                System.out.print(p + " is found at index = " + i + "\n");
            } else {
                System.out.print(" is not found" + "\n");
            }
        } else {
            System.out.print("The list is empty \n");
        }
    }

    public void printList(){
        System.out.print("HEAD -> ");
        PlayerNode current = head;

        while (current != null){
            System.out.print(current.getPlayer()+ " -> ");
            current = current.getNextPlayer();

        }
        System.out.println("NULL \n");
    }


}
