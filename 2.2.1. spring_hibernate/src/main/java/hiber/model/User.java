package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

//   @OneToOne(fetch = FetchType.LAZY)
//   @MapsId("id")
//   @PrimaryKeyJoinColumn
//   @OneToOne(cascade = CascadeType.ALL)
   //aaaaaaaa suka dad kak tebya ebat
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "id")
   private Car car;

   /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "")
    */

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;


   public User() {}
   
   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              ", car=" + car +
              '}' + '\n';
   }
}
