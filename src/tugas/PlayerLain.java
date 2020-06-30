package tugas;

public class PlayerLain extends Player {
    String gender;
    String Pet;

    public void createPlayer () {
        super.createPlayer();
        System.out.print("Select Gender : ");
        gender = scanner.nextLine();
        System.out.print("Select Pet : ");
        Pet = scanner.nextLine();
    }
}
