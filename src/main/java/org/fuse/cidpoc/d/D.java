package org.fuse.cidpoc.d;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Utils;
import org.fuse.cidpoc.a.A;
import org.fuse.cidpoc.b.B;

public class D extends Item {

    @Override
    public Capability getCapability() {
        return Utils.getCapability(D.class);
    }

    @Override
    public List<Requirement> getRequirements() {
        return Utils.getRequirements(D.class);
    }

    @Override
    public List<Item> getDependencies() {
        Item[] deps = new Item[] { new A(), new B() };
        return Arrays.asList(deps);
    }
}
