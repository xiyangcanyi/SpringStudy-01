package com.zyp.pojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.zyp.pojo.User">
//组件component   放在类上，说明这个类被spring管理了，就是bean
//
@Component
//@Scope("singleton")
public class User {
//    public String name="赵耀鹏";   显式注入
        // <bean id="user" class="com.zyp.pojo.User">
//      相当于等价这一句  <property name="name"  value="zhaoyaopeng"/>
//    </bean>
       // @Value("zhaoyaopeng")
        public String name;
        @Value("zyp2")
        public void setName(String name){
                this.name=name;
        }

}
