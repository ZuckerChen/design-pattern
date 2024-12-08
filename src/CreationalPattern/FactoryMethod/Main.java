package CreationalPattern.FactoryMethod;

/**
 * @author chenzhang
 * @date 2024/11/30 10:06
 */
public class Main {
    public static void main(String[] args) {
        Logistics logistics = LogisticsFactory.createLogistics("sea");
        if (logistics == null) {
            return;
        }
        logistics.planDelivery();
        /**
         * 例子：物流管理
         * 创建者:声明返回产品对象的工厂方法，同时包含与产品相关的核心逻辑
         *
         * Logistics-创建者，并非每次都需要创建新对象，可以是缓存、对象池或者其他来源
         * Transport-产品
         *
         * 松耦合、单一职责、开闭原则
         */
    }
}
