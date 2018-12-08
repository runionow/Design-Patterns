package factory_pattern;

import factory_pattern.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public final boolean security(){
        return true;
    }

    public final boolean copyright(){
        return true;
    }

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages(){
        return this.pages;
    }

    protected abstract void createWebsite();
}
