/* Napisz program, w którym zasymulujesz hierarchię dziedziczenia zwierząt. Stwórz abstrakcyjną klasę Animal, po której będą dziedziczyły klasy Fish i Mammal. Wszystkie te klasy powinny być abstrakcyjne. 
Następnie stwórz konkretne klasy które dziedziczą po Fish i Mammal. Będą to odpowiednio Goldfish i Human.
*/

public class Main {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal fish = new Goldfish();

        System.out.println(human);
        System.out.println(fish);
    }
}
