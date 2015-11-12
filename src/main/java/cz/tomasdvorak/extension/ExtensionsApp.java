package cz.tomasdvorak.extension;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;

public class ExtensionsApp {

    /**
     * All available extension beans
     */
    @Inject @Any
    private Instance<Extension> extensions;

    /**
     * All extensions, that have Priority set to HIGH
     */
    @Inject @Priority(Priority.Value.HEIGHT)
    private Instance<Extension> extensionsWithPriorityHight;

    /**
     * All extensions, that implement PersistableExtension interface
     */
    @Inject @Any
    private Instance<PersistableExtension> extensionsWithPersistence;

    public Set<String> getExtensionInfos() {
        Set<String> result = new HashSet<>();
        extensions.forEach(extension -> result.add(extension.getInfo()));
        return result;
    }

    public Set<String> getExtensionsWithPersistence() {
        Set<String> result = new HashSet<>();
        extensionsWithPersistence.forEach(extension -> result.add(extension.persist()));
        return result;
    }

    public Set<String> getExtensionsWithHighPriority() {
        Set<String> result = new HashSet<>();
        extensionsWithPriorityHight.forEach(extension -> result.add(extension.getInfo()));
        return result;
    }
}
