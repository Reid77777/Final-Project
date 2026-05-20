public class Main {
    private static Scanner scanner = new Scanner(System.in); 
    private static Player player;
    public static void main(String[] args) {

        Room office = new Room("Detective Office", "Your dark and cramped office smells of cigarette smoke.");
        Room crimeScene = new Room("Crime Scene", "A pale body lies beneath a flickering street lamp. Blood seeps out onto the cobblestone.");
        Room tavern = new Room("Nigeshville Tavern", "The tavern is busy and bustling. Conversations stop as you enter and turn into quiet murmurs.");
        Room alley = new Room("Bloodhound Alleyway", "A cold fog rolls through the narrow alley.");
        Room lair = new Room("Evil Lair", "Candles surround strange geometric symbols painted across the walls. There are ominous shadows dancing in the corners.");

        office.setExit("north", crimeScene);
        crimeScene.setExit("south", office);
        crimeScene.setExit("east", tavern);
        tavern.setExit("west", crimeScene);
        tavern.setExit("north", alley);
        alley.setExit("south", tavern);
        alley.setExit("east", lair);

        Item notebook = new Item("diary", "A worn leather diary that you keep your clues and notes in.");
        Item key = new Item("key", "A tiny brass key.");
        office.addItem(notebook);
        alley.addItem(key);
        player = new Player(office);

        System.out.println(" Detective Gandhi and the Hunt for the True Jerko ");
        System.out.println("Type 'help me' for commands.\n");
        gameLoop();

    }

    public static void gameLoop(){
         boolean playing = true;

        while (playing) {

            System.out.println("\nLocation: " + player.getCurrentRoom().getName());
            System.out.println(player.getCurrentRoom().getDescription());

            player.getCurrentRoom().showItems();

            System.out.print("\n> ");
            String input = scanner.nextLine().toLowerCase();

            String[] words = input.split(" ");
            String command = words[0];
    }
}