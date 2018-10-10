package AST;

import AST.Visitor.Visitor;
import java_cup.runtime.ComplexSymbolFactory.Location;

public class MainClass extends ASTNode{
  public Identifier i1,i2;
  public StatementList sl;

  public MainClass(Identifier ai1, Identifier ai2, StatementList as,
                   Location pos) {
    super(pos);
    i1=ai1; i2=ai2; sl=as;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
