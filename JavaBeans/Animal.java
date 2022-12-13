package JavaBeans;

import java.io.Serializable;
 // Serializable is basically a label for Java to indicate that this class can be written to databases/files
public class Animal implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
