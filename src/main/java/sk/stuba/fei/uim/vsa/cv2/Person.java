package sk.stuba.fei.uim.vsa.cv2;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedNativeQuery(name = Person.FIND_ALL, query = "select * from PERSON", resultClass = Person.class)
@NamedQuery(name = Person.FIND_BY_ID, query = "select p from Person p where p.id = :id")
public class Person {

    public static final String FIND_ALL = "Person.findAll";
    public static final String FIND_BY_ID = "Person.findById";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer age;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, Integer age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
}
