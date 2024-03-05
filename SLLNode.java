// Source code is decompiled from a .class file using FernFlower decompiler.

public class SLLNode {
   public Object info;
   public SLLNode next;

   public SLLNode() {
      this.next = null;
   }

   public SLLNode(Object el) {
      this.info = el;
      this.next = null;
   }

   public SLLNode(Object el, SLLNode ptr) {
      this.info = el;
      this.next = ptr;
   }
}
