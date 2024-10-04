import java.io.*;
import java.util.ArrayList;
import java.util.List;

class fileDelete {
    public void deleteRecord(int idToDelete) {
        List<String> fileContent = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                if (id != idToDelete) {
                    fileContent.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter("data.txt")) {
            for (int i = 0; i < fileContent.size() - 1; i++) {
                fw.write(fileContent.get(i) + "\n");
            }
            fw.write(fileContent.get(fileContent.size() - 1));            
            System.out.println("Record deleted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
