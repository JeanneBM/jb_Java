/*
Napisz adnotację @MyDocumentation, która będzie miała elementy author oraz comment. 
Informacja o tej adnotacji powinna być dostępna w trakcie uruchomienia programu.
*/


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyDocumentation {
    String author() default "Marcin Pietraszek";
    String comment();
}
