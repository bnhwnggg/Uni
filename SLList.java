

class SLList {
   protected SLLNode head = null;
   protected SLLNode tail = null;
   int size = 0;

   public SLList() {
   }

   public void setToNull() {
      this.head = null;
   }

   public boolean isEmpty() {
      return this.head == null;
   }

   public Object first() {
      return this.head.info;
   }

   public SLLNode head() {
      return this.head;
   }

   public void printAll() {
      for(SLLNode tmp = this.head; tmp != null; tmp = tmp.next) {
         System.out.print(tmp.info.toString());
      }

   }

   public void add(Object el) {
      if(head==null){
         head = new SLLNode(head);
         }
      }
   }

   public Object find(Object el) {
      SLLNode tmp;
      for(tmp = this.head; tmp != null && !el.equals(tmp.info); tmp = tmp.next) {
      }

      return tmp == null ? null : tmp.info;
   }

   public Object deleteHead() {
      Object el = this.head.info;
      this.head = this.head.next;
      return el;
   }

   public void delete(Object el) {
      if (this.head != null) {
         if (el.equals(this.head.info)) {
            this.head = this.head.next;
         } else {
            SLLNode pred = this.head;

            SLLNode tmp;
            for(tmp = this.head.next; tmp != null && !tmp.info.equals(el); tmp = tmp.next) {
               pred = pred.next;
            }

            if (tmp != null) {
               pred.next = tmp.next;
            }
         }
      }

   }

   public void join(SLList l2) {
      if (this.isEmpty()) {
         this.head = l2.head;
      } else {
         SLLNode t;
         for(t = this.head; t.next != null; t = t.next) {
         }

         t.next = l2.head;
      }

   }

   public void llreverse() {
      if (this.head != null) {
         SLList x = new SLList();
         Object y = this.deleteHead();
         x.add(y);
         this.llreverse();
         this.join(x);
      }

   }

   public void iterativeReverse() {
      SLList y = new SLList();

      for(SLLNode x = this.head; x != null; x = x.next) {
         Object n = this.deleteHead();
         y.add(n);
      }

      this.head = y.head;
   }

   public void insert(Object p, Object q) {
      SLLNode y = new SLLNode(p);
      SLLNode x = this.head;
      if (x == null) {
         this.head = y;
      } else {
         while(true) {
            if (x.next == null || x.info.equals(q)) {
               if (x.next == null) {
                  x.next = y;
               } else {
                  y.next = x.next;
                  x.next = y;
               }
               break;
            }

            x = x.next;
         }
      }

   }

   void deleteLast() {
        if (head!= null) { //If the list is not empty
        if (head.next==null) { // The list has one node
            head=null; //delete the only note
        }
        else { // The list has at least two nodes
        SLLNode temp= head; //register a temporary pointer to head
        while(temp.next.next!=null) { //traverse the list find the very last node
        temp=temp.next; 
        } 
        temp.next= null;
        }
        }
        }

   public boolean equals(SLList p) {
      SLLNode x = this.head;

      SLLNode y;
      for(y = p.head; y != null && x != null; x = x.next) {
         if (!x.info.equals(y.info)) {
            return false;
         }

         y = y.next;
      }

      return y == null && x == null;
   }
}
