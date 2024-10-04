import java.io.*;
class readFile {
    public void readCon(){
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            System.out.println("ID          Text");
            System.out.println("----------------------------------");
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                System.out.println(fields[0] + "     |      " + fields[1] );
            }
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}