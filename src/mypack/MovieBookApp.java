package mypack;
class BookMySeat
{
 int totalSeats=10;
 synchronized void bookseats(int seats)
 {
  if(totalSeats>=seats)
  {
   System.out.println(seats+" seats Booked sucessfully");
   totalSeats=totalSeats-seats;
   System.out.println("Total seats: "+totalSeats);
  }
  else {
   System.out.println("sorry seats cannot be booked");
   System.out.println("Total seats: "+totalSeats);
  }
 }
}
public class MovieBookApp extends Thread{
 static BookMySeat b;
 int seats;
 public void run()
 {
   b.bookseats(seats);
 }
 public static void main(String[] args) {
  b=new BookMySeat();
  MovieBookApp faiyaz=new MovieBookApp();
   faiyaz.seats=7;
  faiyaz.start();
  MovieBookApp mohammed=new MovieBookApp();
  mohammed.seats=6;
  mohammed.start();
 }
}
