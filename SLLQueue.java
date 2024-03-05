public class SLLQueue {
    SLLNode first;
    SLLNode last;
    int size;
    
    public SLLQueue(){
        first = null;
        last = null;
        size = 0;
    }

    public void qPush(Object el){
        SLLNode nodeToBeAdded = new SLLNode(el, null);
        if(first==null){
            first = nodeToBeAdded;
            last = first;
        } else { 
            //Adding the node to the end of least
            last.next = nodeToBeAdded;
            //Make the last pointer point to that node
            last = last.next;
        }
        size++; 
    }

    public Object qPop(){ //Remove the first node of the queue, and returning the data of the node. 
        if(first == null){
            return null;
        }

        Object infoToBeRemoved = first.info;
        first = first.next;
        size--;
        return infoToBeRemoved;
    }
    
}
