package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Advisor Meeting - Nurbek");
        appointments.add("Course Planning - Aizada");
        appointments.add("Scholarship Review - Ermek");
        appointments.addFirst("URGENT: Academic Probation - Gulnura");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }

        System.out.println("First appointment: " + appointments.getFirst());
        System.out.println("Last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        System.out.println("Appointments:");
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
