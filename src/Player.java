public class Player {
    private String name;
    private int score;

    /*
         Player default constructor
     */
    public Player() {
        this.name = "";
        this.score = 0;
    }

    /*
        Player constructor that takes values for the variables as parameters
   */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    /*
        Copy constructor (DEEP COPY)
   */
    public Player(Player other) {
        this.name = new String(other.name);
        this.score = other.score;
    }
    /*
        Getter methods
   */

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    /*
        Setter methods
   */
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    /*
        createsClone method DEEP COPY
   */
    public Player createClone(){
        return new Player(this);
    }

}
