package de.testers.lib;

public class XPath {
    private String name;
    private String xpath;
    public XPath(String name,
                 String xpath) {
        this.name = name;
        this.xpath = xpath;
    }
    public String getPath() {
        return xpath;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "'" + name + "'";
    }
}
