import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.SpringVersion;


class Start {
    public static void main(String[] args) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean("first", Shop.class);
        context.registerBean("second", Shop.class);
        context.registerBean("third", Shop.class);
        context.refresh();
        
//        Shop s = context.getBean(Shop.class);
//        s.name = "iCoffee";
//        s.contact = "Mr.Bill, 0946573928";       
//        System.out.println(s.name);
        
        String[] all = context.getBeanDefinitionNames();
        for(int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}

class Shop {
    String name;
    String contact;
}