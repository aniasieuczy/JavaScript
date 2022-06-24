public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public int getAge () {
        return this.age;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {
        int invalid = 0;
        if ((age < 0) || (age > 100)) {
            age = invalid;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if ((age > 12) && (age < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName (){
        String fullName = firstName + " " + lastName;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return fullName;
        }
    }

}
