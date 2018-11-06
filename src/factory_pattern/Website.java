package factory_pattern;

import factory_pattern.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages(){
        return this.pages;
    }

    protected abstract void createWebsite();
}
