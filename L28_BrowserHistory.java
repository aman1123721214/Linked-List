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
class L28_BrowserHistory {
     // constructor to initialize object with homepage
    Node homeNode;
    Node curr;
    L28_BrowserHistory(String homepage) {
        homeNode = new Node(homepage);
        curr = homeNode; 
        curr.prev = null;
    }
    
    // visit current url
    void visit(String url) {
        Node newNode = new Node(url);
        newNode.prev = curr;
        curr.next = newNode;
        curr = curr.next;
    }
    
    // 'steps' move backward in history and return current page
    String back(int steps) {
        while(steps-- >0 && curr.prev!=null)
            curr = curr.prev;
        
        return curr.str;
    }
    
    // 'steps' move forward and return current page
    String forward(int steps) {
        while(steps-- >0 && curr.next!=null)
            curr = curr.next;
        return curr.str;
    }
}