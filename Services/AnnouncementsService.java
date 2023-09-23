package Services;

import InterFaces.AnnocumentsInterface;
import osnova.Address;
import osnova.Announcements;
import osnova.Booking;
import osnova.User;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AnnouncementsService implements AnnocumentsInterface {
    Scanner scanner=new Scanner(System.in);


    @Override
    public void createAnnouncement(List<Booking> bookings) {
        System.out.println("Write your first name");
        String FName=scanner.nextLine();
        System.out.println("Write your last name ");
        String LName=scanner.nextLine();
        System.out.println("Write your email");
        String email=scanner.nextLine();
        System.out.println("Write registered date");

        System.out.println("Enter the date (YYYYMMDD):");
        int dat=scanner.nextInt();
        String dateStringg = String.format("%08d",dat);
        DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date2 = LocalDate.parse(dateStringg, formatterr);

        System.out.println("Write announcement's descripion");
        String dess=scanner.nextLine();
        String d=scanner.nextLine();
        System.out.println("Write announcement's data");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (YYYYMMDD):");
        int inputDate = scanner.nextInt();
        String dateString = String.format("%08d", inputDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = LocalDate.parse(dateString, formatter);

        System.out.println("Write province");
        String povince=scanner.nextLine();
        String f=scanner.nextLine();
        System.out.println("Write region ");
        String region=scanner.nextLine();
        System.out.println("Write address");
        String address=scanner.nextLine();

        System.out.println("Write announcement's title ");
        String title=scanner.nextLine();
        System.out.println("Write announcement's type");
        String type=scanner.nextLine();
        //System.out.println("Write announcement's owner");
       // String owner=scanner.nextLine();
        System.out.println("Write, announcement booked or unbooked");
        String booked=scanner.nextLine();
        System.out.println("Write announcement's rating");
        int rating=scanner.nextInt();
        System.out.println("Write announcement's price");
        int price=scanner.nextInt();
        //System.out.println("Write announcement's address");
       // String address=scanner.nextLine();
        User user=new User(FName,LName,email,date2);
        List<User>userList=new ArrayList<>();
        userList.add(user);
        Address address1=new Address(povince,region,address);
       List<Address>addressList=new ArrayList<>();
       addressList.add(address1);

        Announcements announcements=new Announcements(dess,date,title,type,userList,booked,rating,price,addressList);
        for (Booking boo:bookings) {
            List<Announcements>announcementsList=boo.getAnnocncement();
               announcementsList.add(announcements);
            System.out.println("Successfully added");
            System.out.println(announcements);
            }
        }


    @Override
    public void deleteAnnouncementById(List<Booking> bookings) {
        System.out.println("Write announcement's ID");
        int id = scanner.nextInt();
        boolean found = false;

        for (Booking booking : bookings) {
            Iterator<Announcements> iterator = booking.getAnnocncement().iterator();
            while (iterator.hasNext()) {
                Announcements announcement = iterator.next();
                if (announcement.getId() == id) {
                    iterator.remove();
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Not found");
        }
    }


    @Override
    public void updateAnnouncementById(List<Booking> bookings) {
        System.out.println("Write announcement's ID");
        int Idd=scanner.nextInt();
        for (Booking boo:bookings) {
            for (Announcements an:boo.getAnnocncement()) {

                if (an.getId()==Idd){
                    System.out.println("Successfully updated");
                    System.out.println(an);
                }
            }
        }
    }

    @Override
    public void getAnnouncementById(List<Booking> bookings) {
        System.out.println("Write announcement's ID ");
        int ID=scanner.nextInt();
        for (Booking bb:bookings) {
            for (Announcements ann: bb.getAnnocncement()) {
                if(ann.getId()==ID){
                    System.out.println(ann);
                }else{
                    System.out.println("Not found");
                }
            }
        }


    }

    @Override
    public void getAllAnnouncements(List<Booking> bookings) {
        for (Booking boo:bookings) {
            System.out.println(boo);
        }

    }

    @Override
    public void sortAnnouncementsByRating(List<Booking> bookings) {
        for (Booking booking : bookings) {
            List<Announcements> announcements = booking.getAnnocncement();
            Collections.sort(announcements, new Comparator<Announcements>() {
                @Override
                public int compare(Announcements a1, Announcements a2) {
                    return Integer.compare(a1.getRating(), a2.getRating());
                }
            });
            for (Announcements announcement : announcements) {
                System.out.println(announcement);
            }
        }
    }

    @Override
    public void sortByPrice(List<Booking> bookings) {
        for (Booking booking : bookings) {
            List<Announcements> announcements = booking.getAnnocncement();
            Collections.sort(announcements, new Comparator<Announcements>() {
                @Override
                public int compare(Announcements a1, Announcements a2) {
                    return Integer.compare(a1.getPrice_per_day(), a2.getPrice_per_day());
                }
            });
            for (Announcements announcement : announcements) {
                System.out.println(announcement);
            }
        }

    }

    @Override
    public void filterByType(List<Booking> bookings) {
        System.out.println("Write type");
        String type=scanner.nextLine();
        for (Booking boo:bookings) {
            for (Announcements booo:boo.getAnnocncement()) {
                if (booo.getTypes().equalsIgnoreCase(type)){
                    System.out.println(booo);
                }else{
                    System.out.println(" Not found");
                }
            }
        }
    }
}
