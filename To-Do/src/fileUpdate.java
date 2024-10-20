import java.io.*;
import java.util.*;
class fileUpdate {
    public void updateRecord(int idToUpdate, String newName) {
        List<String> fileContent = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                if (id == idToUpdate) {
                    line = id + ", " + newName;
                }
                fileContent.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter("data.txt")) {
            for (String record : fileContent) {
                fw.write(record + "\n");
            }
            System.out.println("Record updated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
