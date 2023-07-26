package javaSE.src.Reflect.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建一个代理
 */
public class ProxyUtil {
    /**
     * 给一个BigStar对象创建代理
     *
     * @param bigStar 需要创建代理的对象
     * @return 创建的代理
     */
    public static Star createProxy(BigStar bigStar) {
        /*
            newProxyInstance()
            参数1 -> 用于指定哪个类加载器，去加载生成的代理类
            参数2 -> 指定接口，这些接口用于生成的代理长什么样，也就是有哪些方法
            参数3 -> 用来指定生成的代理对象要干什么事情
         */
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class,},
                new InvocationHandler() {
                    /**
                     * @param proxy 代理的对象
                     * @param method 要运行的方法
                     * @param args 方法参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        //去找大明星唱歌或跳舞
                        return method.invoke(bigStar, args);
                    }
                }
        );

        return star;
    }
}
