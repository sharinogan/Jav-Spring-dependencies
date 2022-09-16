import org.springframework.core.SpringVersion;

class Start {
    public static void main(String[] args) {
        String s = SpringVersion.getVersion();
        System.out.println(s);
    }
}

class Shop {
    String name;
    String contact;
}