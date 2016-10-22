package symbols;

import lexer.Tag;

/**
 * Created by sundoge on 2016/10/22.
 */
public class Array extends Type {
    public Type of;
    public int size = 1;

    public Array(int sz, Type tp) {
        super("[]", Tag.INDEX, sz * tp.width);
        size = sz;
        of = tp;
    }

    public String toString() {
        return "[" + size + "]" + of.toString();
    }
}
