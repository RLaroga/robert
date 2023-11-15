package StackLeaguePractice;

public class FoodDelivery {
    /**
     * STORY
     * Daryl is the The League of Programmers' New Errand Runner. His Hardest Job is to Deliver everyone's lunch.
     * Daryl is a Smart Guy and is honestly quite overqualified for the job.
     * Today is the CEO's Birthday so it means everyone will get a three-course meal for lunch.
     * As Daryl arrives at the lobby to receive the food he needs to deliver, he was met with a challenge.
     * Today he received three Trolleys worth of food.
     * Since he is smart he decided to wait for all the elevators to reach the ground floor at the same time.
     * How many seconds has he need to wait for atleast one elevator to reach the ground floor for him to hold its operation.
     * <p>
     * TASK
     * Complete the function Hold_the_Elevator which will accept 4 integer
     * which will represent each elevator's number of seconds to reach the top floor
     * and return to the ground floor and the time Daryl arrives at the Elevator's Waiting Area.
     * Output the number of seconds he has to wait until an elevator arrives at the gorund floor.
     * <p>
     * EXAMPLE
     * • Hold_the_Elevator(45, 56, 78, 2) => 43
     * • Hold_the_Elevator(6, 6, 4, 2) => 2
     * • Hold_the_Elevator(4, 2, 6, 4) => 0
     * • Hold_the_Elevator(56, 12, 34, 13) => 11
     */

    public static void main(String[] args) {

        System.out.println(Hold_the_Elevator(56,12,34,13));
        System.out.println(Hold_the_Elevator(6,2,4,4));

    }

    public static int Hold_the_Elevator(int elevator_1, int elevator_2, int elevator_3, int arrival) {

        int getElevatorSmallTime = Math.min(Math.min(elevator_1, elevator_2), elevator_3);
        int waitingTime = getElevatorSmallTime - arrival;

        return waitingTime < 0 ? waitingTime + getElevatorSmallTime : waitingTime;
    }
}
