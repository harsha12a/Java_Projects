import java.io.*;

class fileWrite {
    public void createRecord(String data) {
        String lastLine = "";
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lastLine = line;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        int id = Integer.parseInt(lastLine.split(",")[0])+1;
        try (FileWriter fileWriter = new FileWriter("data.txt", true)) {
            String record = "\n" + id + ", " + data;
            fileWriter.write(record);
            System.out.println("Record added: " + record);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}