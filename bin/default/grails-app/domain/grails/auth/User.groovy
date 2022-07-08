package grails.auth

class User {

    String fullname

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
        fullname nullable: false, blank: false
    }
}
