package org.fuse.cidpoc.d;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.a.Item;
import org.fuse.cidpoc.b.B;

public class D implements Item {

    Item[] deps = new Item[] { new B() };

    @Override
    public List<Item> getDependecies() {
        return Arrays.asList(deps);
    }
}
