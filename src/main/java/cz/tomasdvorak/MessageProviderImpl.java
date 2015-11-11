package cz.tomasdvorak;

import javax.ejb.Stateless;

@Stateless
public class MessageProviderImpl implements MessageProvider {

    @Override
    public String getMessage() {
        return "hello";
    }
}
