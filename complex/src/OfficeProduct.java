import java.io.*;

public class OfficeProduct extends SoftwareProduct{
    public OfficeProduct(String n, String p) {
        super(n, p);
    }

    @Override
    public boolean checkCompatibility() {
        if(this.getPlatform().equalsIgnoreCase("Linux"))
            return true;
        return false;
    }

    @Override
    public void store(String file) throws FileNotFoundException {
        //TODO
        FileOutputStream outputFile=new FileOutputStream(file);
        //FileOutputStream outputFile=new FileOutputStream("info.txt", true); // to append at the end of the file
        OutputStreamWriter outputStream=new OutputStreamWriter(outputFile);
        PrintWriter pw=new PrintWriter(outputStream);
        pw.println("Office Product " +this.toString());
        pw.close();
    }

    @Override
    public void read(String file) throws IOException {
        //TODO
        FileInputStream inputFile = null;
        try {
            inputFile = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(inputFile);
            BufferedReader br = new BufferedReader(reader);
            String sCurrentLine = "";
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(SoftwareProduct o) {
        //TODO
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        //this optimization is usually worthwhile, and can
        //always be added
        if ( this == o )
            return EQUAL;
        //name, platform
        if(super.getPlatform().compareTo(o.getPlatform())!=EQUAL)
            return super.getPlatform().compareTo(o.getPlatform());
        //platform are equal
        if (this.getName().length() < o.getName().length())
            return BEFORE;
        if (this.getName().length() > o.getName().length())
            return AFTER;
        return EQUAL;
    }
}