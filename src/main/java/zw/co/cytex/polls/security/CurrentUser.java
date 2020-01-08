package zw.co.cytex.polls.security;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import java.lang.annotation.*;
/**
 * @author : Webster Moswa
 * @since : 1/7/20, Tue
 * email: webstermoswa11@gmail.com
 * mobile: 0771407147
 **/


@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {
}
