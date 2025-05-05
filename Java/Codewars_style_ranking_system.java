public class Codewars_style_ranking_system {
    public int rank = -8;
    public int progress = 0;

    public void incProgress(int taskRank) {
        if (taskRank < -8 || taskRank > 8 || taskRank == 0) {
            throw new IllegalArgumentException("Invalid task rank");
        }
        if (taskRank > rank) {
            progress = progress + (10 * (normalize(taskRank) - normalize(rank)) * (normalize(taskRank) - normalize(rank)));
        } else if (normalize(taskRank) == normalize(rank) && rank != 8) {
            progress = progress + 3;
        } else if (normalize(taskRank) == normalize(rank) - 1 && rank != 8) {
            progress = progress + 1;
        }
        while (progress >= 100) {
            progress = progress - 100;
            levelUp();
        }
    }

    private void levelUp() {
        if (rank != 8) {
            rank = denormalize(normalize(rank) + 1);
            if (rank == 8) {
                progress = 0;
            }
        }
    }

    private int normalize(int number) {
        return number > 0 ? number + 8 : number +9;
    }

    private int denormalize(int number) {
        return number -8 > 0 ? number - 8 : number -9;
    }
}
