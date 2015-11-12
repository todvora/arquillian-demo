package cz.tomasdvorak.extension.impl;

import cz.tomasdvorak.extension.Extension;

import javax.ejb.Stateless;

@Stateless
public class BasicExtension implements Extension {
    @Override
    public String getInfo() {
        return BasicExtension.class.getSimpleName();
    }
}
