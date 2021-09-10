package cn.ivan.idempotent.core.repository;

/**
 *  token 存储 接口
 * @author yanqi69
 * @date 2021/9/10
 */
public interface TokenRepository {


    void set(String token);

    void set(String token,String value);


    boolean del(String token);

    boolean putIfAbsent(String token);


}
