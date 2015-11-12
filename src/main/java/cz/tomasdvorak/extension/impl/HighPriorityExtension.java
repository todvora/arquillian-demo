package cz.tomasdvorak.extension.impl;

import cz.tomasdvorak.extension.Extension;
import cz.tomasdvorak.extension.Priority;

import javax.ejb.Stateless;

@Stateless
@Priority(Priority.Value.HEIGHT)
public class HighPriorityExtension implements Extension {
    @Override
    public String getInfo() {
        return HighPriorityExtension.class.getSimpleName();
    }

}
