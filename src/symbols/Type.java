package symbols;

import lexer.*;

/**
 * Created by sundoge on 2016/10/18.
 */
public class Type extends Word {
    public int width = 0;

    public Type(String s, int tag, int w) {
        super(s, tag);
        width = w;
    }

    public static final Type
            Int = new Type("int", Tag.BASIC, 4),
            Float = new Type("float", Tag.BASIC, 8),
            Char = new Type("char", Tag.BASIC, 1),
            Bool = new Type("bool", Tag.BASIC, 1),
            Double = new Type("double", Tag.BASIC, 16);

//    public static Type max(Type t1, Type t2) {
//        if (!isNumeric(t1)||!isNumeric(t2))
//            return null;
//
//    }
//
//    public static boolean isNumeric(Type s) {
//        if (s == Type.Int || s == Type.Float || s == Type.Char || s == Type.Bool)
//            return true;
//        else
//            return false;
//    }
}
