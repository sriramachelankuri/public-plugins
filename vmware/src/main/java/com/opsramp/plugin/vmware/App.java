package com.opsramp.plugin.vmware;

import com.opsramp.plugin.core.Plugin;
import com.opsramp.shared.lib.TestLib;
/**
 * Hello world!
 */
public class App implements Plugin {

    @Override
    public String name() {
        return "vmware";
    }

    @Override
    public String version() {
        return "version";
    }

    @Override
    public String whoAreYou() {
        TestLib lib = new TestLib();
        return name() + lib.testFunction(" lib version 1.0.0");
    }
}
