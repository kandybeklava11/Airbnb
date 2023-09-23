import Services.AnnouncementsService;
import Services.BookingService;
import Services.UserService;
import osnova.Address;
import osnova.Announcements;
import osnova.Booking;
import osnova.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            User user = new User("Ulan", "Abirov", "abirov@email.com", LocalDate.of(2023, 5, 23));
            User user2 = new User("Japar", "Nurgojoev", "nurgojoev@email.com", LocalDate.of(2022, 6, 22));
            User user3 = new User("Nurmat", "Abdurashidov", "abdurashidov@email.com", LocalDate.of(2021, 7, 21));
            User user4 = new User("Alihan", "Aslanov", "aslanov@email.com", LocalDate.of(2020, 8, 20));
            User user5 = new User("Sapar", "Dairov", "dairov@email.com", LocalDate.of(2019, 9, 19));

            List<User> userList = new ArrayList<>();
            userList.add(user);
            List<User> userList2 = new ArrayList<>();
            userList2.add(user2);
            List<User> userList3 = new ArrayList<>();
            userList3.add(user3);
            List<User> userList4 = new ArrayList<>();
            userList4.add(user4);
            List<User> userList5 = new ArrayList<>();
            userList5.add(user5);

            Address address = new Address("Kyrgyzstan", "Ysyk-Kul", "Duishonova 145");
            Address address2 = new Address("USA", "California", "Mily 85");
            Address address3 = new Address("Kyrgyzstan", "Bishkek", "Maldybaev 1");
            Address address4 = new Address("Kazakhstan", "Taraz", "Dauletova 34");
            Address address5 = new Address("Russia", "Petrovsk", "Omsk 210");

            List<Address> addressList = new ArrayList<>();
            addressList.add(address);
            List<Address> addressList2 = new ArrayList<>();
            addressList2.add(address2);
            List<Address> addressList3 = new ArrayList<>();
            addressList3.add(address3);
            List<Address> addressList4 = new ArrayList<>();
            addressList4.add(address4);
            List<Address> addressList5 = new ArrayList<>();
            addressList5.add(address5);

            Announcements announcements = new Announcements("house for rent", LocalDate.of(1990, 2, 11), "house for rent", "House", userList, "No", 6, 600, addressList);
            Announcements announcements2 = new Announcements("Apartment for rent", LocalDate.of(1994, 3, 14), "Apartment for rent", "Apartment", userList2, "no", 10, 300, addressList2);
            Announcements announcements3 = new Announcements("house for rent", LocalDate.of(1960, 5, 25), "house for rent", "House", userList3, "no", 7, 1000, addressList3);
            Announcements announcements4 = new Announcements("Apartment for rent", LocalDate.of(2000, 8, 30), "Apartment for rent", "Apartment", userList4, "no", 4, 3000, addressList4);
            Announcements announcements5 = new Announcements("house for rent", LocalDate.of(2013, 6, 21), "house for rent", "House", userList5, "no", 8, 1500, addressList5);

            List<Announcements> announcementsList = new ArrayList<>();
            announcementsList.add(announcements);
            announcementsList.add(announcements2);
            announcementsList.add(announcements3);
            announcementsList.add(announcements4);
            announcementsList.add(announcements5);

            System.out.println(announcementsList);
            Scanner scan  = new Scanner(System.in);

            List<Booking>bookings=new ArrayList<>();
            bookings.add(new Booking(announcementsList));

            AnnouncementsService announcementsService=new AnnouncementsService();
            BookingService bookingService=new BookingService();
            UserService userService=new UserService();

            int x=0;
            do {
                    System.out.println("1. Добавить свое объявление\n" +
                            "2.  Удалить объявление по его айди\n" +
                            "3.  Обновление объявление\n" +
                            "4.  Найти объявление по его айди\n" +
                            "5.  Получить все объявления\n" +
                            "6.  Сортировка объявлений по их рейтингам\n" +
                            "7.  Сортировка объявление по их цене\n" +
                            "8.  Фильтр по типу\n" +
                            "9.  Забронировать дом/квартиру\n" +
                            "10. Разбронировать дом/квартиру\n" +
                            "11. Вывести всех пользователей\n" +
                            "12. Вывести дом/квартиру по айди пользователя\n" +
                            "13. Вывести дом/квартиру по его аддресу"+"\n" +
                            "14. Выйти");

                    x = scan.nextInt();
                    switch (x) {
                            case 1:
announcementsService.createAnnouncement(bookings);
                                    break;
                            case 2:
announcementsService.deleteAnnouncementById(bookings);
                                    break;
                            case 3:
announcementsService.updateAnnouncementById(bookings);
                                    break;
                            case 4:
announcementsService.getAnnouncementById(bookings);
                                    break;
                            case 5:
announcementsService.getAllAnnouncements(bookings);
                                    break;
                            case 6:
announcementsService.sortAnnouncementsByRating(bookings);
                                    break;
                            case 7:
announcementsService.sortByPrice(bookings);
                                    break;
                            case 8:
announcementsService.filterByType(bookings);
                                    break;
                            case 9:
bookingService.bookAnnouncement(bookings);
                                    break;
                            case 10:
bookingService.unBookAnnouncement(bookings);
                                    break;
                            case 11:
userService.getAllUser(bookings);
                                    break;
                            case 12:
userService.getAnnouncementsByUserId(bookings);
                                    break;
                            case 13:
userService.getAnnouncementsByAddress(bookings);
                                    break;
                            default:
                                    System.out.println("Existing...");
                    }
            }while (x!=14);
            }
    }

