package CreationalPattern.Builder;

/**
 * @author chenzhang
 * @date 2024/11/30 11:14
 */
public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        /**
         * 产品（Product）：要构建的复杂对象。产品类通常包含多个部分或属性。
         * 抽象建造者（Builder）：定义了构建产品的抽象接口，包括构建产品的各个部分的方法。
         * 具体建造者（Concrete Builder）：实现抽象建造者接口，具体确定如何构建产品的各个部分，并负责返回最终构建的产品。
         * 指导者（Director）：负责调用建造者的方法来构建产品，指导者并不了解具体的构建过程，只关心产品的构建顺序和方式。
         */
    }
}
