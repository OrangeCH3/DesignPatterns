package pers.ditto.principle.singleresponsibility;

/**
 * @author OrangeCH3
 * @create 2021-07-06 16:44
 */

@SuppressWarnings("all")
public class SingleResponsibilityDittoo {

    public static void main(String[] args) {

        VehicleDitto vehicleDitto = new VehicleDitto();
        vehicleDitto.runRoad("雷诺");
        vehicleDitto.runAir("飞机");
        vehicleDitto.runWater("轮船");

    }

}

// 方式3
// 1. 这种修改方法没有对原来的类做大的修改，只是增加方法
// 2. 类上虽然没有执行单一职责，但是在方法上执行单一职责
class VehicleDitto {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路驰骋!");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中滑行!");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空翱翔!");
    }
}