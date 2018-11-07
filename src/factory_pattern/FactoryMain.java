package factory_pattern;

public class FactoryMain {
    public static void main(String[] args){
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(shop.getPages());
        System.out.println(blog.getPages());

    }
}
