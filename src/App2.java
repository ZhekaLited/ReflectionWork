public class App2 implements Iapp{

    public String name;
    public String getName() {
        return this.name;
    }
    public App2(int itr) {
        this.name = "This is name";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int Proc2() {
        return 10;
    }
}
