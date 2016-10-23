package symbols;

import java.util.Hashtable;

/**
 * Created by sundoge on 2016/10/23.
 */
public class Env {

    private Hashtable table;
    protected Env prev;

    public Env(Env n) {
        table = new Hashtable();
        prev = n;
    }
}
