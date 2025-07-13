import java.util.*;

class Node{
    String str;
    Node next;
    Node prev;

    Node(String s){
        str = s;
        next = null;
        prev = null;
    }
}
class BrowserHistory {
     // constructor to initialize object with homepage
    BrowserHistory(String homepage) {
        Node homeNode;
        Node curr;
        
    }
    
    // visit current url
    void visit(String url) {
        Node temp = new BrowserHistory();
        while(temp!=null){
            if(temp.str == url) return;
            temp = temp.next;
        }return;
    }
    
    // 'steps' move backward in history and return current page
    String back(int steps) {
        Node temp = head;
        while(steps>0){
            temp = temp.prev;
            steps--;
        }
        return temp.str;
    }
    
    // 'steps' move forward and return current page
    String forward(int steps) {
        
    }
}