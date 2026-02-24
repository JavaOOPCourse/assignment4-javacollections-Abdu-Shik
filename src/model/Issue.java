package model;

public class Issue implements Comparable<Issue> {

    private String description;
    private int urgencyLevel; // 1 = most urgent

    public Issue(String description, int urgencyLevel) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    public String getDescription() {
        return description;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    @Override
    public int compareTo(Issue other) {
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }

    @Override
    public String toString() {
        return "Issue{description='" + description + "', urgencyLevel=" + urgencyLevel + "}";
    }
}
