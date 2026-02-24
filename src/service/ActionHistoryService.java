package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");
    }

    public void undoLastAction() {
        if (!actions.isEmpty()) {
            actions.removeLast();
        }
    }

    public void addRequestedTranscript() {
        actions.add("Requested Transcript");
    }

    public void showFirstAndLast() {
        if (actions.isEmpty()) {
            System.out.println("No actions available.");
            return;
        }

        System.out.println("First action: " + actions.getFirst());
        System.out.println("Last action: " + actions.getLast());
    }

    public void printHistory() {
        System.out.println("Action history:");
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
