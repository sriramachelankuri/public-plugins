package com.opsramp.plugin.xen;

import com.opsramp.plugin.core.Plugin;
import com.opsramp.shared.lib.TestLib;
/**
 * Hello world!
 */
public class App implements Plugin {

    @Override
    public String name() {
        return "xen";
    }

    @Override
    public String version() {
        return "version";
    }

    @Override
    public String whoAreYou() {
        TestLib lib = new TestLib();
        return name() + lib.testFunction(" lib version " , "2.0.0");
    }
}
