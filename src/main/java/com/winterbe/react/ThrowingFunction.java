package com.winterbe.react;
import java.util.function.Function;

/**
 * Checked exceptions side effects which make functional programming hard.
 * Here we convert checked to unchecked which is something Spring has done for years to compose
 * interfaces here we are doing it to be able to properly compose functions.
 *
 * https://stackoverflow.com/a/29691649/329496
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface ThrowingFunction<T,R> extends Function<T,R> {

    @Override
    public default R apply(T t) {
        try {
            return throwingApply(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static<T,R> Function<T,R> wrap(ThrowingFunction<T,R> f) {
        return f;
    }

    R throwingApply(T t) throws Exception;
}