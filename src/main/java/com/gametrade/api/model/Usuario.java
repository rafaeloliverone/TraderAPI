package com.gametrade.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private long id;
    private @NotBlank String email;
    private @NotBlank String password;
    private @NotBlank String firstName;
    private @NotBlank String lastName;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductItem> productItems;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<ProductItem> getProductItems() {
        return productItems;
    }

    public void setProductItems(Set<ProductItem> productItems) {
        this.productItems = productItems;
    }
}
