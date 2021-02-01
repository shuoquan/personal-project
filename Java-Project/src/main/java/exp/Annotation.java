package exp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
//@Target(value = ElementType.TYPE)
public @interface Annotation {
  String name() default "张三";
  int age();
}
