package String;

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int startX = 0;
        int startY = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'U') startY++;
            else if (move == 'D') startY--;
            else if (move == 'R') startX++;
            else if (move == 'L') startX--;
        }
        return (startX == 0 && startY == 0);
    }
}
