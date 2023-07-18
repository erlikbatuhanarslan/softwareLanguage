package kodlama.io.softwareLanguage.Entities.Concrete;

import java.util.ArrayList;
import java.util.List;

public class SoftwareLanguage {private int id;
    private String name;
    private List<String> technology;

    public SoftwareLanguage() {

    }

    public SoftwareLanguage(int id, String name) {
        this.setId(id);
        this.setName(name);
        this.setTechnology(new ArrayList<String>());
    }

    public void addTechnology(String technology) {
        this.getTechnology().add(technology);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechnology() {
        return technology;
    }

    public void setTechnology(List<String> technology) {
        this.technology = technology;
    }
}
