package prac_12;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, building, apartment;
    public Address(String address) throws Exception
    {
        StringTokenizer st = new StringTokenizer(address, ",; ");
        if(st.countTokens() == 7) {
            country = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            street = st.nextToken();
            house = st.nextToken();
            building = st.nextToken();
            apartment = st.nextToken();
        } else throw new Exception("\"Ошибка, адресс какой-то не такой\"");
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
