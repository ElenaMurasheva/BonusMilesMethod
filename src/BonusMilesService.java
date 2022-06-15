public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20; // Количество рублей для одной бонусной мили
        int miles = price / bonus; // Количество начисленных бонусных миль за купленный билет
        return miles;
    }
}
