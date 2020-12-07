package io.github.fimi2008.swagger.core;

import io.github.fimi2008.swagger.config.SwaggerConfig;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.*;

/**
 * 启动swagger注解
 * <p>
 *
 * @author wangxiang
 * created on 2020/12/4 14:49
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@EnableSwagger2
@Import({SwaggerConfig.class})
public @interface EnableSwagger {
}
