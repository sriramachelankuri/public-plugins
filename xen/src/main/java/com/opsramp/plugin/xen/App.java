package com.opsramp.plugin.xen;

import com.opsramp.plugin.core.Plugin;
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
        return name();
    }
}
