package Work_01;

public class Stuff {
    private int number;

    public Stuff(int number) {
        this.number = number;
    }

    public Stuff() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stuff stuff = (Stuff) o;

        return number == stuff.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
