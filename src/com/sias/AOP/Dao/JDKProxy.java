package com.sias.AOP.Dao;
//有接口的方式去增强方法
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2022-01-13 13:33
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={UserDao.class};

        UserImpl user=new UserImpl();
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(user));
        String  result = dao.cat1("djsoldj");
        System.out.println("result:"+result);

        //上面的方法只是一个调用的最终过程，其中想要实现的具体过程还是需要写上

        //1.参数分析
        // 至于为什么这样写，那就分析一下，第一个参数，是自己的类要被加载，先加载自己，在加载别的类，所谓
        /*所谓的第二个参数的原因是自己的类加载完之后，在去加载别的类，那就是需要增强的功能的那个类的父类，
        写的是父类，子类没有写，至于为什么没有写子类的原因是，写的父类
        先把父类进来之后，就可以在实现功能增强上面，具体到哪一个子类，在
        子类上写实现的具体方法，愿因有两点，第一点就是，先架加载父类进来，
        最后在选择要增强那一个子类的时候，好选则，第二点的原因是，父类没有方法体
        不可以增强，具体的写法是上面的规则，功能是加载父类，至于第三个参数的写法就是，自己加载
        完了，要加载的类也完了，那就去实现所要加载类的功能实现，这个实现的过程也是需要去创建一个类的，去实现接口
        InvocationHandler，至于为什么去实现这个接口的原因是，因为这个接口可以去增加功能，那个实现这个接口的类
        需要写在执行方法的后面，也就是第三个参数
        *
        * */

    }
}
class UserDaoProxy implements InvocationHandler{

    //2.创建是谁的代理对象，把这个对象传递过来
    /*
    * 本来是
    * 传递的是UserImpl，后面的参数可以是任何字符，但是为了方便就写上了最中的类
    * object，参数写的是obj*/
    private Object obj;
    public UserDaoProxy (Object obj){
        this.obj=obj;
    }

    //3.增强的逻辑代码区域
    /*
    *
    * 增强的是那一个方法也是有规定的
    * 第一个参数是代理对象
    * 第二个参数是，你要代理的那个对象方法
    * 第三个是方法中的参数
    * 下面写的都是模板，还需要在具体到哪一个方法*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法执行之前，method.getName是获取这个方法的名字是什么，假如说是第一个
        //那就是获取这个方法的名字
        System.out.println("方法之前执行...."+method.getName()+"   传递的参数..."+ Arrays.toString(args));
        //方法执行中(就是被增强对象方法的输出)
        Object res = method.invoke(obj, args);

        //方法执行之后
        System.out.println("方法执行之后输出....."+obj);
        return res;
    }
}
