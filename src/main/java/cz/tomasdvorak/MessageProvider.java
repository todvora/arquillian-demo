package cz.tomasdvorak;

import javax.ejb.Local;

@Local
public interface MessageProvider {
    String getMessage();
}
