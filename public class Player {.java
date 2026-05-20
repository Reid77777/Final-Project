public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    public Player (Room startingRoom) {
        currentRoom = startingRoom;
        inventory = new ArrayList<>();
}
public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        currentRoom = room;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }