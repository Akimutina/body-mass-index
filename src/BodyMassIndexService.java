public class BodyMassIndexService {
    public double calculate(int weight, int height) {
        double result = weight / (Math.pow((height * 0.01), 2));
        return result;
    }
}

