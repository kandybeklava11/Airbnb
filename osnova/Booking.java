package osnova;

import osnova.User;

import java.util.List;

public class Booking {
  //  private List<User> bookdeUser;
    private List<Announcements> annocncement;

    public Booking( List<Announcements> annocncement) {
//        if (bookdeUser == null) {
//            throw new IllegalArgumentException("Booked user cannot be null");
//        }
        if (annocncement == null) {
            throw new IllegalArgumentException("Announcement cannot be null");
        }

       // this.bookdeUser = bookdeUser;
        this.annocncement = annocncement;
    }


  //  public List<User> getBookdeUser() {
     //   return bookdeUser;
   // }

  //  public void setBookdeUser(List<User> bookdeUser) {
    //    this.bookdeUser = bookdeUser;
   // }

    public List<Announcements> getAnnocncement() {
        return annocncement;
    }

    public void setAnnocncement(List<Announcements> annocncement) {
        this.annocncement = annocncement;
    }

    @Override
    public String toString() {
        return "Booking{ annocncement='" + annocncement + '\'' +
                '}';
    }
}
