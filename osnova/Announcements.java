package osnova;


import javax.lang.model.util.Types;
import java.time.LocalDate;
import java.util.List;

public class Announcements {
    private static int idd = 1;
    private int id;
    private String descripion;
    private LocalDate data;
    private String title;
    private String types;
    private List<User> owner;
    private String isBooked;
    private int rating;
    private int price_per_day;
    private List<Address> address;

    public Announcements(String descripion, LocalDate data, String title, String types, List<User> owner, String isBooked, int rating, int price_per_day, List<Address> address) {
        if (descripion == null) {
            throw new IllegalArgumentException("Описание не может быть пустым");
        }
        if (title == null) {
            throw new IllegalArgumentException("Заголовок не может быть пустым");
        }
        if (owner == null) {
            throw new IllegalArgumentException("Владелец объявления не может быть null");
        }
        if (rating < 0) {
            throw new IllegalArgumentException("Рейтинг должен быть в диапазоне от 1 до 5");
        }
        if (price_per_day <= 0) {
            throw new IllegalArgumentException("Цена за день должна быть положительным числом");
        }

        this.id = idd++;
        this.descripion = descripion;
        this.data = data;
        this.title = title;
        this.types = types;
        this.owner = owner;
        this.isBooked = isBooked;
        this.rating = rating;
        this.price_per_day = price_per_day;
       this.address=address;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Announcements.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public List<User> getOwner() {
        return owner;
    }

    public void setOwner(List<User> owner) {
        this.owner = owner;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String isBooked() {
        return isBooked;
    }

    public void setBooked(String booked) {
        isBooked = booked;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    @Override
    public String toString() {
        return "________________________________________________________________________________________________________"+"\nAnnouncements - " +
                "id: " + id + "\n" +
                "Descripion: " + descripion + "\n" +
                "Data: " + data + "\n" +
                "Title: " + title + "\n" +
                "Types: " + types +
                ", IsBooked: " + isBooked +
                ", Rating: " + rating + "\n" +
                "Owner: " + owner  + "\n" +
                "Price_per_day - " + price_per_day + "\n" +
                "Address: " + address + "\n";
    }
}
