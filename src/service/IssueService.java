package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Transcript correction", 3));
        issues.add(new Issue("Appeal grade decision", 2));
        issues.add(new Issue("Course registration blocked", 1));
        issues.add(new Issue("Financial aid clarification", 4));
        issues.add(new Issue("Exam conflict", 2));
    }

    public void showMostUrgent() {
        Issue mostUrgent = issues.peek();
        if (mostUrgent == null) {
            System.out.println("No issues available.");
            return;
        }
        System.out.println("Most urgent issue: " + mostUrgent);
    }

    public void resolveIssues() {
        if (!issues.isEmpty()) {
            issues.poll();
        }
        if (!issues.isEmpty()) {
            issues.poll();
        }
    }

    public void printRemainingIssues() {
        System.out.println("Remaining issues:");
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}
