public class Person {
      private String name;
      private String email;
      private String phoneNumber;
      public Person(String theName){
         this("venky@gmail.com","080 123-4567");
         this.name = theName;
      }
      public Person(String theEmail,String thePhoneNumber){
         this.email = theEmail;
         this.phoneNumber=thePhoneNumber;
      }
      public Person(String theName,String theEmail,String thePhoneNumber){
         this.name = theName;
         this.email = theEmail;
         this.phoneNumber=thePhoneNumber;
      }
      public Person(){
         System.out.println("DEFAULT CONSTRUCTOR");
      }
      public String getName() { return this.name;}
      public String getEmail() { return this.email;}
      public String getPhoneNumber() { return this.phoneNumber;}
      public void setName(String theName) { this.name = theName;}
      public void setEmail(String theEmail) {this.email = theEmail;}
      public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
      public String toString(){
         return this.name + " " + this.email + " " + this.phoneNumber;
      }
      public static void main(String[] args){
         System.out.println("NAME \t EMAIL \tPHONE NUMBER");
         Person p1 = new Person("venky");
         System.out.println(p1+"\n");
         Person p2 = new Person("sai");
         p2.setEmail("sai@gmail.com");
         p2.setPhoneNumber("404 123-4567");
         System.out.println(p2+"\n");
         Person p3 = new Person("karthick","karthick@gmail.com","020 123-4567");
         System.out.println(p3+"\n");
         Person p4 = new Person();
         System.out.println(p4);
      }
}