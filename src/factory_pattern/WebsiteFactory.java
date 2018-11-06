package factory_pattern;

public class WebsiteFactory {

    private WebsiteFactory(){}

    public static Website getWebsite(WebsiteType website){
        switch (website) {
            case BLOG: {
                return new BlogWebsite();
            }
            case SHOP: {
                return new ShoppingWebsite();
            }
            default: {
                throw new RuntimeException("Please choose a valid website");
            }
        }

    }
}
