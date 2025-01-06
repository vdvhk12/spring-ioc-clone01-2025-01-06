package org.example.framework.ioc.util;

import java.lang.reflect.Constructor;
import lombok.SneakyThrows;

public class ClsUtil {

    @SneakyThrows
    public static <T> Class<T> loadClass(String clsPath) {
        return (Class<T>) Class.forName(clsPath);
    }

    public static <T> T construct(String clsPath, Object[] args) {
        return construct(loadClass(clsPath), args);
    }

    @SneakyThrows
    public static <T> T construct(Class<T> cls, Object[] args) {
        Constructor<T> constructor = getConstructor(cls, args);

        return constructor.newInstance(args);
    }

    public static <T> Constructor<T> getConstructor(Class<T> cls, Object[] args) {
        return (Constructor<T>) cls.getDeclaredConstructors()[0];
    }
}