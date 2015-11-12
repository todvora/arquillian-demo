package cz.tomasdvorak.extension;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Priority {
    Value value();

    enum Value {
        LOW,
        DEFAULT,
        HEIGHT
    }
}


