package AST;

import java.util.List;
import java.util.LinkedList;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class VarDeclList extends ASTNode {
   private List<VarDecl> list;

   public VarDeclList(Location pos) {
      super(pos);
      list = new LinkedList<VarDecl>();
   }

   public void add(VarDecl n) {
      list.add(n);
   }

   public VarDecl get(int i)  { 
      return list.get(i); 
   }

   public int size() { 
      return list.size(); 
   }
}
