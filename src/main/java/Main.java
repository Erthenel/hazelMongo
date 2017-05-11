import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;


public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
        Map map= (Map)ctx.getBean("usermap");
        User usr = new User("Enes", 29);
        map.put("id-134", usr);
        User usr2 = (User) map.get("id-134");
        System.out.println(usr2.getName());
    }
}