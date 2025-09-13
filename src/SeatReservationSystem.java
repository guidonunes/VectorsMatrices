import java.util.Scanner;

public class SeatReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] roomSeats = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0}
        };

        System.out.println("Seat availability (F = Free, O = Occupied)");
        for(int i = 0; i < roomSeats.length; i++) {
            for(int j = 0; j < roomSeats[i].length; j ++) {
                System.out.print(roomSeats[i][j] == 0 ? "F " : "O ");
            }
            System.out.println(" <- Row " + (i + 1));
        }

        System.out.print("Choose a row: ");
        int row = scanner.nextInt() + 1;

        System.out.print("Choose a seat number: ");
        int seatNumber = scanner.nextInt() + 1;

        if(row >= 0 && row < roomSeats.length && seatNumber >= 0 && seatNumber < roomSeats[row].length) {
            if(roomSeats[row][seatNumber] == 0) {
                roomSeats[row][seatNumber] = 1;
                System.out.println("Seat successfuly booked!");
            } else {
                System.out.println("Seat not available, choose another one.");
            }
        } else {
            System.out.println("Invalid choice. Try again.");
        }

        scanner.close();
    }
}
