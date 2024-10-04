import java.util.*;
class toDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A simple To Do list : \n");
        readFile fr = new readFile();
        fileWrite fw = new fileWrite();
        fileUpdate fu = new fileUpdate();
        fileDelete fd = new fileDelete();
        System.out.println("Enter 1 to add a new record : ");
        System.out.println("Enter 2 to update a record : ");
        System.out.println("Enter 3 to delete a record : ");
        System.out.println("Enter 4 to view all records : ");
        int val=sc.nextInt();
        sc.nextLine();
        switch (val) {
            case 1:
                String data = sc.nextLine();
                fw.createRecord(data);
                break;
            
            case 2:
                System.out.println("Enter the ID of the record you want to update : ");
                int idToUpdate = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the new name : ");
                String newName = sc.nextLine();
                fu.updateRecord(idToUpdate, newName);
                break;

            case 3:
                System.out.println("Enter the ID of the record you want to delete : ");
                int idToDelete = sc.nextInt();
                fd.deleteRecord(idToDelete);
                break;
            
            case 4:
                fr.readCon();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
    
}