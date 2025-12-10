package com.bash;

import java.util.Objects;

public class Address {

    private String street;
    private String city;
    private String zipcode;
    private Province province;

    public Address(String street, String city, String zipcode, Province province) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street)
                && Objects.equals(city, address.city)
                && Objects.equals(zipcode, address.zipcode)
                && province == address.province;
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zipcode, province);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", province=" + province +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
