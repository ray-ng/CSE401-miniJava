package AST;

import java.util.LinkedList;
import java.util.List;
import AST.Visitor.Visitor;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class VarDecl extends Statement {
  public Type t;
  public List<Identifier> il;
  
  public VarDecl(Type at, List<Identifier> ai, Location pos) {
    super(pos);
    t=at; il=ai;
  }

  public Identifier get(int i)  {
    return il.get(i);
  }

  public int size() {
    return il.size();
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
