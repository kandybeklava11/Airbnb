package InterFaces;

import osnova.Announcements;
import osnova.Booking;

import java.sql.Types;
import java.util.List;

public interface AnnocumentsInterface {
    void createAnnouncement(List<Booking> bookings);
    void deleteAnnouncementById(List<Booking> bookings);
    void updateAnnouncementById(List<Booking> bookings);
    void getAnnouncementById(List<Booking> bookings);
    void getAllAnnouncements(List<Booking> bookings);
    void sortAnnouncementsByRating(List<Booking> bookings);
    void sortByPrice(List<Booking> bookings);
    void filterByType(List<Booking> bookings);
}
