package parser;

import lexer.Lexer;
import lexer.Token;
import symbols.Env;

import java.io.IOException;

/**
 * Created by sundoge on 2016/10/23.
 */
public class Parser {
    private Lexer lex;
    private Token look;
    Env top = null;
    int used = 0;

    public Parser(Lexer l) throws IOException {
        lex = l;
        move();
    }

    void move() throws IOException {
        look = lex.scan();
    }

    void error(String s) {
        throw new Error("near line " + line + ": " + s);
    }

    void match(int t) throws IOException {
        if (look.tag == t)
            move();
        else
            error("syntax error");
    }
}
