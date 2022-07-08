package grails.auth

class Role {

    static constraints = {
    }

    // default field 
    String toString(){
        authority
    }
}
