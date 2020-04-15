package javaEE.design;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * 单例模式
 * 单例模式就是 构造器私有
 * 由静态 类进行初始化时 创建实例
 *
 */
public class singleton {
    public static singleton singleton;
    private singleton(){

    }
    public static synchronized singleton getSingleton(){
        if(singleton==null){
            singleton singleton=new singleton();
        }
        return singleton;
    }
}
