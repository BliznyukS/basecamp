package com.globallogic.basecamp.model;

/**
 * Address is a representation of the {@link com.globallogic.basecamp.model.Student Student} home address.
 */
public class Address {

    private final String country;

    private final String city;

    private final String street;

    private final Integer houseNumber;

    Address(String country, String city, String street, Integer houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }


    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public Integer getHouseNumber() {
        return this.houseNumber;
    }

    public static class AddressBuilder {
        private String country;
        private String city;
        private String street;
        private Integer houseNumber;

        AddressBuilder() {
        }

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setHouseNumber(Integer houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Address build() {
            return new Address(country, city, street, houseNumber);
        }

        public String toString() {
            return "Address.AddressBuilder(country=" + this.country + ", city=" + this.city + ", street=" + this.street + ", houseNumber=" + this.houseNumber + ")";
        }
    }
}
