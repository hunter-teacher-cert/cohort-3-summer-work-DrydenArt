public class Node{
  private String data;
  private Node next;


  /* Constructors */

  public Node(){

  }

  public Node(String data){
    this.data = data;
    this.next = null;

  }


  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }

  public String getData(){//gets the data
    return data;
  }
  public Node getNext(){//gets the next node
    return next;
  }

  public void setData(String data){//sets the node to the data
    this.data = data;
  }

  public void setNext(Node next){//points the node to the next node
    this.next = next;
  }

  public String toString(){
    return "" + data + "->";
  }
}