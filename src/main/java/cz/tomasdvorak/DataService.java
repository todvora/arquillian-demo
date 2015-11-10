package cz.tomasdvorak;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class DataService {
    public String getMessage() {
        return "hello";
    }
}
