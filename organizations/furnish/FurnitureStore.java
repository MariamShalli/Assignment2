package assignment2.organizations.furnish;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.commons.Person;

import java.util.ArrayList;
import java.util.List;

public class FurnitureStore extends Organization implements Contactable {
    private String email;
    private String phoneNumber;
    private String address;
    private List<Collection> collections;

    public FurnitureStore(String name, String description) {
        super();
        setName(name);
        setDescription(description);
        collections = new ArrayList<>();
    }

    public void addCollection(Collection collection) {
        collections.add(collection);
    }

    public boolean removeCollection(Collection collection) {
        return collections.remove(collection);
    }

    public List<Collection> getCollections() {
        return collections;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}