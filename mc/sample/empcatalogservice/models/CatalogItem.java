package mc.sample.empcatalogservice.models;

public class CatalogItem {
    private String name;
    private String description;
    private int Exp;


    public CatalogItem(String name, String description, int exp) {
        this.name = name;
        this.description = description;
        Exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }
}
