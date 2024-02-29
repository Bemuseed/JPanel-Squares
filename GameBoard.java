import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {
    private SquarePanel[][] squares; // Store references to squares

    public GameBoard() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Game Board");

        JPanel gamePanel = new JPanel(new GridLayout(8, 8)); // Adjust grid size as needed

        squares = new SquarePanel[8][8]; // Initialize the array

        // Populate the game board with squares
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Color color = (i + j) % 2 == 0 ? Color.WHITE : Color.BLACK; // Alternating colors for a checkerboard pattern
                SquarePanel square = new SquarePanel(color);
                squares[i][j] = square; // Store the reference to the square
                gamePanel.add(square);
            }
        }

        add(gamePanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Access a square and place a text label
        placeLabel(3, 4, "Hello"); // Example: place label "Hello" at row 3, column 4
    }

    private void placeLabel(int row, int col, String text) {
        SquarePanel square = squares[row][col];
        JLabel label = new JLabel(text);
        square.add(label); // Add the label to the square
        square.revalidate(); // Revalidate the square to reflect the changes
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameBoard::new);
    }
}
