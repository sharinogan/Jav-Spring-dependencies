import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.SpringVersion;


class Start {
    public static void main(String[] args) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        
        // Assume that we are at the building. it has 3 floor.
        context.registerBean("first", Shop.class);
        context.registerBean("second", Shop.class);
        context.registerBean("third", Shop.class);
        context.refresh();
        
        Shop s;
        s = context.getBean("first", Shop.class);
        s.name = "Whitecat dessert";
        
        s = context.getBean("second", Shop.class);
        s.name = "Hamburger Quickly";
        
        s = context.getBean("third", Shop.class);
        s.name = "iMovie Studio";
        
        String[] all = context.getBeanDefinitionNames();
        for(int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        
        // version 1
        s = context.getBean("first", Shop.class);
        System.out.println(s.name); // Whitecat dessert
        
        // version 2
        s = (Shop)context.getBean("second");
        System.out.println(s.name); // Hamburger Quickly
    }
}

class Shop {
    String name;
    String contact;
}