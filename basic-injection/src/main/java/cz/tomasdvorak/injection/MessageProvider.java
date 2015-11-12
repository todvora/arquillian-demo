package cz.tomasdvorak.injection;

import javax.ejb.Local;

@Local
public interface MessageProvider {
    String getMessage();
}
