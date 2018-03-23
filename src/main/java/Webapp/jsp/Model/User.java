package Webapp.jsp.Model;

import javax.persistence.*;

/**
 * Created by easyw on 25-Feb-18.
 */
@Entity(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USER")
    private int idUser;
    @Column(name="NAME")
    private String name;
    @Column(name="USERNAME")
    private String username;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="EMAIL")
    private String email;
    @Column(name="LOCSTION")
    private String idLocation;
    @Column(name="ROLE")
    private String role;
}
