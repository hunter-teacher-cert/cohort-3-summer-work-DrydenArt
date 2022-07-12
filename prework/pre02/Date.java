class Date {
  public static void main (String[] args){
    
  System.out.println("Exercise 2.2 on page 30:");


int day;
int month;
int year;
String month2 = "February";
String day2 = "Monday";

day = 21;
month = 02;
year = 2022;
//after much trial and error, I realized I had my print statements ahead of my variables so the compiler couldn't read my values
System.out.print("The date is ");
System.out.print(day2 +" ");
System.out.print(month);
System.out.print("/");
System.out.print(day);
System.out.print("/");
System.out.println(year);

System.out.println("American Format: ");
System.out.print(day2 +", ");
System.out.print(month2);
System.out.print(" ");
System.out.print(day);
System.out.print(", ");
System.out.println(year);

System.out.println("European Format: ");
System.out.print(day2 +" ");
System.out.print(day);
System.out.print(" ");
System.out.print(month2);
System.out.print(" ");
System.out.println(year);

  }

}