package org.fuse.cidpoc.test;

import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Item.Capability;
import org.fuse.cidpoc.Item.Requirement;
import org.fuse.cidpoc.a.A;
import org.fuse.cidpoc.b.B;
import org.fuse.cidpoc.d.D;
import org.junit.Assert;
import org.junit.Test;

public class DTest {

    @Test
    public void testStatus() throws Exception {
        
        Item item = new D();
        item.transitiveStatus();
        
        List<Item> deps = item.getDependencies();
        Assert.assertEquals(2, deps.size());
        Item depA = deps.get(0);
        Item depB = deps.get(1);
        Assert.assertEquals("A-" + Item.getVersion(A.class), depA.getVName());
        Assert.assertEquals("B-" + Item.getVersion(B.class), depB.getVName());
        
        Capability cap = item.getCapability();
        Assert.assertEquals("D", cap.getName());
        Assert.assertTrue(cap.getValue() > 0);
        
        List<Requirement> reqs = item.getRequirements();
        Assert.assertEquals(2, reqs.size());
        Requirement reqA = reqs.get(0);
        Requirement reqB = reqs.get(1);
        Assert.assertTrue(reqA.matches(depA.getCapability()));
        Assert.assertTrue(reqB.matches(depB.getCapability()));

        String version = Item.getVersion(item.getClass());
        Assert.assertEquals("D-" + version, item.getVName());
        Assert.assertEquals("is satisfied", item.getStatus());
    }
}
