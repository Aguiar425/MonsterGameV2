public class RandomNumber {

    public static int generateRandom(int max, int min) {
        return (int) (Math.random() * (max - min) + min); //should return a random number between min and max
    }
}
