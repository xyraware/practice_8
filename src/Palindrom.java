public class Palindrom {
    String pal;
    public void check() {
        System.out.println(pal.equals((new StringBuilder(pal)).reverse().toString()));
    }

    public String getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = pal;
    }
}
