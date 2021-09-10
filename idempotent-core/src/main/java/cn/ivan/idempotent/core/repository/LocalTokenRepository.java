package cn.ivan.idempotent.core.repository;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yanqi69
 * @date 2021/9/10
 */
public class LocalTokenRepository extends ConcurrentHashMap<String, String> implements TokenRepository {


    private static final String DEFAULT_VALUE = "idempotent";

    @Override
    public void set(String token) {
        super.put(token, DEFAULT_VALUE);
    }

    @Override
    public void set(String token, String value) {
        super.put(token, value);
    }

    @Override
    public boolean del(String token) {
        return super.remove(token) != null;
    }

    @Override
    public boolean putIfAbsent(String token) {
        return super.putIfAbsent(token, DEFAULT_VALUE) != null;
    }
}
