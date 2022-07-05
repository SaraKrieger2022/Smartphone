public class Friend extends Contact{
    int phoneNumber;


    public Friend() {
    }

    public Friend(String name, int phoneNumber){
        super(name);
        this.phoneNumber = phoneNumber;
    }


        public String toString(String name, int phoneNumber){
            return name + " " + phoneNumber;
        }

}
