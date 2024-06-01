package consultation_16;


public abstract class FileSystem {
    String type;
    String title;

    public FileSystem(String type, String title) {
        this.type = type;
        this.title = title;

    }

    abstract void write();

    abstract void read();

    @Override
    public String toString() {
        return "FileSystem{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
    class LocalFileSystem extends FileSystem {
    public LocalFileSystem(String title){
        super("LocalFileSystem", title);

    }
    @Override
    void write() {
        System.out.println("record data in LocalFileSystem");
    }

    @Override
    void read() {
        System.out.println("read data in LocalFileSystem");
    }
}
    //LocalFileSystem
    //CloudFileSyste



class App{
    public static void main(String[] args) {
        FileSystem fs = new LocalFileSystem("MyBestFs");
        fs.write();
        fs.read();
        System.out.println(fs);
    }
}