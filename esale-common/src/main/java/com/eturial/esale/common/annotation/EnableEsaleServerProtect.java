package com.eturial.esale.common.annotation;

import com.eturial.esale.common.configure.EsaleServerProtectConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EsaleServerProtectConfigure.class)
public @interface EnableEsaleServerProtect {

}
