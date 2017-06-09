package org.fuse.cidpoc.test;

import org.fuse.cidpoc.a.Item;
import org.fuse.cidpoc.a.Utils;
import org.fuse.cidpoc.d.D;
import org.junit.Assert;
import org.junit.Test;

public class DTest {

    @Test
    public void testStatus() throws Exception {
        
        Item item = new D();
        item.transitiveStatus();
        
        String version = Utils.getVersion(item.getClass());
        String status = Utils.getStatus(item.getClass());
        Assert.assertEquals("D-" + version + " is " + status, item.getMessage());
    }
}
