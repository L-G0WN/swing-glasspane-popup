package raven.drawer.component.header;

import javax.swing.*;

public class SimpleHeaderData {

    protected Icon icon;
    protected String title;
    protected String description;

    public SimpleHeaderData setIcon(Icon icon) {
        this.icon = icon;
        return this;
    }

    public SimpleHeaderData setTitle(String title) {
        this.title = title;
        return this;
    }

    public SimpleHeaderData setDescription(String description) {
        this.description = description;
        return this;
    }
}
