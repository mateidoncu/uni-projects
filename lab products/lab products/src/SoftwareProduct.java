public abstract class SoftwareProduct {
    private String name, platform;

    public SoftwareProduct(String n, String p){
        this.name = n;
        this.platform = p;
    }

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

}
