public abstract class SoftwareProduct implements Comparable<SoftwareProduct>, Storable {
    private String name, platform;


    //for all the classes which extend the abstract class,
    // you will call the constructor with super
    public SoftwareProduct(String n, String p){
        this.name = n;
        this.platform = p;
    }

    // + checkCompatibility() : boolean
    public abstract boolean checkCompatibility();

    public String getName(){
        return name;
    }

    public String getPlatform(){
        return platform;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setPlatform(String p){
        this.platform = p;

    }

    @Override
    public String toString() {
        return "SoftwareProduct{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
