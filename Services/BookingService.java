package Services;

import InterFaces.BookingInterface;
import osnova.Announcements;
import osnova.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingService implements BookingInterface {
    Scanner scanner=new Scanner(System.in);



    @Override
    public void bookAnnouncement(List<Booking> bookings) {
        System.out.println("Write announcement's Id");
        int founId=scanner.nextInt();
        List<Booking> bookAnn=new ArrayList<>();
        for (Booking boo:bookings) {
            for (Announcements enno:boo.getAnnocncement()) {
                if(enno.getId()==founId){
                    enno.setBooked("Yes");
                    //bookAnn.add(boo);
                    System.out.println(enno);
                }else {
                    System.out.println("Not found");
                }
            }

        }

    }

    @Override
    public void unBookAnnouncement(List<Booking> bookings) {
        System.out.println("Write announcement's Id");
        int founId = scanner.nextInt();
        for (Booking boo : bookings) {
            for (Announcements enno : boo.getAnnocncement()) {
                if (enno.getId() == founId) {
                   enno.setBooked("No");
                    System.out.println("Successfully unbooked");
                    System.out.println(enno);
                } else {
                    System.out.println(" Not found");
                }
            }

        }
    }
}
