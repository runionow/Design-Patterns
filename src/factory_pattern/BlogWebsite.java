package factory_pattern;

import factory_pattern.pages.AboutPage;
import factory_pattern.pages.ContactPage;
import factory_pattern.pages.SearchPage;

public class BlogWebsite extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new SearchPage());
    }
}
