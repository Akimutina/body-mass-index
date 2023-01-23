// Индекс массы тела измеряется в кг/м² и рассчитывается по формуле: ИМТ = m/h2, где:
//m — масса тела в килограммах,
//h — рост в метрах.


public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int weight = 60; //вес в кг
        int height = 170; //рост в см

        double BodyMassIndex = service.calculate(weight,height);
        System.out.printf("Индекс массы тела: ");
        System.out.printf("%8.2f", BodyMassIndex);
    }
}
