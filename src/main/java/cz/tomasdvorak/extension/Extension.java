package cz.tomasdvorak.extension;

import javax.ejb.Local;

@Local
public interface Extension {
    String getInfo();
}
