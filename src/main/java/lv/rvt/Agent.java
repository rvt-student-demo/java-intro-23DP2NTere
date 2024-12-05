package lv.rvt;

    public class Agent {

        private String firstname;
        private String lastname;
    

    public Agent (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public String toString() {
        return "My name is " + this.lastname + ", " + this.firstname + " " + this.lastname;
    }

}