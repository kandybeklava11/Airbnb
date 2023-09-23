package osnova;

import java.awt.*;

public class Address {
    private static int idd=1;
    private int idAddress;
    private String province;
    private String region;
    private String address;

    public Address(String province, String region, String address) {
        if (province == null) {
            throw new IllegalArgumentException("Province cannot be null or empty");
        }
        if (region == null) {
            throw new IllegalArgumentException("Region cannot be null or empty");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        this.idAddress=idd;
        this.province = province;
        this.region = region;
        this.address = address;
        idd++;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddresss() {
        return address;
    }

    public void setAddresss(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "address="+address+"\nAddress or Location - " +
                "idAddress=" + idAddress +
                ", province='" + province +
                ", region='" + region;

    }
}