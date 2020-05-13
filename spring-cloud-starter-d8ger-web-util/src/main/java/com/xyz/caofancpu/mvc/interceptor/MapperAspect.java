/*
 * Copyright 2016-2020 the original author
 *
 * @D8GER(https://github.com/caofanCPU).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xyz.caofancpu.mvc.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Mapper切面
 *
 * @author D8GER
 */
@Aspect
@Component
public class MapperAspect {

    @Around(value = "execution(* com.xyz.*.mapper..*Mapper.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjp)
            throws Throwable {
        Object result;
        MethodSignature joinPointObject = (MethodSignature) pjp.getSignature();
        result = pjp.proceed();
        return result;
    }
}
