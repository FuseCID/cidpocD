package org.fuse.cidpoc.d;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.a.A;
import org.fuse.cidpoc.b.B;

public class D extends Item {

    @Override
    public Capability getCapability() {
        return new Capability("D", 5);
    }

    @Override
    public List<Requirement> getRequirements() {
        Requirement[] reqs = new Requirement[] { new Requirement("A", 3, 6), new Requirement("B", 3, 6) };
        return Arrays.asList(reqs);
    }

    @Override
    public List<Item> getDependencies() {
        Item[] deps = new Item[] { new A(), new B() };
        return Arrays.asList(deps);
    }
}
