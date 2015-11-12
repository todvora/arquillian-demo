package cz.tomasdvorak.extension.impl;

import cz.tomasdvorak.extension.Extension;
import cz.tomasdvorak.extension.PersistableExtension;
import cz.tomasdvorak.extension.Priority;

import javax.ejb.Stateless;

@Stateless
@Priority(Priority.Value.DEFAULT)
public class ExtensionWithPersistence implements Extension, PersistableExtension {
    @Override
    public String getInfo() {
        return ExtensionWithPersistence.class.getSimpleName();
    }

    @Override
    public String persist() {
        return ExtensionWithPersistence.class.getSimpleName();
    }
}
