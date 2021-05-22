
public class Literacy implements Comparable<Literacy> {

    private String country;
    private int year;
    private String gender;
    private double percent;

    public Literacy(String country, int year, String gender, double percent) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }

    @Override
    public int compareTo(Literacy o) {
        if (this.percent > o.getPercent()) {
            return 1;
        } else if (this.percent == o.getPercent()) {
            return 0;
        }
        return -1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double literacy) {
        this.percent = literacy;
    }

}
