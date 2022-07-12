class Time {
  public static void main (String[] args){
    System.out.println("Exercise 2.3 on page 31:");

    int hour;
    int minute;
    int second;

    hour = 11;
    minute = 17;
    second = 30;

    double minute2 = 59.0;
    System.out.println("The current time is " + hour + ":" + minute + ":" + second + ".");
    // System.out.print(hour);
    // System.out.print(":");
    // System.out.print(minute);
    // System.out.print(":");
    // System.out.print(second);
    // System.out.println(".");

    System.out.print("The number of minutes since midnight: ");
    System.out.println(hour * 60 + minute);

    System.out.print("The fraction of an hour that has passed: ");
    System.out.println(minute / 60);

    System.out.print("The percentage of an hour that has passed: ");
    System.out.println(minute * 100 / 60);

    System.out.print("Fraction of an hour that has passed: ");
    System.out.println(minute2 / 60.0);



  }
}