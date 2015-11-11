package cz.tomasdvorak;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class DataServiceImpl implements DataService {

    @Inject
    MessageProvider messageProvider;


    public String getResponse() {
        return messageProvider.getMessage();
    }
}
