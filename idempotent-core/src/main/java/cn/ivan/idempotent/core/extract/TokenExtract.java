package cn.ivan.idempotent.core.extract;

/**
 * @author yanqi69
 * @date 2021/9/10
 */
public interface TokenExtract <T,R>{

    T extract();
}
