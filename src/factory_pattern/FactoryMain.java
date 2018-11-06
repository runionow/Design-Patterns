package factory_pattern;

public class FactoryMain {
    public static void main(String[] args){
        Website shop = WebsiteFactory.getWebsite("shop");
        Website blog = WebsiteFactory.getWebsite("blog");

        System.out.println(shop.getPages());
        System.out.println(blog.getPages());

    }
}
