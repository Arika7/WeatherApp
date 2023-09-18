package az.cloud.Weather.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;

    @OneToMany(mappedBy = "owner")
    private List<Location> locations;

    private String password;

    private boolean active;

    public User() {
    }

    public User(String username, List<Location> locations, String password, boolean active) {
        this.username = username;
        this.locations = locations;
        this.password = password;
        this.active=active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", locations=" + locations +
                ", password='" + password + '\'' +
                '}';
    }
}
