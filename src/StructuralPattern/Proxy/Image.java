package StructuralPattern.Proxy;

/**
 * @author chenzhang
 * @date 2024/11/30 14:52
 */
public interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display()
    {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading " + fileName);
    }
}


class ProxyImage implements Image {
    private RealImage realImage;
    private final String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
