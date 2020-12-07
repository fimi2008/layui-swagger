# layui-swagger
## 项目描述
  参考layui-swagger项目进行优化；
  
  ![首页](https://github.com/fimi2008/layui-swagger/raw/master/assets/index.jpg)
  ![接口定义页](https://github.com/fimi2008/layui-swagger/raw/master/assets/define.jpg)
  ![调试页](https://github.com/fimi2008/layui-swagger/raw/master/assets/check.jpg)

 layui 部署在服务上，即插即用，非常方便：

> 请求地址：`http://localhost:8080`



## 项目结构
* swagger-core： swagger核心组件封装；

* swagger-ui-layer：swagger UI页面替代swagger-ui；

* spring-boot-demo：基于spring-boot的演示案例。



## 使用说明(spring boot)

1. pom依赖

   ```xml
           <dependency>
               <groupId>io.github.fimi2008</groupId>
               <artifactId>swagger-core</artifactId>
               <version>1.0.0</version>
           </dependency>
   ```


2.  spring boot项目启动项添加：

```java
@EnableSwagger
```

3. application.yml配置 (可选项配置)

```yml
# Swagger设置
swagger:
  enable: true
  version: 1.0
  title: 测试项目
  description: 测试项目，查询demo
  contact:
    name: wangxiang
    url: 暂无
    mail: vonshine15@163.com
```

4. 页面访问：`http://{host:localhost}:{port:8080}`
5. 修改首页图标：根目录/logo.png（将图片地址映射到根目录下进行访问）



 ## 特点

**简单配置，即插即用，非常方便** 



## 鸣谢

[caspar-chen/swagger-ui-layer](https://github.com/caspar-chen/swagger-ui-layer)

   