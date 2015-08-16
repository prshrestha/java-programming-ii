
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
        
    public String getCountry(){
        return this.country;
    }
    
    public String getRegisterationCode(){
        return this.regCode;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate newPlate = (RegistrationPlate) object;

        if (!this.country.equals(newPlate.getCountry())) {
            return false;
        }

        if (this.regCode == null || !this.regCode.equals(newPlate.getRegisterationCode())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
}


