public class Duke {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    private String commandType;

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        commandType = input;
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
