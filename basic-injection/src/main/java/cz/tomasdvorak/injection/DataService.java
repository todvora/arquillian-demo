package cz.tomasdvorak.injection;

import javax.ejb.Local;

@Local
public interface DataService {
    String getResponse();
}
