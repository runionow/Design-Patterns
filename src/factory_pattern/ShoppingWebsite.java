package factory_pattern;

import factory_pattern.pages.CartPage;
import factory_pattern.pages.ItemPage;
import factory_pattern.pages.SearchPage;

public class ShoppingWebsite extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new SearchPage());
        pages.add(new ItemPage());
        pages.add(new CartPage());
    }
}
