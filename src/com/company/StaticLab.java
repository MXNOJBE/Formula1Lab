package com.company;

public class StaticLab {

        // Static variable to store the current lap number
        static int currentLap = 0;

        // Static block to initialize the track layout
        static {
            TrackLayout.loadLayout();
        }

        // Static function to calculate the speed of a car
        static double calculateSpeed(double distance, double time)
        {

            return distance / time;
        }

        // Static nested class to represent a race event
        static class Event {
            String name;
            String location;

            Event(String name, String location) {
                this.name = name;
                this.location = location;
            }

            void printDetails() {
                System.out.println("Event: " + name);
                System.out.println("Location: " + location);
            }
        }

        public static void main(String[] args) {
            // Accessing the static variable
            System.out.println("Current lap: " + StaticLab.currentLap);

            // Calling the static function
            double speed = StaticLab.calculateSpeed(100, 10);
            System.out.println("Speed: " + speed);

            // Creating an instance of the static nested class
            StaticLab.Event raceEvent = new StaticLab.Event("Monaco Grand Prix", "Monte Carlo");
            raceEvent.printDetails();
        }
    }

    class TrackLayout {
        static void loadLayout() {
            System.out.println("Loading track layout...");
        }
    }

