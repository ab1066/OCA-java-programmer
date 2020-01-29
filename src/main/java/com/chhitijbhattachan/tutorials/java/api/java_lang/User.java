package com.chhitijbhattachan.tutorials.java.api.java_lang;
public class User {
 
    public long id;
    public String name;
    public String email;
 
    // standard getters/setters/constructors
    public User(long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return 1;
    }
         
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null) return false;
    //     if (this.getClass() != o.getClass()) return false;
    //     User user = (User) o;
    //     return id == user.id 
    //       && (name.equals(user.name) 
    //       && email.equals(user.email));
    // }
     
    // getters and setters here
}