
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Start {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("start.xml");
        
        Shop s = context.getBean("first", Shop.class);
        System.out.println(s.name);
        
        s = (Shop)context.getBean("third");
        System.out.println(s.name);
        
        String[] all = context.getBeanDefinitionNames();
        for(int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}

class Shop {
    public String name;
    String contact;
    
    public void setName(String s) {
        name = s;
    }
    
    public void setContact (String x) {
        contact = x;
    }
}

class Whatever { }