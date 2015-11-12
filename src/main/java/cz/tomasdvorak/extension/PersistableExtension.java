package cz.tomasdvorak.extension;

import javax.ejb.Local;

@Local
public interface PersistableExtension {
    String persist();
}
