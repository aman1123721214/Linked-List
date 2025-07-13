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
        
    }
    
    // visit current url
    void visit(String url) {
        
    }
    
    // 'steps' move backward in history and return current page
    String back(int steps) {
        
    }
    
    // 'steps' move forward and return current page
    String forward(int steps) {
        
    }
}