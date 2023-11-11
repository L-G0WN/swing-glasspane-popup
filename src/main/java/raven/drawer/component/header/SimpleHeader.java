package raven.drawer.component.header;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class SimpleHeader extends JPanel {

    private final SimpleHeaderData simpleHeaderData;

    public SimpleHeader(SimpleHeaderData simpleHeaderData) {
        this.simpleHeaderData = simpleHeaderData;
        init();
    }

    private void init() {
        setLayout(new MigLayout("wrap,insets 3 10 3 10,fill,gap 3"));

        profile = new JLabel(simpleHeaderData.icon);
        profile.putClientProperty(FlatClientProperties.STYLE,"" +
                "background:$Component.borderColor");
        labelTitle = new JLabel(simpleHeaderData.title);
        labelDescription = new JLabel(simpleHeaderData.description);
        labelDescription.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:-1;" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        add(profile);
        add(labelTitle);
        add(labelDescription);
    }

    private JLabel profile;
    private JLabel labelTitle;
    private JLabel labelDescription;
}
