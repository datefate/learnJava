package STL;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 无法获取泛型参数的具体T的指代类型
 * 继承了泛型类型的情况下，子类可以获取父类的泛型类型。
 * @author datefate
 * @site create 2020-10-17-下午9:19
 */
public class StartExtendTest {
    public static void main(String[] args) {

        Class<StartInt> startIntClass = StartInt.class;
        Type type = startIntClass.getGenericSuperclass();
        if(type instanceof ParameterizedType){
            ParameterizedType parameterizedType =(ParameterizedType) type;
            Type[] types = parameterizedType.getActualTypeArguments();//可能有多个泛型
            Type firstType = types[0];
            Type secType = types[1];
            Class<?> typeClass = (Class<?>) firstType;
            Class<?> typeClass2 = (Class<?>) secType;
            System.out.println(typeClass);
            System.out.println(typeClass2);
        }
    }

}
