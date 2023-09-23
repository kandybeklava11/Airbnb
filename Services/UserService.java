package Services;

import InterFaces.UserInterface;
import osnova.Address;
import osnova.Announcements;
import osnova.Booking;
import osnova.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService implements UserInterface {
    Scanner scanner = new Scanner(System.in);


    @Override
    public void getAllUser(List<Booking> bookings) {
        for (Booking boo : bookings) {
            for (Announcements annn:boo.getAnnocncement()) {
                System.out.println(annn.getOwner());
            }

        }
    }

    @Override
    public void getAnnouncementsByUserId(List<Booking> bookings) {
        System.out.println("Write user's Id");
        int UserId = scanner.nextInt();
        //List<Booking> bookingList2 = new ArrayList<>();

        for (Booking boo : bookings) {
            for (Announcements anno : boo.getAnnocncement()) {
                for (User use : anno.getOwner()) {
                    if (use.getId() == (UserId)) {
                        System.out.println(anno);
                        // bookingList2.add(boo);
                    } else {
                        System.out.println("Not found");
                    }

                }
            }
        }
    }



    @Override
    public void getAnnouncementsByAddress(List<Booking> bookings) {
        System.out.println("Write announcement's address");
        String foundAddress = scanner.nextLine();
     //   List<Booking> bookingList = new ArrayList<>();

        for (Booking boo : bookings) {
            for (Announcements anno : boo.getAnnocncement()) {
                for (Address addre : anno.getAddress()) {
                    if (addre.getAddresss().equalsIgnoreCase(foundAddress)) {
                        System.out.println(anno);
                   //     bookingList.add(boo);
                    }
                }

            }
        }
        }
    }




