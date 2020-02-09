import java.util.*;
public class NumberList implements Readable {
    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<Readable>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int howManyReadables() {
        return this.readables.size();
    }

    public String read() {
        String read = "";
        for(Readable readable: this.readables) {
            read += readable.read() + "\n";
        }
        System.out.println(read);

        this.readables.clear();
        return read;
    }
}
