package assignment2.organizations.furnish;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.commons.Person;

import java.util.ArrayList;
import java.util.List;

class Collection {
    private String name;
    private String description;
    private List<String> furnitureItems;

    public Collection(String name, String description) {
        this.name = name;
        this.description = description;
        furnitureItems = new ArrayList<>();
    }

    public void addFurnitureItem(String item) {
        furnitureItems.add(item);
    }

    public boolean removeFurnitureItem(String item) {
        return furnitureItems.remove(item);
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

    public List<String> getFurnitureItems() {
        return furnitureItems;
    }
}