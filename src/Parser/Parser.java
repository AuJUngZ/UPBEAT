package Parser;

import AST.Node;

public interface Parser {
    Node parse();
    void runTree();
}