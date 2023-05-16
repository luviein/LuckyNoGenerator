package sg.nus.iss.visa.ssf.day12practice1.Image;

public class Image {
    public String name;
    public String path;

    public Image() {
    }

    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public String toString() {
        return "Image [name=" + name + ", path=" + path + "]";
    }


}
