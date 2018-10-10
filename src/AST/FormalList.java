package AST;

import java.util.List;
import java.util.LinkedList;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class FormalList extends ASTNode {
   private List<Formal> list;

   public FormalList(Location pos) {
      super(pos);
      list = new LinkedList<Formal>();
   }

   public void add(Formal n) {
      list.add(n);
   }

   public Formal get(int i)  { 
      return list.get(i); 
   }

   public int size() { 
      return list.size(); 
   }
}
