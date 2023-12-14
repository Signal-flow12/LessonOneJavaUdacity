package exceptionExample;

public class Phone {
    String phoneType;
    String phoneNumber;

    public Phone (String phoneType, String phoneNumber) {
        if (phoneType == null || phoneNumber == null) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public void setPhoneNumber( String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("Phone type: " + phoneType +  "\n Phone number: " + phoneNumber);
    }


}
