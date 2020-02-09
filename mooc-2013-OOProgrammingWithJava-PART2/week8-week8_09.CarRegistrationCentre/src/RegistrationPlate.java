
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) obj;

        if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.getCountry())) {
            return false;
        }
        return true; 
    }
    
    public int hashCode() {
        if (this.regCode == null || this.country == null)  {
            return 7;
        }

        return this.regCode.hashCode() + this.country.hashCode();
    }
    
    

}
